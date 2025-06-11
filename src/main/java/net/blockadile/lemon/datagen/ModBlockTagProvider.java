package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                //green citrus
                .add(ModBlocks.GREEN_CITRUS_LOG)
                .add(ModBlocks.GREEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD)
                .add(ModBlocks.GREEN_CITRUS_PLANKS)
                //yellow citrus
                .add(ModBlocks.GOLDEN_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS)
                //green citrus
                .add(ModBlocks.GREEN_CITRUS_LOG)
                .add(ModBlocks.GREEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD)
                //yellow citrus
                .add(ModBlocks.GOLDEN_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.GREEN_CITRUS_PLANKS)
                .add(ModBlocks.GOLDEN_CITRUS_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.GREEN_CITRUS_STAIRS)
                .add(ModBlocks.GOLDEN_CITRUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.GREEN_CITRUS_SLAB)
                .add(ModBlocks.GOLDEN_CITRUS_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.GREEN_CITRUS_FENCE)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.GREEN_CITRUS_FENCE_GATE)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE);
    }
}
