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
                .add(ModBlocks.GREEN_CITRUS_FENCE)
                .add(ModBlocks.GREEN_CITRUS_FENCE_GATE)
                .add(ModBlocks.GREEN_CITRUS_DOOR)
                .add(ModBlocks.GREEN_CITRUS_TRAPDOOR)
                .add(ModBlocks.GREEN_CITRUS_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_CITRUS_BUTTON)
                //yellow citrus
                .add(ModBlocks.GOLDEN_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.GOLDEN_CITRUS_PLANKS)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE)
                .add(ModBlocks.GOLDEN_CITRUS_DOOR)
                .add(ModBlocks.GOLDEN_CITRUS_TRAPDOOR)
                .add(ModBlocks.GOLDEN_CITRUS_PRESSURE_PLATE)
                .add(ModBlocks.GOLDEN_CITRUS_BUTTON)
                //pink citrus
                .add(ModBlocks.PINK_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD)
                .add(ModBlocks.PINK_CITRUS_PLANKS)
                .add(ModBlocks.PINK_CITRUS_FENCE)
                .add(ModBlocks.PINK_CITRUS_FENCE_GATE)
                .add(ModBlocks.PINK_CITRUS_DOOR)
                .add(ModBlocks.PINK_CITRUS_TRAPDOOR)
                .add(ModBlocks.PINK_CITRUS_PRESSURE_PLATE)
                .add(ModBlocks.PINK_CITRUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                //green citrus
                .add(ModBlocks.GREEN_CITRUS_LOG)
                .add(ModBlocks.GREEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD)
                //yellow citrus
                .add(ModBlocks.GOLDEN_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD)
                //pink citrus
                .add(ModBlocks.PINK_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD);
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
                .add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD)
                //pink citrus
                .add(ModBlocks.PINK_CITRUS_LOG)
                .add(ModBlocks.GOLDEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.GREEN_CITRUS_PLANKS)
                .add(ModBlocks.GOLDEN_CITRUS_PLANKS)
                .add(ModBlocks.PINK_CITRUS_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.GREEN_CITRUS_STAIRS)
                .add(ModBlocks.GOLDEN_CITRUS_STAIRS)
                .add(ModBlocks.PINK_CITRUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.GREEN_CITRUS_SLAB)
                .add(ModBlocks.GOLDEN_CITRUS_SLAB)
                .add(ModBlocks.PINK_CITRUS_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.GREEN_CITRUS_FENCE)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE)
                .add(ModBlocks.PINK_CITRUS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.GREEN_CITRUS_FENCE_GATE)
                .add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE)
                .add(ModBlocks.PINK_CITRUS_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.GREEN_CITRUS_DOOR)
                .add(ModBlocks.GOLDEN_CITRUS_DOOR)
                .add(ModBlocks.PINK_CITRUS_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.GREEN_CITRUS_TRAPDOOR)
                .add(ModBlocks.GOLDEN_CITRUS_TRAPDOOR)
                .add(ModBlocks.PINK_CITRUS_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.GREEN_CITRUS_PRESSURE_PLATE)
                .add(ModBlocks.GOLDEN_CITRUS_PRESSURE_PLATE)
                .add(ModBlocks.PINK_CITRUS_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.GREEN_CITRUS_BUTTON)
                .add(ModBlocks.GOLDEN_CITRUS_BUTTON)
                .add(ModBlocks.PINK_CITRUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.LIME_LEAVES)
                .add(ModBlocks.BUDDING_LIME_LEAVES)
                .add(ModBlocks.LEMON_LEAVES)
                .add(ModBlocks.BUDDING_LEMON_LEAVES)
                .add(ModBlocks.GRAPEFRUIT_LEAVES)
                .add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.LIME_SAPLING)
                .add(ModBlocks.LEMON_SAPLING)
                .add(ModBlocks.GRAPEFRUIT_SAPLING);
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(ModBlocks.PINK_HYDRANGEA)
                .add(ModBlocks.BIG_PINK_HYDRANGEA)
                .add(ModBlocks.ORANGE_HYDRANGEA)
                .add(ModBlocks.BIG_ORANGE_HYDRANGEA)
                .add(ModBlocks.YELLOW_HYDRANGEA)
                .add(ModBlocks.BIG_YELLOW_HYDRANGEA);
        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.LANTERN_HEARTS);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.LIME_LEAVES)
                .add(ModBlocks.BUDDING_LIME_LEAVES)
                .add(ModBlocks.LEMON_LEAVES)
                .add(ModBlocks.BUDDING_LEMON_LEAVES)
                .add(ModBlocks.GRAPEFRUIT_LEAVES)
                .add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES);
    }
}
