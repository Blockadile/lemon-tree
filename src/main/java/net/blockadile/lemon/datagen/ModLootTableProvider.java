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
    }
}
