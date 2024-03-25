package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class BppFuels
{
    public static void registerFuels()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(BppBlocks.EUCALYPTUS_LOG, 300);

        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_LOG, 300);
    }
}
