package net.blockadile.lemon.entity;

import net.blockadile.lemon.LemonTree;
import net.blockadile.lemon.entity.custom.CombustibleLemonEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CombustibleLemonEntity> ROPE_DART = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(LemonTree.MOD_ID, "combustible_lemon_projectile"),
            EntityType.Builder.<CombustibleLemonEntity>create(CombustibleLemonEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f).build());


    public static void registerModEntities() {
        LemonTree.LOGGER.info("Registering Mod Entities for " + LemonTree.MOD_ID);
    }
}
