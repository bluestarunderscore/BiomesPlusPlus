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
        //Wasteland blocks
        dropSelf(BppBlocks.SCORCHED_DIRT);
        dropSelf(BppBlocks.COARSE_SCORCHED_DIRT);

        dropSelf(BppBlocks.SCORCHED_COBBLESTONE);
        dropSelf(BppBlocks.SCORCHED_COBBLESTONE_STAIRS);
        dropSelf(BppBlocks.SCORCHED_COBBLESTONE_WALL);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL);
        dropSelf(BppBlocks.SCORCHED_STONE);
        dropSelf(BppBlocks.SCORCHED_STONE_STAIRS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICK_STAIRS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICK_WALL);
        dropSelf(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL);

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
        add(BppBlocks.SCORCHED_STONE_SLAB, createSlabItemTable(BppBlocks.SCORCHED_STONE_SLAB));
        add(BppBlocks.SCORCHED_COBBLESTONE_SLAB, createSlabItemTable(BppBlocks.SCORCHED_COBBLESTONE_SLAB));
        add(BppBlocks.SCORCHED_STONE_BRICK_SLAB, createSlabItemTable(BppBlocks.SCORCHED_STONE_BRICK_SLAB));
        add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB, createSlabItemTable(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB));
        add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB, createSlabItemTable(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB));
        add(BppBlocks.EUCALYPTUS_DOOR, createDoorTable(BppBlocks.EUCALYPTUS_DOOR));


    }
}
