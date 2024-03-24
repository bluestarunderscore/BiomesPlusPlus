package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

public class TreeGeneration
{
    public static void generateTrees()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BppBiomes.TALL_OAK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                BppPlacedFeatures.TALL_OAK_KEY_PLACED);
    }
}
