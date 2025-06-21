package net.blockadile.lemon.enchantment;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.enchantment.custom.FrostAspectEnchantmentEffect;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final RegistryKey<Enchantment> FROST_ASPECT =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LemonTree.MOD_ID, "frost_aspect"));
    public static void bootstrap(Registerable<Enchantment> registerable) {
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, FROST_ASPECT, Enchantment.builder(Enchantment.definition(
            items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
            items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
            5,
            2,
            Enchantment.leveledCost(5, 7),
            Enchantment.leveledCost(25, 9),
            2,
            AttributeModifierSlot.MAINHAND))
                .addEffect(
                        EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER,
                        EnchantmentEffectTarget.VICTIM,
                        new FrostAspectEnchantmentEffect()
                )
        );
    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}
