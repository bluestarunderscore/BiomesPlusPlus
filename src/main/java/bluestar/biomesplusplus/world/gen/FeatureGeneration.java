package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class FeatureGeneration
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

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.SILK_WETLAND),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.WEB_BUSH_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.SILK_WETLAND, BppBiomes.TALL_OAK_WETLAND, BppBiomes.DARK_SWAMP, Biomes.SWAMP),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.CYPRESS_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.WINTRY_FIELD),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.FROZEN_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.DECIDUOUS_FOOTHILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.OAK_PINE_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.DECIDUOUS_FOOTHILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.OAK_BUSH_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.SANDSTONE_RANGES),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.TINY_OAK_BUSH_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.SANDSTONE_RANGES),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.EUCALYPTUS_RANGES_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.ENDER_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.DARK_END_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.ENDER_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.JUNGLE_END_KEY_PLACED);
    }
}
