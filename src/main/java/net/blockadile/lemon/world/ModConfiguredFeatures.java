package net.blockadile.lemon.world;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_TREE_KEY = registerKey("lime_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_TREE_BIG_KEY = registerKey("big_lime_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_TREE_KEY = registerKey("lemon_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_TREE_BIG_KEY = registerKey("big_lemon_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAPEFRUIT_TREE_KEY = registerKey("grapefruit_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAPEFRUIT_TREE_BIG_KEY = registerKey("big_grapefruit_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //Lime tree(s)
        ConfiguredFeatures.register(context, LIME_TREE_BIG_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GREEN_CITRUS_LOG),
                new CherryTrunkPlacer(4, 1, 1, ConstantIntProvider.create(2),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.LIME_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_LIME_LEAVES.getDefaultState(), 1)),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4),
                        ConstantIntProvider.create(0),
                        ConstantIntProvider.create(5), 0.25F, 0.5F, 0.0F, 0.0F),
                new TwoLayersFeatureSize(1, 0, 1))).build());

        ConfiguredFeatures.register(context, LIME_TREE_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GREEN_CITRUS_LOG),
                new BendingTrunkPlacer(2, 1, 0, 3, UniformIntProvider.create(1, 1)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.LIME_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_LIME_LEAVES.getDefaultState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 75),
                new TwoLayersFeatureSize(1, 1, 2))).build());


        //Lemon tree(s)
        ConfiguredFeatures.register(context, LEMON_TREE_BIG_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GOLDEN_CITRUS_LOG),
                new CherryTrunkPlacer(4, 1, 1, ConstantIntProvider.create(2),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.LEMON_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_LEMON_LEAVES.getDefaultState(), 1)),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4),
                        ConstantIntProvider.create(0),
                        ConstantIntProvider.create(5), 0.25F, 0.5F, 0.0F, 0.0F),
                new TwoLayersFeatureSize(1, 0, 1))).build());

        ConfiguredFeatures.register(context, LEMON_TREE_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GOLDEN_CITRUS_LOG),
                new BendingTrunkPlacer(3, 1, 0, 3, UniformIntProvider.create(1, 1)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.LEMON_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_LEMON_LEAVES.getDefaultState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 75),
                new TwoLayersFeatureSize(1, 1, 2))).build());


        //Grapefruit tree(s)
        ConfiguredFeatures.register(context, GRAPEFRUIT_TREE_BIG_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PINK_CITRUS_LOG),
                new CherryTrunkPlacer(4, 1, 1, ConstantIntProvider.create(2),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.GRAPEFRUIT_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES.getDefaultState(), 1)),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4),
                        ConstantIntProvider.create(0),
                        ConstantIntProvider.create(5), 0.25F, 0.5F, 0.0F, 0.0F),
                new TwoLayersFeatureSize(1, 0, 1))).build());

        ConfiguredFeatures.register(context, GRAPEFRUIT_TREE_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PINK_CITRUS_LOG),
                new BendingTrunkPlacer(3, 1, 0, 3, UniformIntProvider.create(1, 1)),
                new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                        .add(ModBlocks.GRAPEFRUIT_LEAVES.getDefaultState(), 5)
                        .add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES.getDefaultState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 75),
                new TwoLayersFeatureSize(1, 1, 2))).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(LemonTree.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
