package net.blockadile.lemon.world.biome;

import net.blockadile.lemon.LemonTree;
import net.minecraft.util.Identifier;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(LemonTree.MOD_ID, "citrus_fields"), RegionType.OVERWORLD, 4));
    }
}
