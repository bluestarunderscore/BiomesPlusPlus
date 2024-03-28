package bluestar.biomesplusplus.block;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class BppFuels
{
    public static void registerFuels()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(BppBlocks.EUCALYPTUS_LOG, 300);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_LOG, 300);
        registry.add(BppBlocks.CYPRESS_LOG, 300);
        registry.add(BppBlocks.STRIPPED_CYPRESS_LOG, 300);
        registry.add(BppBlocks.END_LOG, 300);
        registry.add(BppBlocks.STRIPPED_END_LOG, 300);
        registry.add(BppBlocks.FROZEN_LOG, 300);
        registry.add(BppBlocks.STRIPPED_FROZEN_LOG, 300);

        registry.add(BppBlocks.EUCALYPTUS_WOOD, 300);
        registry.add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD, 300);
        registry.add(BppBlocks.CYPRESS_WOOD, 300);
        registry.add(BppBlocks.STRIPPED_CYPRESS_WOOD, 300);
        registry.add(BppBlocks.END_WOOD, 300);
        registry.add(BppBlocks.STRIPPED_END_WOOD, 300);
        registry.add(BppBlocks.FROZEN_WOOD, 300);
        registry.add(BppBlocks.STRIPPED_FROZEN_WOOD, 300);

        registry.add(BppBlocks.EUCALYPTUS_PLANKS, 300);
        registry.add(BppBlocks.EUCALYPTUS_SLAB, 150);
        registry.add(BppBlocks.EUCALYPTUS_STAIRS, 300);
        registry.add(BppBlocks.EUCALYPTUS_PRESSURE_PLATE, 300);
        registry.add(BppBlocks.EUCALYPTUS_BUTTON, 100);
        registry.add(BppBlocks.EUCALYPTUS_TRAPDOOR, 300);
        registry.add(BppBlocks.EUCALYPTUS_FENCE_GATE, 300);
        registry.add(BppBlocks.EUCALYPTUS_FENCE, 300);
        registry.add(BppBlocks.EUCALYPTUS_DOOR, 200);

        registry.add(BppBlocks.CYPRESS_PLANKS, 300);
        registry.add(BppBlocks.CYPRESS_SLAB, 150);
        registry.add(BppBlocks.CYPRESS_STAIRS, 300);
        registry.add(BppBlocks.CYPRESS_PRESSURE_PLATE, 300);
        registry.add(BppBlocks.CYPRESS_BUTTON, 100);
        registry.add(BppBlocks.CYPRESS_TRAPDOOR, 300);
        registry.add(BppBlocks.CYPRESS_FENCE_GATE, 300);
        registry.add(BppBlocks.CYPRESS_FENCE, 300);
        registry.add(BppBlocks.CYPRESS_DOOR, 200);

        registry.add(BppBlocks.END_PLANKS, 300);
        registry.add(BppBlocks.END_SLAB, 150);
        registry.add(BppBlocks.END_STAIRS, 300);
        registry.add(BppBlocks.END_PRESSURE_PLATE, 300);
        registry.add(BppBlocks.END_BUTTON, 100);
        registry.add(BppBlocks.END_TRAPDOOR, 300);
        registry.add(BppBlocks.END_FENCE_GATE, 300);
        registry.add(BppBlocks.END_FENCE, 300);
        registry.add(BppBlocks.END_DOOR, 200);

        registry.add(BppBlocks.FROZEN_PLANKS, 300);
        registry.add(BppBlocks.FROZEN_SLAB, 150);
        registry.add(BppBlocks.FROZEN_STAIRS, 300);
        registry.add(BppBlocks.FROZEN_PRESSURE_PLATE, 300);
        registry.add(BppBlocks.FROZEN_BUTTON, 100);
        registry.add(BppBlocks.FROZEN_TRAPDOOR, 300);
        registry.add(BppBlocks.FROZEN_FENCE_GATE, 300);
        registry.add(BppBlocks.FROZEN_FENCE, 300);
        registry.add(BppBlocks.FROZEN_DOOR, 200);

    }
}
