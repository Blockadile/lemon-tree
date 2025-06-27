package net.blockadile.lemon.world.gen;

import net.blockadile.lemon.world.ModPlacedFeatures;
import net.blockadile.lemon.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LEMON_TREE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LEMON_TREE_BIG_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LIME_TREE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LIME_TREE_BIG_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GRAPEFRUIT_TREE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CITRUS_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GRAPEFRUIT_TREE_BIG_PLACED_KEY);
    }
}
