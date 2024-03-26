package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.util.BppTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BppBlockTagGenerator extends FabricTagProvider.BlockTagProvider
{
    public BppBlockTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg)
    {
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(BppBlocks.SCORCHED_STONE_SLAB)
                .add(BppBlocks.SCORCHED_COBBLESTONE_SLAB)
                .add(BppBlocks.SCORCHED_STONE_BRICK_SLAB)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BppBlocks.SCORCHED_STONE_STAIRS)
                .add(BppBlocks.SCORCHED_COBBLESTONE_STAIRS)
                .add(BppBlocks.SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BppBlocks.SCORCHED_COBBLESTONE_WALL)
                .add(BppBlocks.SCORCHED_STONE_BRICK_WALL)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BppBlocks.SCORCHED_DIRT)
                .add(BppBlocks.COARSE_SCORCHED_DIRT);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(BppBlocks.SCORCHED_DIRT)
                .add(BppBlocks.COARSE_SCORCHED_DIRT);

        getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
                .add(BppBlocks.SCORCHED_STONE_BRICKS)
                .add(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BppBlocks.SCORCHED_COBBLESTONE)
                .add(BppBlocks.SCORCHED_COBBLESTONE_SLAB)
                .add(BppBlocks.SCORCHED_COBBLESTONE_STAIRS)
                .add(BppBlocks.SCORCHED_COBBLESTONE_WALL)

                .add(BppBlocks.SCORCHED_STONE)
                .add(BppBlocks.SCORCHED_STONE_SLAB)
                .add(BppBlocks.SCORCHED_STONE_STAIRS)

                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL)

                .add(BppBlocks.SCORCHED_STONE_BRICKS)
                .add(BppBlocks.SCORCHED_STONE_BRICK_SLAB)
                .add(BppBlocks.SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.SCORCHED_STONE_BRICK_WALL)

                .add(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS)

                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(BppBlocks.EUCALYPTUS_LEAVES);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BppBlocks.EUCALYPTUS_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BppBlocks.EUCALYPTUS_SAPLING)
                .add(BppBlocks.FANCY_BIRCH_SAPLING);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(BppBlocks.EUCALYPTUS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(BppBlocks.EUCALYPTUS_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(BppBlocks.EUCALYPTUS_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(BppBlocks.EUCALYPTUS_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(BppBlocks.EUCALYPTUS_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BppBlocks.EUCALYPTUS_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BppBlocks.EUCALYPTUS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BppBlocks.EUCALYPTUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BppBlocks.EUCALYPTUS_BUTTON);

        getOrCreateTagBuilder(BppTags.Blocks.EUCALYPTUS_LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

    }
}
