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

public class BiomesPlusPlusOverworldRegion extends Region
{
    public BiomesPlusPlusOverworldRegion(ResourceLocation name, int weight)
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

        });
    }
}
