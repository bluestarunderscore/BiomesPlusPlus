package bluestar.biomesplusplus.world.gen.tree.custom;

import bluestar.biomesplusplus.block.BppBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class BppBarkResolver
{
    //Gets the corresponding bark for the input if one exists, else AIR
    public Block correspondingWood(Block block)
    {
        if(block == Blocks.OAK_LOG) return Blocks.OAK_WOOD;
        if(block == Blocks.ACACIA_LOG) return Blocks.ACACIA_WOOD;
        if(block == Blocks.BIRCH_LOG) return Blocks.BIRCH_WOOD;
        if(block == Blocks.JUNGLE_LOG) return Blocks.JUNGLE_WOOD;
        if(block == Blocks.SPRUCE_LOG) return Blocks.SPRUCE_WOOD;
        if(block == Blocks.DARK_OAK_LOG) return Blocks.DARK_OAK_WOOD;
        if(block == BppBlocks.EUCALYPTUS_LOG) return BppBlocks.EUCALYPTUS_WOOD;

        return Blocks.AIR;
        //if(block == BppBlocks.END_LOG) return BppBlocks.END_WOOD;
        //if(block == BppBlocks.CYPRESS_LOG) return BppBlocks.CYPRESS_WOOD;
    }
}
