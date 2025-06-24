package net.blockadile.lemon.block;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.block.custom.*;
import net.blockadile.lemon.world.tree.ModSaplingGenerators;
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
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Planks
    public static final Block GREEN_CITRUS_PLANKS = registerBlock("green_citrus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //Stairs
    public static final Block GREEN_CITRUS_STAIRS = registerBlock("green_citrus_stairs",
            new StairsBlock(ModBlocks.GREEN_CITRUS_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    //Slab
    public static final Block GREEN_CITRUS_SLAB = registerBlock("green_citrus_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    //Fence
    public static final Block GREEN_CITRUS_FENCE = registerBlock("green_citrus_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    //Fence Gate
    public static final Block GREEN_CITRUS_FENCE_GATE = registerBlock("green_citrus_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)));
    //Door
    public static final Block GREEN_CITRUS_DOOR = registerBlock("green_citrus_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copy(Blocks.OAK_DOOR).nonOpaque()));
    //Trapdoor
    public static final Block GREEN_CITRUS_TRAPDOOR = registerBlock("green_citrus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).nonOpaque()));
    //Pressure Plate
    public static final Block GREEN_CITRUS_PRESSURE_PLATE = registerBlock("green_citrus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)));
    //Button
    public static final Block GREEN_CITRUS_BUTTON = registerBlock("green_citrus_button",
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision()));

        //Yellow Citrus wood-set
    //Log
        public static final Block GOLDEN_CITRUS_LOG = registerBlock("golden_citrus_log",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    //Wood
    public static final Block GOLDEN_CITRUS_WOOD = registerBlock("golden_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    //Stripped Log
    public static final Block STRIPPED_GOLDEN_CITRUS_LOG = registerBlock("stripped_golden_citrus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Stripped Wood
    public static final Block STRIPPED_GOLDEN_CITRUS_WOOD = registerBlock("stripped_golden_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Planks
    public static final Block GOLDEN_CITRUS_PLANKS = registerBlock("golden_citrus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //Stairs
    public static final Block GOLDEN_CITRUS_STAIRS = registerBlock("golden_citrus_stairs",
            new StairsBlock(ModBlocks.GOLDEN_CITRUS_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    //Slab
    public static final Block GOLDEN_CITRUS_SLAB = registerBlock("golden_citrus_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    //Fence
    public static final Block GOLDEN_CITRUS_FENCE = registerBlock("golden_citrus_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    //Fence Gate
    public static final Block GOLDEN_CITRUS_FENCE_GATE = registerBlock("golden_citrus_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)));
    //Door
    public static final Block GOLDEN_CITRUS_DOOR = registerBlock("golden_citrus_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .strength(3f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ));
    //Trapdoor
    public static final Block GOLDEN_CITRUS_TRAPDOOR = registerBlock("golden_citrus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .strength(3f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ));
    //Pressure Plate
    public static final Block GOLDEN_CITRUS_PRESSURE_PLATE = registerBlock("golden_citrus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)));
    //Button
    public static final Block GOLDEN_CITRUS_BUTTON = registerBlock("golden_citrus_button",
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision()));

        //Pink Citrus wood-set
    //Log
    public static final Block PINK_CITRUS_LOG = registerBlock("pink_citrus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    //Wood
    public static final Block PINK_CITRUS_WOOD = registerBlock("pink_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    //Stripped Log
    public static final Block STRIPPED_PINK_CITRUS_LOG = registerBlock("stripped_pink_citrus_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Stripped Wood
    public static final Block STRIPPED_PINK_CITRUS_WOOD = registerBlock("stripped_pink_citrus_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    //Planks
    public static final Block PINK_CITRUS_PLANKS = registerBlock("pink_citrus_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //Stairs
    public static final Block PINK_CITRUS_STAIRS = registerBlock("pink_citrus_stairs",
            new StairsBlock(ModBlocks.GOLDEN_CITRUS_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    //Slab
    public static final Block PINK_CITRUS_SLAB = registerBlock("pink_citrus_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    //Fence
    public static final Block PINK_CITRUS_FENCE = registerBlock("pink_citrus_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    //Fence Gate
    public static final Block PINK_CITRUS_FENCE_GATE = registerBlock("pink_citrus_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)));
    //Door
    public static final Block PINK_CITRUS_DOOR = registerBlock("pink_citrus_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .strength(3f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ));
    //Trapdoor
    public static final Block PINK_CITRUS_TRAPDOOR = registerBlock("pink_citrus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .strength(3f, 3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ));
    //Pressure Plate
    public static final Block PINK_CITRUS_PRESSURE_PLATE = registerBlock("pink_citrus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)));
    //Button
    public static final Block PINK_CITRUS_BUTTON = registerBlock("pink_citrus_button",
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision()));


    //Leaves
    public static final Block LIME_LEAVES = registerBlock("lime_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BUDDING_LIME_LEAVES = registerBlock("budding_lime_leaves",
            new BuddingLimeLeaves(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().ticksRandomly()));
    public static final Block LEMON_LEAVES = registerBlock("lemon_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BUDDING_LEMON_LEAVES = registerBlock("budding_lemon_leaves",
            new BuddingLemonLeaves(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().ticksRandomly()));
    public static final Block GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BUDDING_GRAPEFRUIT_LEAVES = registerBlock("budding_grapefruit_leaves",
            new BuddingGrapefruitLeaves(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().ticksRandomly()));


    //Saplings
    public static final Block LIME_SAPLING = registerBlock("lime_sapling",
            new SaplingBlock(ModSaplingGenerators.LIME_TREE, FabricBlockSettings.copy(Blocks.OAK_SAPLING)));
    public static final Block LEMON_SAPLING = registerBlock("lemon_sapling",
            new SaplingBlock(ModSaplingGenerators.LEMON_TREE, FabricBlockSettings.copy(Blocks.OAK_SAPLING)));
    public static final Block GRAPEFRUIT_SAPLING = registerBlock("grapefruit_sapling",
            new SaplingBlock(ModSaplingGenerators.GRAPEFRUIT_TREE, FabricBlockSettings.copy(Blocks.OAK_SAPLING)));


    //Hydrangeas
    public static final TallFlowerBlock PINK_HYDRANGEA = (TallFlowerBlock) registerBlock("pink_hydrangea",
            new Hydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));
    public static final TallFlowerBlock BIG_PINK_HYDRANGEA = (TallFlowerBlock) registerBlock("big_pink_hydrangea",
            new BigHydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));
    public static final TallFlowerBlock ORANGE_HYDRANGEA = (TallFlowerBlock) registerBlock("orange_hydrangea",
            new Hydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));
    public static final TallFlowerBlock BIG_ORANGE_HYDRANGEA = (TallFlowerBlock) registerBlock("big_orange_hydrangea",
            new BigHydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));
    public static final TallFlowerBlock YELLOW_HYDRANGEA = (TallFlowerBlock) registerBlock("yellow_hydrangea",
            new Hydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));
    public static final TallFlowerBlock BIG_YELLOW_HYDRANGEA = (TallFlowerBlock) registerBlock("big_yellow_hydrangea",
            new BigHydrangea(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()));


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
            //green citrus
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_SLAB);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_FENCE);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_FENCE_GATE);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_DOOR);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_BUTTON);
            //yellow citrus
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_SLAB);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_FENCE);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_DOOR);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_BUTTON);
            //pink citrus
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_PINK_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_SLAB);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_FENCE);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_FENCE_GATE);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_DOOR);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_BUTTON);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.GREEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.LIME_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.BUDDING_LIME_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.GOLDEN_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.LEMON_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.BUDDING_LEMON_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.PINK_CITRUS_LOG);
            fabricItemGroupEntries.add(ModBlocks.GRAPEFRUIT_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES);

            fabricItemGroupEntries.add(ModBlocks.LIME_SAPLING);
            fabricItemGroupEntries.add(ModBlocks.LEMON_SAPLING);
            fabricItemGroupEntries.add(ModBlocks.GRAPEFRUIT_SAPLING);

            fabricItemGroupEntries.add(ModBlocks.PINK_HYDRANGEA);
            fabricItemGroupEntries.add(ModBlocks.BIG_PINK_HYDRANGEA);
            fabricItemGroupEntries.add(ModBlocks.ORANGE_HYDRANGEA);
            fabricItemGroupEntries.add(ModBlocks.BIG_ORANGE_HYDRANGEA);
            fabricItemGroupEntries.add(ModBlocks.YELLOW_HYDRANGEA);
            fabricItemGroupEntries.add(ModBlocks.BIG_YELLOW_HYDRANGEA);
        });
    }
}
