package bluestar.biomesplusplus.world.biome;

import java.util.function.Consumer;
import com.mojang.datafixers.util.Pair;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;

import terrablender.api.Region;
import terrablender.api.RegionType;

public class BppOverworldRegion extends Region
{
    public BppOverworldRegion(ResourceLocation name, int weight)
    {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome> >> mapper)
    {
        //In the Bpp region, replace the following biomes sometimes
        this.addModifiedVanillaOverworldBiomes(mapper, builder ->
        {
            builder.replaceBiome(Biomes.FOREST, BppBiomes.TALL_OAK_FOREST);
            builder.replaceBiome(Biomes.PLAINS, BppBiomes.STONE_BASIN);
            builder.replaceBiome(Biomes.SWAMP, BppBiomes.TALL_OAK_WETLAND);
            builder.replaceBiome(Biomes.DESERT, BppBiomes.WASTELAND);
            builder.replaceBiome(Biomes.MANGROVE_SWAMP, BppBiomes.DARK_SWAMP);
            builder.replaceBiome(Biomes.SNOWY_PLAINS, BppBiomes.WINTRY_FIELD);
            builder.replaceBiome(Biomes.MEADOW, BppBiomes.DECIDUOUS_FOOTHILLS);

            builder.replaceBiome(Biomes.ERODED_BADLANDS, BppBiomes.SANDSTONE_RANGES);
            builder.replaceBiome(Biomes.WOODED_BADLANDS, BppBiomes.SANDSTONE_RANGES);
            builder.replaceBiome(Biomes.BADLANDS, BppBiomes.SANDSTONE_RANGES);
            builder.replaceBiome(Biomes.JUNGLE, BppBiomes.LUSH_FOREST);



        });
    }
}
