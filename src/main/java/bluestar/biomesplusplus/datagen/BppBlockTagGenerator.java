package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.util.BppTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

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
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB)
                .add(BppBlocks.GRIMSTONE_SLAB)
                .add(BppBlocks.POLISHED_GRIMSTONE_SLAB)
                .add(BppBlocks.GRIMSTONE_BRICK_SLAB);


        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BppBlocks.SCORCHED_STONE_STAIRS)
                .add(BppBlocks.SCORCHED_COBBLESTONE_STAIRS)
                .add(BppBlocks.SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS)
                .add(BppBlocks.GRIMSTONE_STAIRS)
                .add(BppBlocks.POLISHED_GRIMSTONE_STAIRS)
                .add(BppBlocks.GRIMSTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BppBlocks.SCORCHED_COBBLESTONE_WALL)
                .add(BppBlocks.SCORCHED_STONE_BRICK_WALL)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL)
                .add(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL)
                .add(BppBlocks.GRIMSTONE_WALL)
                .add(BppBlocks.POLISHED_GRIMSTONE_WALL)
                .add(BppBlocks.GRIMSTONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BppBlocks.SCORCHED_DIRT)
                .add(BppBlocks.COARSE_SCORCHED_DIRT)
                .add(BppBlocks.RANGES_DIRT);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(BppBlocks.SCORCHED_DIRT)
                .add(BppBlocks.COARSE_SCORCHED_DIRT)
                .add(BppBlocks.RANGES_DIRT);
        getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
                .add(BppBlocks.SCORCHED_STONE_BRICKS)
                .add(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS)
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS)
                .add(BppBlocks.GRIMSTONE_BRICKS)
                .add(BppBlocks.CRACKED_GRIMSTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(BppBlocks.END_DEPOSIT)
                .add(BppBlocks.SCORCHED_END_DEPOSIT)
                .add(BppBlocks.DEEPSLATE_END_DEPOSIT);

        getOrCreateTagBuilder(BppTags.Blocks.END_DEPOSITS)
                .add(BppBlocks.END_DEPOSIT)
                .add(BppBlocks.SCORCHED_END_DEPOSIT)
                .add(BppBlocks.DEEPSLATE_END_DEPOSIT);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BppBlocks.GRIMSTONE)
                .add(BppBlocks.GRIMSTONE_SLAB)
                .add(BppBlocks.GRIMSTONE_STAIRS)
                .add(BppBlocks.GRIMSTONE_WALL)
                .add(BppBlocks.CRACKED_GRIMSTONE_BRICKS)
                .add(BppBlocks.GRIMSTONE_BRICKS)
                .add(BppBlocks.GRIMSTONE_BRICK_SLAB)
                .add(BppBlocks.GRIMSTONE_BRICK_STAIRS)
                .add(BppBlocks.GRIMSTONE_BRICK_WALL)
                .add(BppBlocks.POLISHED_GRIMSTONE)
                .add(BppBlocks.POLISHED_GRIMSTONE_SLAB)
                .add(BppBlocks.POLISHED_GRIMSTONE_STAIRS)
                .add(BppBlocks.POLISHED_GRIMSTONE_WALL)

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
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL)

                .add(BppBlocks.END_DEPOSIT)
                .add(BppBlocks.SCORCHED_END_DEPOSIT)
                .add(BppBlocks.DEEPSLATE_END_DEPOSIT);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(BppBlocks.HUGE_CYAN_MUSHROOM)
                .add(BppBlocks.HUGE_PURPLE_MUSHROOM);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD)
                .add(BppBlocks.CYPRESS_LOG)
                .add(BppBlocks.CYPRESS_WOOD)
                .add(BppBlocks.STRIPPED_CYPRESS_LOG)
                .add(BppBlocks.STRIPPED_CYPRESS_WOOD)
                .add(BppBlocks.END_LOG)
                .add(BppBlocks.END_WOOD)
                .add(BppBlocks.STRIPPED_END_LOG)
                .add(BppBlocks.STRIPPED_END_WOOD)
                .add(BppBlocks.FROZEN_LOG)
                .add(BppBlocks.FROZEN_WOOD)
                .add(BppBlocks.STRIPPED_FROZEN_LOG)
                .add(BppBlocks.STRIPPED_FROZEN_WOOD);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD)
                .add(BppBlocks.CYPRESS_LOG)
                .add(BppBlocks.CYPRESS_WOOD)
                .add(BppBlocks.STRIPPED_CYPRESS_LOG)
                .add(BppBlocks.STRIPPED_CYPRESS_WOOD)
                .add(BppBlocks.END_LOG)
                .add(BppBlocks.END_WOOD)
                .add(BppBlocks.STRIPPED_END_LOG)
                .add(BppBlocks.STRIPPED_END_WOOD)
                .add(BppBlocks.FROZEN_LOG)
                .add(BppBlocks.FROZEN_WOOD)
                .add(BppBlocks.STRIPPED_FROZEN_LOG)
                .add(BppBlocks.STRIPPED_FROZEN_WOOD);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(BppBlocks.EUCALYPTUS_LEAVES)
                .add(BppBlocks.CYPRESS_LEAVES)
                .add(BppBlocks.END_LEAVES)
                .add(BppBlocks.FROZEN_LEAVES);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BppBlocks.EUCALYPTUS_LEAVES)
                .add(BppBlocks.CYPRESS_LEAVES)
                .add(BppBlocks.END_LEAVES)
                .add(BppBlocks.FROZEN_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BppBlocks.EUCALYPTUS_SAPLING)
                .add(BppBlocks.FANCY_BIRCH_SAPLING)
                .add(BppBlocks.CYPRESS_SAPLING)
                .add(BppBlocks.END_SAPLING)
                .add(BppBlocks.FROZEN_SAPLING);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(BppBlocks.EUCALYPTUS_FENCE)
                .add(BppBlocks.CYPRESS_FENCE)
                .add(BppBlocks.END_FENCE)
                .add(BppBlocks.FROZEN_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(BppBlocks.EUCALYPTUS_FENCE_GATE)
                .add(BppBlocks.CYPRESS_FENCE_GATE)
                .add(BppBlocks.END_FENCE_GATE)
                .add(BppBlocks.FROZEN_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(BppBlocks.EUCALYPTUS_PLANKS)
                .add(BppBlocks.CYPRESS_PLANKS)
                .add(BppBlocks.END_PLANKS)
                .add(BppBlocks.FROZEN_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(BppBlocks.EUCALYPTUS_STAIRS)
                .add(BppBlocks.CYPRESS_STAIRS)
                .add(BppBlocks.END_STAIRS)
                .add(BppBlocks.FROZEN_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(BppBlocks.EUCALYPTUS_SLAB)
                .add(BppBlocks.CYPRESS_SLAB)
                .add(BppBlocks.END_SLAB)
                .add(BppBlocks.FROZEN_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BppBlocks.EUCALYPTUS_DOOR)
                .add(BppBlocks.CYPRESS_DOOR)
                .add(BppBlocks.END_DOOR)
                .add(BppBlocks.FROZEN_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BppBlocks.EUCALYPTUS_TRAPDOOR)
                .add(BppBlocks.CYPRESS_TRAPDOOR)
                .add(BppBlocks.END_TRAPDOOR)
                .add(BppBlocks.FROZEN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BppBlocks.EUCALYPTUS_PRESSURE_PLATE)
                .add(BppBlocks.CYPRESS_PRESSURE_PLATE)
                .add(BppBlocks.END_PRESSURE_PLATE)
                .add(BppBlocks.FROZEN_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BppBlocks.EUCALYPTUS_BUTTON)
                .add(BppBlocks.CYPRESS_BUTTON)
                .add(BppBlocks.END_BUTTON)
                .add(BppBlocks.FROZEN_BUTTON);

        getOrCreateTagBuilder(BppTags.Blocks.EUCALYPTUS_LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(BppBlocks.EUCALYPTUS_WOOD)
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

        getOrCreateTagBuilder(BppTags.Blocks.CYPRESS_LOGS)
                .add(BppBlocks.CYPRESS_LOG)
                .add(BppBlocks.STRIPPED_CYPRESS_LOG)
                .add(BppBlocks.CYPRESS_WOOD)
                .add(BppBlocks.STRIPPED_CYPRESS_WOOD);

        getOrCreateTagBuilder(BppTags.Blocks.END_LOGS)
                .add(BppBlocks.END_LOG)
                .add(BppBlocks.STRIPPED_END_LOG)
                .add(BppBlocks.END_WOOD)
                .add(BppBlocks.STRIPPED_END_WOOD);

        getOrCreateTagBuilder(BppTags.Blocks.FROZEN_LOGS)
                .add(BppBlocks.FROZEN_LOG)
                .add(BppBlocks.STRIPPED_FROZEN_LOG)
                .add(BppBlocks.FROZEN_WOOD)
                .add(BppBlocks.STRIPPED_FROZEN_WOOD);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BppBlocks.EUCALYPTUS_SAPLING)
                .add(BppBlocks.CYPRESS_SAPLING)
                .add(BppBlocks.END_SAPLING)
                .add(BppBlocks.FROZEN_SAPLING)
                .add(BppBlocks.FANCY_BIRCH_SAPLING);

        getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .add(BppBlocks.GRIMSTONE);
    }
}
