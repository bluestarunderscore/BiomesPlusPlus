package bluestar.biomesplusplus.world.biome;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class BppOverworldRegionRare extends Region
{
    public BppOverworldRegionRare(ResourceLocation name, int weight)
    {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        //In the Bpp region, replace the following biomes sometimes
        this.addModifiedVanillaOverworldBiomes(mapper, builder ->
        {
            builder.replaceBiome(Biomes.MANGROVE_SWAMP, BppBiomes.SILK_WETLAND);
            builder.replaceBiome(Biomes.DARK_FOREST, BppBiomes.ENDER_FOREST);
            builder.replaceBiome(Biomes.PLAINS, BppBiomes.BRUSHLAND);
            builder.replaceBiome(Biomes.FOREST, BppBiomes.MAGIC_FOREST);
            builder.replaceBiome(Biomes.JUNGLE, BppBiomes.MUSHROOM_RAINFOREST);
        });
    }
}