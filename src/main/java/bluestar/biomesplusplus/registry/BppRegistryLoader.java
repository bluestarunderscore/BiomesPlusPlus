package bluestar.biomesplusplus.registry;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.world.gen.WorldGeneration;

public class BppRegistryLoader
{
    public static void loadCoreRegistries()
    {
        BiomesPlusPlus.LOGGER.info("Loading core registries");
        //TODO: lmao
        BiomesPlusPlus.LOGGER.info("Core registries loaded");
    }

    public static void loadLevelRegistries()
    {
        BiomesPlusPlus.LOGGER.info("Loading worldgen registries");
        WorldGeneration.generateWorldGen();
        BiomesPlusPlus.LOGGER.info("Worldgen registries loaded");
    }
}
