package net.blockadile.lemon.item;

import net.blockadile.lemon.effects.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModsFoodComponents {

    public static final FoodComponent LEMON = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodComponent LEMON_SLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent LIME = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent LIME_SLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent GRAPEFRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.55f).build();
    public static final FoodComponent GRAPEFRUIT_SLICE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.45f).build();
    public static final FoodComponent ICE_CUBES = new FoodComponent.Builder().nutrition(0).saturationModifier(0f).build();
    public static final FoodComponent CREAM_CHEESE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent LEMON_BAR = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f).build();
    public static final FoodComponent LIME_BAR = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f).build();
    public static final FoodComponent GRAPEFRUIT_BAR = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f).build();

    public static final FoodComponent LEMONADE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300, 0), 0.75F).build();
    public static final FoodComponent LIME_WATER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.FROST_RESISTANCE, 300, 0), 0.80F).build();
    public static final FoodComponent PINK_LEMONADE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0), 0.75F)
            .statusEffect(new StatusEffectInstance(ModEffects.FROST_RESISTANCE, 200, 0), 0.75F).build();
    public static final FoodComponent LEMON_DELIGHT = new FoodComponent.Builder().nutrition(10).saturationModifier(0.60f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.25F).build();
    public static final FoodComponent LEMON_PIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.30f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.10F).build();
    public static final FoodComponent KEY_LIME_PIE = new FoodComponent.Builder().nutrition(9).saturationModifier(0.40f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0), 0.30F).build();
    public static final FoodComponent GRAPEFRUIT_CUPCAKES = new FoodComponent.Builder().nutrition(9).saturationModifier(0.30f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 0.25F).build();
    public static final FoodComponent GRAPEFRUIT_TART = new FoodComponent.Builder().nutrition(8).saturationModifier(0.30f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 0.15F).build();

}
