package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Blocks;

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
        dropSelf(BppBlocks.RANGES_DIRT);
        dropSelf(BppBlocks.COARSE_SCORCHED_DIRT);
        dropSelf(BppBlocks.SCORCHED_COBBLESTONE);
        dropSelf(BppBlocks.SCORCHED_COBBLESTONE_STAIRS);
        dropSelf(BppBlocks.SCORCHED_COBBLESTONE_WALL);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL);
        dropOther(BppBlocks.SCORCHED_STONE, BppBlocks.SCORCHED_COBBLESTONE);
        dropSelf(BppBlocks.SCORCHED_STONE_STAIRS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICK_STAIRS);
        dropSelf(BppBlocks.SCORCHED_STONE_BRICK_WALL);
        dropSelf(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS);
        dropSelf(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL);

        //Saplings
        dropSelf(BppBlocks.EUCALYPTUS_SAPLING);
        dropSelf(BppBlocks.FANCY_BIRCH_SAPLING);
        dropSelf(BppBlocks.CYPRESS_SAPLING);
        dropSelf(BppBlocks.END_SAPLING);
        dropSelf(BppBlocks.FROZEN_SAPLING);

        //Leaf blocks
        add(BppBlocks.EUCALYPTUS_LEAVES, createLeavesDrops(BppBlocks.EUCALYPTUS_LEAVES, BppBlocks.EUCALYPTUS_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));
        add(BppBlocks.CYPRESS_LEAVES, createLeavesDrops(BppBlocks.CYPRESS_LEAVES, BppBlocks.CYPRESS_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));
        add(BppBlocks.END_LEAVES, createLeavesDrops(BppBlocks.END_LEAVES, BppBlocks.END_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));
        add(BppBlocks.FROZEN_LEAVES, createLeavesDrops(BppBlocks.FROZEN_LEAVES, BppBlocks.FROZEN_SAPLING, 0.05f, 0.0025f, 0.083333336f, 0.1f));

        //Other tree blocks
        dropSelf(BppBlocks.EUCALYPTUS_LOG);
        dropSelf(BppBlocks.STRIPPED_EUCALYPTUS_LOG);
        dropSelf(BppBlocks.CYPRESS_LOG);
        dropSelf(BppBlocks.STRIPPED_CYPRESS_LOG);
        dropSelf(BppBlocks.END_LOG);
        dropSelf(BppBlocks.STRIPPED_END_LOG);
        dropSelf(BppBlocks.FROZEN_LOG);
        dropSelf(BppBlocks.STRIPPED_FROZEN_LOG);

        dropSelf(BppBlocks.EUCALYPTUS_WOOD);
        dropSelf(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);
        dropSelf(BppBlocks.CYPRESS_WOOD);
        dropSelf(BppBlocks.STRIPPED_CYPRESS_WOOD);
        dropSelf(BppBlocks.END_WOOD);
        dropSelf(BppBlocks.STRIPPED_END_WOOD);
        dropSelf(BppBlocks.FROZEN_WOOD);
        dropSelf(BppBlocks.STRIPPED_FROZEN_WOOD);

        dropSelf(BppBlocks.EUCALYPTUS_PLANKS);
        dropSelf(BppBlocks.CYPRESS_PLANKS);
        dropSelf(BppBlocks.END_PLANKS);
        dropSelf(BppBlocks.FROZEN_PLANKS);

        dropSelf(BppBlocks.EUCALYPTUS_STAIRS);
        dropSelf(BppBlocks.CYPRESS_STAIRS);
        dropSelf(BppBlocks.END_STAIRS);
        dropSelf(BppBlocks.FROZEN_STAIRS);

        add(BppBlocks.EUCALYPTUS_SLAB, createSlabItemTable(BppBlocks.EUCALYPTUS_SLAB));
        add(BppBlocks.CYPRESS_SLAB, createSlabItemTable(BppBlocks.CYPRESS_SLAB));
        add(BppBlocks.END_SLAB, createSlabItemTable(BppBlocks.END_SLAB));
        add(BppBlocks.FROZEN_SLAB, createSlabItemTable(BppBlocks.FROZEN_SLAB));

        dropSelf(BppBlocks.EUCALYPTUS_FENCE);
        dropSelf(BppBlocks.EUCALYPTUS_FENCE_GATE);
        dropSelf(BppBlocks.CYPRESS_FENCE);
        dropSelf(BppBlocks.CYPRESS_FENCE_GATE);
        dropSelf(BppBlocks.END_FENCE);
        dropSelf(BppBlocks.END_FENCE_GATE);
        dropSelf(BppBlocks.FROZEN_FENCE);
        dropSelf(BppBlocks.FROZEN_FENCE_GATE);

        add(BppBlocks.EUCALYPTUS_DOOR, createDoorTable(BppBlocks.EUCALYPTUS_DOOR));
        add(BppBlocks.CYPRESS_DOOR, createDoorTable(BppBlocks.CYPRESS_DOOR));
        add(BppBlocks.END_DOOR, createDoorTable(BppBlocks.END_DOOR));
        add(BppBlocks.FROZEN_DOOR, createDoorTable(BppBlocks.FROZEN_DOOR));

        dropSelf(BppBlocks.EUCALYPTUS_TRAPDOOR);
        dropSelf(BppBlocks.CYPRESS_TRAPDOOR);
        dropSelf(BppBlocks.END_TRAPDOOR);
        dropSelf(BppBlocks.FROZEN_TRAPDOOR);

        dropSelf(BppBlocks.EUCALYPTUS_BUTTON);
        dropSelf(BppBlocks.EUCALYPTUS_PRESSURE_PLATE);
        dropSelf(BppBlocks.CYPRESS_BUTTON);
        dropSelf(BppBlocks.CYPRESS_PRESSURE_PLATE);
        dropSelf(BppBlocks.END_BUTTON);
        dropSelf(BppBlocks.END_PRESSURE_PLATE);
        dropSelf(BppBlocks.FROZEN_BUTTON);
        dropSelf(BppBlocks.FROZEN_PRESSURE_PLATE);


        add(BppBlocks.SCORCHED_STONE_SLAB, createSlabItemTable(BppBlocks.SCORCHED_STONE_SLAB));
        add(BppBlocks.SCORCHED_COBBLESTONE_SLAB, createSlabItemTable(BppBlocks.SCORCHED_COBBLESTONE_SLAB));
        add(BppBlocks.SCORCHED_STONE_BRICK_SLAB, createSlabItemTable(BppBlocks.SCORCHED_STONE_BRICK_SLAB));
        add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB, createSlabItemTable(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB));
        add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB, createSlabItemTable(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB));
    }
}
