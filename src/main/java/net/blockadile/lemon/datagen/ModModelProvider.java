package net.blockadile.lemon.datagen;

import net.blockadile.lemon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool green_citrus_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_CITRUS_PLANKS);
        green_citrus_pool.stairs(ModBlocks.GREEN_CITRUS_STAIRS);
        green_citrus_pool.slab(ModBlocks.GREEN_CITRUS_SLAB);
        green_citrus_pool.fence(ModBlocks.GREEN_CITRUS_FENCE);
        green_citrus_pool.fenceGate(ModBlocks.GREEN_CITRUS_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_CITRUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GREEN_CITRUS_TRAPDOOR);
        green_citrus_pool.pressurePlate(ModBlocks.GREEN_CITRUS_PRESSURE_PLATE);
        green_citrus_pool.button(ModBlocks.GREEN_CITRUS_BUTTON);
        BlockStateModelGenerator.BlockTexturePool golden_citrus_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDEN_CITRUS_PLANKS);
        golden_citrus_pool.stairs(ModBlocks.GOLDEN_CITRUS_STAIRS);
        golden_citrus_pool.slab(ModBlocks.GOLDEN_CITRUS_SLAB);
        golden_citrus_pool.fence(ModBlocks.GOLDEN_CITRUS_FENCE);
        golden_citrus_pool.fenceGate(ModBlocks.GOLDEN_CITRUS_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.GOLDEN_CITRUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GOLDEN_CITRUS_TRAPDOOR);
        golden_citrus_pool.pressurePlate(ModBlocks.GOLDEN_CITRUS_PRESSURE_PLATE);
        golden_citrus_pool.button(ModBlocks.GOLDEN_CITRUS_BUTTON);
        BlockStateModelGenerator.BlockTexturePool pink_citrus_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_CITRUS_PLANKS);
        pink_citrus_pool.stairs(ModBlocks.PINK_CITRUS_STAIRS);
        pink_citrus_pool.slab(ModBlocks.PINK_CITRUS_SLAB);
        pink_citrus_pool.fence(ModBlocks.PINK_CITRUS_FENCE);
        pink_citrus_pool.fenceGate(ModBlocks.PINK_CITRUS_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_CITRUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_CITRUS_TRAPDOOR);
        pink_citrus_pool.pressurePlate(ModBlocks.PINK_CITRUS_PRESSURE_PLATE);
        pink_citrus_pool.button(ModBlocks.PINK_CITRUS_BUTTON);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
