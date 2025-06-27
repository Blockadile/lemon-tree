package net.blockadile.lemon.world;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> LEMON_TREE_PLACED_KEY = registerKey("lemon_tree_placed");
    public static final RegistryKey<PlacedFeature> LEMON_TREE_BIG_PLACED_KEY = registerKey("lemon_tree_big_placed");
    public static final RegistryKey<PlacedFeature> LIME_TREE_PLACED_KEY = registerKey("lime_tree_placed");
    public static final RegistryKey<PlacedFeature> LIME_TREE_BIG_PLACED_KEY = registerKey("lime_tree_big_placed");
    public static final RegistryKey<PlacedFeature> GRAPEFRUIT_TREE_PLACED_KEY = registerKey("grapefruit_tree_placed");
    public static final RegistryKey<PlacedFeature> GRAPEFRUIT_TREE_BIG_PLACED_KEY = registerKey("grapefruit_tree_big_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, LEMON_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEMON_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LEMON_SAPLING));
        register(context, LEMON_TREE_BIG_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEMON_TREE_BIG_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LEMON_SAPLING));
        register(context, LIME_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LIME_SAPLING));
        register(context, LIME_TREE_BIG_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_TREE_BIG_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LIME_SAPLING));
        register(context, GRAPEFRUIT_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRAPEFRUIT_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LIME_SAPLING));
        register(context, GRAPEFRUIT_TREE_BIG_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRAPEFRUIT_TREE_BIG_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.2F, 1), ModBlocks.LIME_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(LemonTree.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
