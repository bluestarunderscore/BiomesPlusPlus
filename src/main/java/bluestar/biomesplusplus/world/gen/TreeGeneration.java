package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class TreeGeneration
{
    public static void generateTrees()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.TALL_OAK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.TALL_OAK_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.RIVER, Biomes.FROZEN_RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.FANCY_BIRCH_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS, Biomes.SAVANNA, Biomes.WINDSWEPT_SAVANNA,
                        Biomes.SAVANNA_PLATEAU, Biomes.MEADOW),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.EUCALYPTUS_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.TALL_OAK_WETLAND),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.TALL_SWAMP_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.WASTELAND, BppBiomes.SILK_WETLAND),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.DEAD_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.DARK_SWAMP),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.ROOFED_VINED_KEY_PLACED);
    }
}
