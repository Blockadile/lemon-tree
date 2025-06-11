package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.GREEN_CITRUS_PLANKS.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.GREEN_CITRUS_STAIRS.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.GREEN_CITRUS_SLAB.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.GREEN_CITRUS_FENCE.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_FENCE.asItem());
    }
}
