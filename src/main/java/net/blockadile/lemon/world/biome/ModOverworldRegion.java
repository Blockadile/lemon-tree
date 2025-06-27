package net.blockadile.lemon.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class ModOverworldRegion extends Region {
    public ModOverworldRegion(Identifier name, RegionType type, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        {
            VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
            new ParameterUtils.ParameterPointListBuilder()
                    .temperature(ParameterUtils.Temperature.span(ParameterUtils.Temperature.WARM, ParameterUtils.Temperature.WARM))
                    .humidity(ParameterUtils.Humidity.span(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.WET))
                    .continentalness(ParameterUtils.Continentalness.MID_INLAND)
                    .erosion(ParameterUtils.Erosion.EROSION_4, ParameterUtils.Erosion.EROSION_5)
                    .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.FLOOR)
                    .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_ASCENDING, ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING)
                    .build().forEach(point -> builder.add(point, ModBiomes.CITRUS_FIELDS));

            builder.build().forEach(mapper);
        }
    }
}
