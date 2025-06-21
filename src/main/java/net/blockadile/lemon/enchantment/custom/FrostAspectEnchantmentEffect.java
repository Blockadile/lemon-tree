package net.blockadile.lemon.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.blockadile.lemon.effects.ModEffects;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record FrostAspectEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<FrostAspectEnchantmentEffect> CODEC = MapCodec.unit(FrostAspectEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity) {
            LivingEntity livingUser = (LivingEntity) user;
            livingUser.addStatusEffect(new StatusEffectInstance(
                    ModEffects.BRAIN_FREEZE,
                    140*level,
                    Math.max(0, level - 1),
                    false,
                    true
            ));
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
