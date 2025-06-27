package net.blockadile.lemon.world.biome;

import net.blockadile.lemon.LemonTree;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.Identifier;

public class ModBiomes {
    public static final RegistryKey<Biome> CITRUS_FIELDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(LemonTree.MOD_ID, "citrus_fields"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(CITRUS_FIELDS, null);
    }
}
