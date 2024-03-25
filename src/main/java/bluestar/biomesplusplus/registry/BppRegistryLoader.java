package bluestar.biomesplusplus.registry;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.BiomesPlusPlusGroup;
import bluestar.biomesplusplus.block.BppFlammableBlocks;
import bluestar.biomesplusplus.block.BppFuels;
import bluestar.biomesplusplus.block.BppStrippable;
import bluestar.biomesplusplus.world.gen.WorldGeneration;

public class BppRegistryLoader
{
    public static void loadCoreRegistries()
    {
        BiomesPlusPlus.LOGGER.info("Loading core registries");
        BiomesPlusPlusGroup.registerItemGroups();
        BiomesPlusPlus.LOGGER.info("Core registries loaded");
    }

    public static void loadLevelRegistries()
    {
        BiomesPlusPlus.LOGGER.info("Loading worldgen registries");
        WorldGeneration.generateWorldGen();
        BppFuels.registerFuels();
        BppFlammableBlocks.registerFlammableBlocks();
        BppStrippable.registerStrippedLogs();
        BiomesPlusPlus.LOGGER.info("Worldgen registries loaded");
    }
}
