package net.blockadile.lemon.item;

import net.blockadile.lemon.LemonTree;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Lemon Item
    public static final Item LEMON = registerItem("lemon", new Item(new Item.Settings().food(ModsFoodComponents.LEMON)));
    //Lime Item
    public static final Item LIME = registerItem("lime", new Item(new Item.Settings().food(ModsFoodComponents.LIME)));
    //Grapefruit
    public static final Item GRAPEFRUIT = registerItem("grapefruit", new Item(new Item.Settings().food(ModsFoodComponents.GRAPEFRUIT)));
    //Ice Cubes
    public static final Item ICE_CUBES = registerItem("ice_cubes", new Item(new Item.Settings().food(ModsFoodComponents.ICE_CUBES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LemonTree.MOD_ID, name), item);
    }


    public static void registerModItems() {
        LemonTree.LOGGER.info("Registering Mod Items for " + LemonTree.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(LEMON);
           fabricItemGroupEntries.add(LIME);
            fabricItemGroupEntries.add(GRAPEFRUIT);
           fabricItemGroupEntries.add(ICE_CUBES);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ICE_CUBES);
        });
    }
}
