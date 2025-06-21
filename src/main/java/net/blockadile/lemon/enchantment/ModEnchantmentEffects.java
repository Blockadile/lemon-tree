package net.blockadile.lemon.enchantment;

import com.mojang.serialization.MapCodec;
import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.enchantment.custom.FrostAspectEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEnchantmentEffects {

    public static final MapCodec<? extends EnchantmentEntityEffect> FROST_ASPECT =
            registerEntityEffect("frost_aspect", FrostAspectEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name, MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(LemonTree.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        LemonTree.LOGGER.info("Registering Mod Enchantment Effects for " + LemonTree.MOD_ID);
    }
}
