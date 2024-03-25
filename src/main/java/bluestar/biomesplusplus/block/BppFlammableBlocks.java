package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class BppFlammableBlocks
{
    public static void registerFlammableBlocks()
    {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(BppBlocks.EUCALYPTUS_LOG, 5, 5);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_LOG, 5, 5);

        registry.add(BppBlocks.EUCALYPTUS_WOOD, 5, 5);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD, 5, 5);

        registry.add(BppBlocks.EUCALYPTUS_LEAVES, 30, 60);

        registry.add(BppBlocks.EUCALYPTUS_PLANKS, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_STAIRS, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_SLAB, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_PRESSURE_PLATE, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_FENCE, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_FENCE_GATE, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_DOOR, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_TRAPDOOR, 5, 20);

    }
}
