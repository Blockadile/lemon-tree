package net.blockadile.lemon.world.tree;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator LIME_TREE = new SaplingGenerator(LemonTree.MOD_ID + ":lime_tree", 0.25F,
            Optional.empty(), Optional.empty(),
            Optional.of(ModConfiguredFeatures.LIME_TREE_KEY), Optional.of(ModConfiguredFeatures.LIME_TREE_BIG_KEY),
            Optional.empty(), Optional.empty());
    public static final SaplingGenerator LEMON_TREE = new SaplingGenerator(LemonTree.MOD_ID + ":lemon_tree", 0.25F,
            Optional.empty(), Optional.empty(),
            Optional.of(ModConfiguredFeatures.LEMON_TREE_KEY), Optional.of(ModConfiguredFeatures.LEMON_TREE_BIG_KEY),
            Optional.empty(), Optional.empty());
    public static final SaplingGenerator GRAPEFRUIT_TREE = new SaplingGenerator(LemonTree.MOD_ID + ":grapefruit_tree", 0.25F,
            Optional.empty(), Optional.empty(),
            Optional.of(ModConfiguredFeatures.GRAPEFRUIT_TREE_KEY), Optional.of(ModConfiguredFeatures.GRAPEFRUIT_TREE_BIG_KEY),
            Optional.empty(), Optional.empty());
}
