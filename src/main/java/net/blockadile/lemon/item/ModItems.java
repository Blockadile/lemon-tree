package net.blockadile.lemon.item;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.item.custom.CombustibleLemon;
import net.blockadile.lemon.item.custom.Drink;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Lemon Item
    public static final Item LEMON = registerItem("lemon", new Item(new Item.Settings().food(ModsFoodComponents.LEMON)));
    public static final Item LEMON_SLICE = registerItem("lemon_slice", new Item(new Item.Settings().food(ModsFoodComponents.LEMON_SLICE)));
    //Lime Item
    public static final Item LIME = registerItem("lime", new Item(new Item.Settings().food(ModsFoodComponents.LIME)));
    public static final Item LIME_SLICE = registerItem("lime_slice", new Item(new Item.Settings().food(ModsFoodComponents.LIME_SLICE)));
    //Grapefruit
    public static final Item GRAPEFRUIT = registerItem("grapefruit", new Item(new Item.Settings().food(ModsFoodComponents.GRAPEFRUIT)));
    public static final Item GRAPEFRUIT_SLICE = registerItem("grapefruit_slice", new Item(new Item.Settings().food(ModsFoodComponents.GRAPEFRUIT_SLICE)));
    //Ice Cubes
    public static final Item ICE_CUBES = registerItem("ice_cubes", new Item(new Item.Settings().food(ModsFoodComponents.ICE_CUBES)));
    //Cream Cheese
    public static final Item CREAM_CHEESE = registerItem("cream_cheese", new Item(new Item.Settings().food(ModsFoodComponents.CREAM_CHEESE)));
    //Combustible Lemon
    public static final Item COMBUSTIBLE_LEMON = registerItem("combustible_lemon",
        new CombustibleLemon(new Item.Settings()
        .maxCount(16)));
    //Lemonade
    public static final Item LEMONADE = registerItem("lemonade",
            new Drink(new Item.Settings().food(ModsFoodComponents.LEMONADE).maxCount(16)));
    //Lime water
    public static final Item LIME_WATER = registerItem("lime_water",
            new Drink(new Item.Settings().food(ModsFoodComponents.LIME_WATER).maxCount(16)));
    //Pink Lemonade
    public static final Item PINK_LEMONADE = registerItem("pink_lemonade",
            new Drink(new Item.Settings().food(ModsFoodComponents.PINK_LEMONADE).maxCount(16)));
    //Lemon Delight
    public static final Item LEMON_DELIGHT = registerItem("lemon_delight", new Item(new Item.Settings().food(ModsFoodComponents.LEMON_DELIGHT)));
    //Lemon Pie
    public static final Item LEMON_PIE = registerItem("lemon_pie", new Item(new Item.Settings().food(ModsFoodComponents.LEMON_PIE)));
    //Lemon bar
    public static final Item LEMON_BAR = registerItem("lemon_bar", new Item(new Item.Settings().food(ModsFoodComponents.LEMON_BAR)));
    //Key Lime Pie
    public static final Item KEY_LIME_PIE = registerItem("key_lime_pie", new Item(new Item.Settings().food(ModsFoodComponents.KEY_LIME_PIE)));
    //Lime cake
    public static final Item LIME_CAKE = registerItem("lime_cake", new Item(new Item.Settings().food(ModsFoodComponents.LIME_CAKE)));
    //Lime Bar
    public static final Item LIME_BAR = registerItem("lime_bar", new Item(new Item.Settings().food(ModsFoodComponents.LIME_BAR)));
    //Grapefruit cupcake
    public static final Item GRAPEFRUIT_CUPCAKES = registerItem("grapefruit_cupcakes", new Item(new Item.Settings()
            .food(ModsFoodComponents.GRAPEFRUIT_CUPCAKES)));
    //Grapefruit tart
    public static final Item GRAPEFRUIT_TART = registerItem("grapefruit_tart", new Item(new Item.Settings().food(ModsFoodComponents.GRAPEFRUIT_TART)));
    //Grapefruit bar
    public static final Item GRAPEFRUIT_BAR = registerItem("grapefruit_bar", new Item(new Item.Settings().food(ModsFoodComponents.GRAPEFRUIT_BAR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LemonTree.MOD_ID, name), item);
    }


    public static void registerModItems() {
        LemonTree.LOGGER.info("Registering Mod Items for " + LemonTree.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ICE_CUBES);
            fabricItemGroupEntries.add(CREAM_CHEESE);
            fabricItemGroupEntries.add(LEMON);
            fabricItemGroupEntries.add(LEMON_SLICE);
            fabricItemGroupEntries.add(LIME);
            fabricItemGroupEntries.add(LIME_SLICE);
            fabricItemGroupEntries.add(GRAPEFRUIT);
            fabricItemGroupEntries.add(GRAPEFRUIT_SLICE);
            fabricItemGroupEntries.add(LEMONADE);
            fabricItemGroupEntries.add(LEMON_DELIGHT);
            fabricItemGroupEntries.add(LEMON_PIE);
            fabricItemGroupEntries.add(LEMON_BAR);
            fabricItemGroupEntries.add(LIME_WATER);
            fabricItemGroupEntries.add(KEY_LIME_PIE);
            fabricItemGroupEntries.add(LIME_CAKE);
            fabricItemGroupEntries.add(LIME_BAR);
            fabricItemGroupEntries.add(PINK_LEMONADE);
            fabricItemGroupEntries.add(GRAPEFRUIT_CUPCAKES);
            fabricItemGroupEntries.add(GRAPEFRUIT_TART);
            fabricItemGroupEntries.add(GRAPEFRUIT_BAR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ICE_CUBES);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COMBUSTIBLE_LEMON);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COMBUSTIBLE_LEMON);
        });
    }
}
