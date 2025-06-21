package net.blockadile.lemon.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;

public class BrainFreezeParticle extends SpriteBillboardParticle {
    protected BrainFreezeParticle(ClientWorld world, double x, double y, double z,
                                  double velocityX, double velocityY, double velocityZ,
                                  SpriteProvider spriteProvider) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        this.scale = 0.5F;
        this.maxAge = 40 + world.random.nextInt(10);
        this.setSprite(spriteProvider.getSprite(world.random));
    }

    @Override
    public ParticleTextureSheet getType() {
        return null;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientWorld world,
                                       double x, double y, double z,
                                       double velocityX, double velocityY, double velocityZ) {
            return new BrainFreezeParticle(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider);
        }
    }
}
