package net.blockadile.lemon.item;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.item.custom.CombustibleLemon;
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
    //Combustible Lemon
    public static final Item COMBUSTIBLE_LEMON = registerItem("combustible_lemon",
        new CombustibleLemon(new Item.Settings()
        .maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LemonTree.MOD_ID, name), item);
    }


    public static void registerModItems() {
        LemonTree.LOGGER.info("Registering Mod Items for " + LemonTree.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(LEMON);
            fabricItemGroupEntries.add(LEMON_SLICE);
           fabricItemGroupEntries.add(LIME);
            fabricItemGroupEntries.add(LIME_SLICE);
            fabricItemGroupEntries.add(GRAPEFRUIT);
            fabricItemGroupEntries.add(GRAPEFRUIT_SLICE);
           fabricItemGroupEntries.add(ICE_CUBES);
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
