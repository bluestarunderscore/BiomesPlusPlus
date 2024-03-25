package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class BppLootTableGenerator extends FabricBlockLootTableProvider
{
    public BppLootTableGenerator(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate()
    {
        dropSelf(BppBlocks.EUCALYPTUS_SAPLING);
        dropSelf(BppBlocks.FANCY_BIRCH_SAPLING);

        dropSelf(BppBlocks.EUCALYPTUS_PLANKS);

        add(BppBlocks.EUCALYPTUS_LEAVES, createLeavesDrops(BppBlocks.EUCALYPTUS_LEAVES, BppBlocks.EUCALYPTUS_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));


        dropSelf(BppBlocks.EUCALYPTUS_LOG);
        dropSelf(BppBlocks.STRIPPED_EUCALYPTUS_LOG);

        dropSelf(BppBlocks.EUCALYPTUS_WOOD);
        dropSelf(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

        dropSelf(BppBlocks.EUCALYPTUS_STAIRS);

        dropSelf(BppBlocks.EUCALYPTUS_TRAPDOOR);

        dropSelf(BppBlocks.EUCALYPTUS_FENCE);
        dropSelf(BppBlocks.EUCALYPTUS_FENCE_GATE);

        dropSelf(BppBlocks.EUCALYPTUS_BUTTON);
        dropSelf(BppBlocks.EUCALYPTUS_PRESSURE_PLATE);

        add(BppBlocks.EUCALYPTUS_SLAB, createSlabItemTable(BppBlocks.EUCALYPTUS_SLAB));
        add(BppBlocks.EUCALYPTUS_DOOR, createDoorTable(BppBlocks.EUCALYPTUS_DOOR));


    }
}
