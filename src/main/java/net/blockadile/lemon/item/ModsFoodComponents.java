package net.blockadile.lemon.item;

import net.minecraft.component.type.FoodComponent;

public class ModsFoodComponents {

    public static final FoodComponent LEMON = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent LIME = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();

}
