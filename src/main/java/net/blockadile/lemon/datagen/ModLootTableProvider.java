package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GREEN_CITRUS_LOG);
        addDrop(ModBlocks.GREEN_CITRUS_WOOD);
        addDrop(ModBlocks.STRIPPED_GREEN_CITRUS_LOG);
        addDrop(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD);

        addDrop(ModBlocks.GREEN_CITRUS_PLANKS);
        addDrop(ModBlocks.GREEN_CITRUS_STAIRS);
        addDrop(ModBlocks.GREEN_CITRUS_SLAB, slabDrops(ModBlocks.GREEN_CITRUS_SLAB));
        addDrop(ModBlocks.GREEN_CITRUS_FENCE);
        addDrop(ModBlocks.GREEN_CITRUS_FENCE_GATE);

        addDrop(ModBlocks.GOLDEN_CITRUS_LOG);
        addDrop(ModBlocks.GOLDEN_CITRUS_WOOD);
        addDrop(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG);
        addDrop(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD);

        addDrop(ModBlocks.GOLDEN_CITRUS_PLANKS);
        addDrop(ModBlocks.GOLDEN_CITRUS_STAIRS);
        addDrop(ModBlocks.GOLDEN_CITRUS_SLAB, slabDrops(ModBlocks.GOLDEN_CITRUS_SLAB));
        addDrop(ModBlocks.GOLDEN_CITRUS_FENCE);
        addDrop(ModBlocks.GOLDEN_CITRUS_FENCE_GATE);
        addDrop(ModBlocks.GOLDEN_CITRUS_DOOR, doorDrops(ModBlocks.GOLDEN_CITRUS_DOOR));
        addDrop(ModBlocks.GOLDEN_CITRUS_TRAPDOOR);

        addDrop(ModBlocks.PINK_CITRUS_LOG);
        addDrop(ModBlocks.PINK_CITRUS_WOOD);
        addDrop(ModBlocks.STRIPPED_PINK_CITRUS_LOG);
        addDrop(ModBlocks.STRIPPED_PINK_CITRUS_WOOD);

        addDrop(ModBlocks.PINK_CITRUS_PLANKS);
        addDrop(ModBlocks.PINK_CITRUS_STAIRS);
        addDrop(ModBlocks.PINK_CITRUS_SLAB, slabDrops(ModBlocks.PINK_CITRUS_SLAB));
        addDrop(ModBlocks.PINK_CITRUS_FENCE);
        addDrop(ModBlocks.PINK_CITRUS_FENCE_GATE);
        addDrop(ModBlocks.PINK_CITRUS_DOOR, doorDrops(ModBlocks.PINK_CITRUS_DOOR));
        addDrop(ModBlocks.PINK_CITRUS_TRAPDOOR);


        addDrop(ModBlocks.LIME_SAPLING);
        addDrop(ModBlocks.LEMON_SAPLING);
        addDrop(ModBlocks.GRAPEFRUIT_SAPLING);


        addDrop(ModBlocks.LANTERN_HEARTS);


        addDrop(ModBlocks.PINK_HYDRANGEA, doorDrops(ModBlocks.PINK_HYDRANGEA));
        addDrop(ModBlocks.BIG_PINK_HYDRANGEA, doorDrops(ModBlocks.BIG_PINK_HYDRANGEA));
        addDrop(ModBlocks.ORANGE_HYDRANGEA, doorDrops(ModBlocks.ORANGE_HYDRANGEA));
        addDrop(ModBlocks.BIG_ORANGE_HYDRANGEA, doorDrops(ModBlocks.BIG_ORANGE_HYDRANGEA));
        addDrop(ModBlocks.YELLOW_HYDRANGEA, doorDrops(ModBlocks.YELLOW_HYDRANGEA));
        addDrop(ModBlocks.BIG_YELLOW_HYDRANGEA, doorDrops(ModBlocks.BIG_YELLOW_HYDRANGEA));


        addDrop(ModBlocks.LIME_LEAVES, leavesDrops(ModBlocks.LIME_LEAVES, ModBlocks.LIME_SAPLING, 0.0625F));
        addDrop(ModBlocks.BUDDING_LIME_LEAVES, leavesDrops(ModBlocks.BUDDING_LIME_LEAVES, ModBlocks.LIME_SAPLING, 0.0625F));
        addDrop(ModBlocks.LEMON_LEAVES, leavesDrops(ModBlocks.LEMON_LEAVES, ModBlocks.LEMON_SAPLING, 0.0625F));
        addDrop(ModBlocks.BUDDING_LEMON_LEAVES, leavesDrops(ModBlocks.BUDDING_LEMON_LEAVES, ModBlocks.LEMON_SAPLING, 0.0625F));
        addDrop(ModBlocks.GRAPEFRUIT_LEAVES, leavesDrops(ModBlocks.GRAPEFRUIT_LEAVES, ModBlocks.GRAPEFRUIT_SAPLING, 0.0625F));
        addDrop(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES, leavesDrops(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES, ModBlocks.GRAPEFRUIT_SAPLING, 0.0625F));
    }
}
