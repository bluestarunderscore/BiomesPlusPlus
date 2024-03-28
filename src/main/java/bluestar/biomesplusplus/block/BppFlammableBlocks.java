package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class BppFlammableBlocks
{
    public static void registerFlammableBlocks()
    {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(BppBlocks.EUCALYPTUS_LOG, 5, 5);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_LOG, 5, 5);
        registry.add(BppBlocks.CYPRESS_LOG, 5, 5);
        registry.add(BppBlocks.STRIPPED_CYPRESS_LOG, 5, 5);
        registry.add(BppBlocks.END_LOG, 5, 5);
        registry.add(BppBlocks.STRIPPED_END_LOG, 5, 5);
        registry.add(BppBlocks.FROZEN_LOG, 5, 5);
        registry.add(BppBlocks.STRIPPED_FROZEN_LOG, 5, 5);

        registry.add(BppBlocks.EUCALYPTUS_WOOD, 5, 5);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD, 5, 5);
        registry.add(BppBlocks.CYPRESS_WOOD, 5, 5);
        registry.add(BppBlocks.STRIPPED_CYPRESS_WOOD, 5, 5);
        registry.add(BppBlocks.END_WOOD, 5, 5);
        registry.add(BppBlocks.STRIPPED_END_WOOD, 5, 5);
        registry.add(BppBlocks.FROZEN_WOOD, 5, 5);
        registry.add(BppBlocks.STRIPPED_FROZEN_WOOD, 5, 5);


        registry.add(BppBlocks.EUCALYPTUS_LEAVES, 30, 60);
        registry.add(BppBlocks.CYPRESS_LEAVES, 30, 60);
        registry.add(BppBlocks.END_LEAVES, 30, 60);
        registry.add(BppBlocks.FROZEN_LEAVES, 30, 60);

        registry.add(BppBlocks.CYPRESS_PLANKS, 5, 20);
        registry.add(BppBlocks.CYPRESS_STAIRS, 5, 20);
        registry.add(BppBlocks.CYPRESS_SLAB, 5, 20);

        registry.add(BppBlocks.END_PLANKS, 5, 20);
        registry.add(BppBlocks.END_STAIRS, 5, 20);
        registry.add(BppBlocks.END_SLAB, 5, 20);

        registry.add(BppBlocks.FROZEN_PLANKS, 5, 20);
        registry.add(BppBlocks.FROZEN_STAIRS, 5, 20);
        registry.add(BppBlocks.FROZEN_SLAB, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_PLANKS, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_STAIRS, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_SLAB, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_FENCE, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_FENCE_GATE, 5, 20);

        registry.add(BppBlocks.CYPRESS_FENCE, 5, 20);
        registry.add(BppBlocks.CYPRESS_FENCE_GATE, 5, 20);

        registry.add(BppBlocks.END_FENCE, 5, 20);
        registry.add(BppBlocks.END_FENCE_GATE, 5, 20);

        registry.add(BppBlocks.FROZEN_FENCE, 5, 20);
        registry.add(BppBlocks.FROZEN_FENCE_GATE, 5, 20);

        registry.add(BppBlocks.EUCALYPTUS_DOOR, 5, 20);
        registry.add(BppBlocks.EUCALYPTUS_TRAPDOOR, 5, 20);

        registry.add(BppBlocks.CYPRESS_DOOR, 5, 20);
        registry.add(BppBlocks.CYPRESS_TRAPDOOR, 5, 20);

        registry.add(BppBlocks.END_DOOR, 5, 20);
        registry.add(BppBlocks.END_TRAPDOOR, 5, 20);

        registry.add(BppBlocks.FROZEN_DOOR, 5, 20);
        registry.add(BppBlocks.FROZEN_TRAPDOOR, 5, 20);

    }
}
