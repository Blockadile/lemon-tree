package net.blockadile.lemon.effects;

import net.blockadile.lemon.LemonTree;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> FROST_RESISTANCE = registerStatusEffect("frost_resistance",
            new FrostResistance(StatusEffectCategory.BENEFICIAL, 0x72D2E5));
    public static final RegistryEntry<StatusEffect> BRAIN_FREEZE = registerStatusEffect("brain_freeze",
            new BrainFreeze(StatusEffectCategory.HARMFUL, 0x72D2E5));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(LemonTree.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        LemonTree.LOGGER.info("Registering Mod Effects for " + LemonTree.MOD_ID);
    }
}
