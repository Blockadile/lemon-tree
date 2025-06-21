package net.blockadile.lemon.effects;

import net.blockadile.lemon.particle.ModParticles;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BrainFreeze extends StatusEffect {
    protected BrainFreeze(StatusEffectCategory category, int color) {
        super(category, color/*, ModParticles.BRAIN_FREEZE_PARTICLE*/);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setFrozenTicks(200);
        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}