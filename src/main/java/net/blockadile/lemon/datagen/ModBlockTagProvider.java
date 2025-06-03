package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.GREEN_CITRUS_LOG)
                .add(ModBlocks.GREEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD)
                .add(ModBlocks.GREEN_CITRUS_PLANKS);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.GREEN_CITRUS_LOG)
                .add(ModBlocks.GREEN_CITRUS_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG)
                .add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.GREEN_CITRUS_PLANKS);

    }
}
