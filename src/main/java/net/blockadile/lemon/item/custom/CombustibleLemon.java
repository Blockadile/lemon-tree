package net.blockadile.lemon.item.custom;

import net.blockadile.lemon.entity.custom.CombustibleLemonEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class CombustibleLemon extends Item implements ProjectileItem {
    public CombustibleLemon(Item.Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        PlayerEntity temp = (PlayerEntity) user;
        temp.getItemCooldownManager().set(this, 30);
        float speed = (100F-remainingUseTicks)/100F;
        if (speed > 1F){
            speed = 1F;
        } else if (speed<0.75F) {
            speed = 0.75F;
        }
        if (!world.isClient()) {
            CombustibleLemonEntity combustibleLemonEntity = new CombustibleLemonEntity(world, user);
            combustibleLemonEntity.setItem(user.getStackInHand(user.getActiveHand()));
            world.playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F);
            combustibleLemonEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, speed, 1.0F);
            world.spawnEntity(combustibleLemonEntity);
            if (!user.isInCreativeMode())
                user.getStackInHand(user.getActiveHand()).decrement(1);
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity temp = (PlayerEntity) user;
        temp.getItemCooldownManager().set(this, 60);
        user.getWorld().createExplosion(null, user.getX(), user.getY(), user.getZ(), 1.66f, World.ExplosionSourceType.MOB);
        if (!user.isInCreativeMode())
            user.getStackInHand(user.getActiveHand()).decrement(1);
        return stack;
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        CombustibleLemonEntity combustibleLemonEntity = new CombustibleLemonEntity(world, pos.getX(), pos.getY(), pos.getZ());
        return combustibleLemonEntity;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.SPEAR;
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        super.usageTick(world, user, stack, remainingUseTicks);
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 100;
    }
}
