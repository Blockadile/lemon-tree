package net.blockadile.lemon.util;

import net.blockadile.lemon.LemonTree;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {



        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LemonTree.MOD_ID, name));
        }
    }

    public static class items {

        public static final TagKey<Item> GREEN_CITRUS_LOGS = createTag("green_citrus_logs");
        public static final TagKey<Item> GOLDEN_CITRUS_LOGS = createTag("golden_citrus_logs");
        public static final TagKey<Item> PINK_CITRUS_LOGS = createTag("pink_citrus_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(LemonTree.MOD_ID, name));
        }
    }
}
