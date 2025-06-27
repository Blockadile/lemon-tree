package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.blockadile.lemon.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.PINK_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.PINK_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.GREEN_CITRUS_PLANKS.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_PLANKS.asItem())
                .add(ModBlocks.PINK_CITRUS_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.GREEN_CITRUS_STAIRS.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_STAIRS.asItem())
                .add(ModBlocks.PINK_CITRUS_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.GREEN_CITRUS_SLAB.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_SLAB.asItem())
                .add(ModBlocks.PINK_CITRUS_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.GREEN_CITRUS_FENCE.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_FENCE.asItem())
                .add(ModBlocks.PINK_CITRUS_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.GREEN_CITRUS_FENCE_GATE.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE.asItem())
                .add(ModBlocks.PINK_CITRUS_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.GREEN_CITRUS_DOOR.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_DOOR.asItem())
                .add(ModBlocks.PINK_CITRUS_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.GREEN_CITRUS_TRAPDOOR.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_TRAPDOOR.asItem())
                .add(ModBlocks.PINK_CITRUS_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.GREEN_CITRUS_PRESSURE_PLATE.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PINK_CITRUS_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.GREEN_CITRUS_BUTTON.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_BUTTON.asItem())
                .add(ModBlocks.PINK_CITRUS_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.LIME_LEAVES.asItem())
                .add(ModBlocks.BUDDING_LIME_LEAVES.asItem())
                .add(ModBlocks.LEMON_LEAVES.asItem())
                .add(ModBlocks.BUDDING_LEMON_LEAVES.asItem())
                .add(ModBlocks.GRAPEFRUIT_LEAVES.asItem())
                .add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.LIME_SAPLING.asItem())
                .add(ModBlocks.LEMON_SAPLING.asItem())
                .add(ModBlocks.GRAPEFRUIT_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(ModBlocks.PINK_HYDRANGEA.asItem())
                .add(ModBlocks.BIG_PINK_HYDRANGEA.asItem())
                .add(ModBlocks.ORANGE_HYDRANGEA.asItem())
                .add(ModBlocks.BIG_ORANGE_HYDRANGEA.asItem())
                .add(ModBlocks.YELLOW_HYDRANGEA.asItem())
                .add(ModBlocks.BIG_YELLOW_HYDRANGEA.asItem());

        getOrCreateTagBuilder(ModTags.items.GREEN_CITRUS_LOGS)
                .add(ModBlocks.GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GREEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.items.GOLDEN_CITRUS_LOGS)
                .add(ModBlocks.GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.GOLDEN_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.items.PINK_CITRUS_LOGS)
                .add(ModBlocks.PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.PINK_CITRUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD.asItem());
    }
}
