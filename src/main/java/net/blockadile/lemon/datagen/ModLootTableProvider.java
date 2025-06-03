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
        //addDrop(ModBlocks.GREEN_CITRUS_STAIRS);
    }
}
