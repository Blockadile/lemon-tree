package net.blockadile.lemon.item;

import net.minecraft.component.type.FoodComponent;

public class ModsFoodComponents {

    public static final FoodComponent LEMON = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent LIME = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent GRAPEFRUIT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.75f).build();
    public static final FoodComponent ICE_CUBES = new FoodComponent.Builder().nutrition(0).saturationModifier(0f).build();

}
