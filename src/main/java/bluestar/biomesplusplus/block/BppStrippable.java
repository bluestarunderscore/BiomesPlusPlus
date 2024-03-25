package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class BppStrippable
{
    public static void registerStrippedLogs()
    {
        //LOGS
        StrippableBlockRegistry.register(BppBlocks.EUCALYPTUS_LOG, BppBlocks.STRIPPED_EUCALYPTUS_LOG);

        //WOODS
        StrippableBlockRegistry.register(BppBlocks.EUCALYPTUS_WOOD, BppBlocks.STRIPPED_EUCALYPTUS_WOOD);
    }
}
