package net.blockadile.lemon;

import net.blockadile.lemon.block.ModBlocks;
import net.blockadile.lemon.effects.ModEffects;
import net.blockadile.lemon.enchantment.ModEnchantmentEffects;
import net.blockadile.lemon.entity.ModEntities;
import net.blockadile.lemon.item.ModItems;
import net.blockadile.lemon.particle.ModParticles;
import net.blockadile.lemon.world.biome.ModBiomes;
import net.blockadile.lemon.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LemonTree implements ModInitializer {
	public static final String MOD_ID = "lemon-tree";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
		ModEffects.registerEffects();
		ModEnchantmentEffects.registerEnchantmentEffects();
		ModWorldGeneration.generateModWorld();


		StrippableBlockRegistry.register(ModBlocks.GREEN_CITRUS_LOG, ModBlocks.STRIPPED_GREEN_CITRUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.GREEN_CITRUS_WOOD, ModBlocks.STRIPPED_GREEN_CITRUS_WOOD);
		StrippableBlockRegistry.register(ModBlocks.GOLDEN_CITRUS_LOG, ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.GOLDEN_CITRUS_WOOD, ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD);
		StrippableBlockRegistry.register(ModBlocks.PINK_CITRUS_LOG, ModBlocks.STRIPPED_PINK_CITRUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.PINK_CITRUS_WOOD, ModBlocks.STRIPPED_PINK_CITRUS_WOOD);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GREEN_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GREEN_CITRUS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GOLDEN_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GOLDEN_CITRUS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINK_CITRUS_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINK_CITRUS_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CITRUS_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GOLDEN_CITRUS_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_CITRUS_FENCE_GATE, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BUDDING_LIME_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEMON_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BUDDING_LEMON_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAPEFRUIT_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BUDDING_GRAPEFRUIT_LEAVES, 30, 60);
	}
}