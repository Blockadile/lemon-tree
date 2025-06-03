package net.blockadile.lemon.block;

import net.blockadile.lemon.LemonTree;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

        //Green Citrus wood-set
    //Log
    public static final Block GREEN_CITRUS_LOG = registerBlock("green_citrus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    //Wood
    public static final Block GREEN_CITRUS_WOOD = registerBlock("green_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    //Stripped Log
    public static final Block STRIPPED_GREEN_CITRUS_LOG = registerBlock("stripped_green_citrus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Stripped Wood
    public static final Block STRIPPED_GREEN_CITRUS_WOOD = registerBlock("stripped_green_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    //Planks
    public static final Block GREEN_CITRUS_PLANKS = registerBlock("green_citrus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LemonTree.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LemonTree.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

        LemonTree.LOGGER.info("Registering Mod Blocks for " + LemonTree.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_PLANKS);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_LOG);
            //lemonwood leaves
        });
    }
}
