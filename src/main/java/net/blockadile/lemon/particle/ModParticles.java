package net.blockadile.lemon.particle;

import net.blockadile.lemon.LemonTree;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(LemonTree.MOD_ID, name), particleType);
    }

    public static void registerModParticles() {

        LemonTree.LOGGER.info("Registering Mod Particles for " + LemonTree.MOD_ID);

    }
}
