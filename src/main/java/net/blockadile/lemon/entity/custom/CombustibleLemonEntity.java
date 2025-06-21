package net.blockadile.lemon.entity.custom;

import net.blockadile.lemon.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class CombustibleLemonEntity extends ThrownItemEntity {
    public CombustibleLemonEntity(EntityType<? extends CombustibleLemonEntity> entityType, World world) {
        super(entityType, world);
    }

    public CombustibleLemonEntity(World world, LivingEntity owner) {
        super(EntityType.SNOWBALL, owner, world);
    }

    public CombustibleLemonEntity(World world, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.COMBUSTIBLE_LEMON;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            if (hitResult.getType() == HitResult.Type.BLOCK || hitResult.getType() == HitResult.Type.ENTITY) {
                if (!getBlockStateAtPos().isLiquid())
                    this.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 1.66f, World.ExplosionSourceType.MOB);
            }
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.discard();
        }

    }

}


