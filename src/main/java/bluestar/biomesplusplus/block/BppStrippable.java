package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class BppStrippable
{
    public static void registerStrippedLogs()
    {
        //LOGS
        StrippableBlockRegistry.register(BppBlocks.EUCALYPTUS_LOG, BppBlocks.STRIPPED_EUCALYPTUS_LOG);
        StrippableBlockRegistry.register(BppBlocks.CYPRESS_LOG, BppBlocks.STRIPPED_CYPRESS_LOG);
        StrippableBlockRegistry.register(BppBlocks.END_LOG, BppBlocks.STRIPPED_END_LOG);
        StrippableBlockRegistry.register(BppBlocks.FROZEN_LOG, BppBlocks.STRIPPED_FROZEN_LOG);

        //WOODS
        StrippableBlockRegistry.register(BppBlocks.EUCALYPTUS_WOOD, BppBlocks.STRIPPED_EUCALYPTUS_WOOD);
        StrippableBlockRegistry.register(BppBlocks.CYPRESS_WOOD, BppBlocks.STRIPPED_CYPRESS_WOOD);
        StrippableBlockRegistry.register(BppBlocks.END_WOOD, BppBlocks.STRIPPED_END_WOOD);
        StrippableBlockRegistry.register(BppBlocks.FROZEN_WOOD, BppBlocks.STRIPPED_FROZEN_WOOD);
    }
}
