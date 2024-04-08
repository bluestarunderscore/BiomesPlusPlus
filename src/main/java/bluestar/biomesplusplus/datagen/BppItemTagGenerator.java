package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.util.BppTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BppItemTagGenerator extends FabricTagProvider.ItemTagProvider
{

    public BppItemTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg)
    {
        getOrCreateTagBuilder(ItemTags.STONE_BRICKS)
                .add(BppBlocks.SCORCHED_STONE_BRICKS.asItem())
                .add(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS.asItem())
                .add(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(BppBlocks.EUCALYPTUS_PLANKS.asItem())
                .add(BppBlocks.CYPRESS_PLANKS.asItem())
                .add(BppBlocks.END_PLANKS.asItem())
                .add(BppBlocks.FROZEN_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(BppBlocks.EUCALYPTUS_STAIRS.asItem())
                .add(BppBlocks.CYPRESS_STAIRS.asItem())
                .add(BppBlocks.END_STAIRS.asItem())
                .add(BppBlocks.FROZEN_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(BppBlocks.EUCALYPTUS_SLAB.asItem())
                .add(BppBlocks.CYPRESS_SLAB.asItem())
                .add(BppBlocks.END_SLAB.asItem())
                .add(BppBlocks.FROZEN_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(BppBlocks.EUCALYPTUS_FENCE.asItem())
                .add(BppBlocks.CYPRESS_FENCE.asItem())
                .add(BppBlocks.END_FENCE.asItem())
                .add(BppBlocks.FROZEN_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(BppBlocks.EUCALYPTUS_BUTTON.asItem())
                .add(BppBlocks.CYPRESS_BUTTON.asItem())
                .add(BppBlocks.END_BUTTON.asItem())
                .add(BppBlocks.FROZEN_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(BppBlocks.EUCALYPTUS_PRESSURE_PLATE.asItem())
                .add(BppBlocks.CYPRESS_PRESSURE_PLATE.asItem())
                .add(BppBlocks.END_PRESSURE_PLATE.asItem())
                .add(BppBlocks.FROZEN_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(BppBlocks.EUCALYPTUS_DOOR.asItem())
                .add(BppBlocks.CYPRESS_DOOR.asItem())
                .add(BppBlocks.END_DOOR.asItem())
                .add(BppBlocks.FROZEN_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(BppBlocks.EUCALYPTUS_TRAPDOOR.asItem())
                .add(BppBlocks.CYPRESS_TRAPDOOR.asItem())
                .add(BppBlocks.END_TRAPDOOR.asItem())
                .add(BppBlocks.FROZEN_TRAPDOOR.asItem());


        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(BppBlocks.EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.EUCALYPTUS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD.asItem())

                .add(BppBlocks.CYPRESS_LOG.asItem())
                .add(BppBlocks.CYPRESS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_CYPRESS_LOG.asItem())
                .add(BppBlocks.STRIPPED_CYPRESS_WOOD.asItem())

                .add(BppBlocks.END_LOG.asItem())
                .add(BppBlocks.END_WOOD.asItem())
                .add(BppBlocks.STRIPPED_END_LOG.asItem())
                .add(BppBlocks.STRIPPED_END_WOOD.asItem())

                .add(BppBlocks.FROZEN_LOG.asItem())
                .add(BppBlocks.FROZEN_WOOD.asItem())
                .add(BppBlocks.STRIPPED_FROZEN_LOG.asItem())
                .add(BppBlocks.STRIPPED_FROZEN_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BppBlocks.EUCALYPTUS_LEAVES.asItem())
                .add(BppBlocks.CYPRESS_LEAVES.asItem())
                .add(BppBlocks.END_LEAVES.asItem())
                .add(BppBlocks.FROZEN_LEAVES.asItem());

        getOrCreateTagBuilder(BppTags.Items.EUCALYPTUS_LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.EUCALYPTUS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD.asItem());

        getOrCreateTagBuilder(BppTags.Items.CYPRESS_LOGS)
                .add(BppBlocks.CYPRESS_LOG.asItem())
                .add(BppBlocks.CYPRESS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_CYPRESS_LOG.asItem())
                .add(BppBlocks.STRIPPED_CYPRESS_WOOD.asItem());

        getOrCreateTagBuilder(BppTags.Items.END_LOGS)
                .add(BppBlocks.END_LOG.asItem())
                .add(BppBlocks.END_WOOD.asItem())
                .add(BppBlocks.STRIPPED_END_LOG.asItem())
                .add(BppBlocks.STRIPPED_END_WOOD.asItem());

        getOrCreateTagBuilder(BppTags.Items.FROZEN_LOGS)
                .add(BppBlocks.FROZEN_LOG.asItem())
                .add(BppBlocks.FROZEN_WOOD.asItem())
                .add(BppBlocks.STRIPPED_FROZEN_LOG.asItem())
                .add(BppBlocks.STRIPPED_FROZEN_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(BppBlocks.EUCALYPTUS_SAPLING.asItem())
                .add(BppBlocks.CYPRESS_SAPLING.asItem())
                .add(BppBlocks.END_SAPLING.asItem())
                .add(BppBlocks.FROZEN_SAPLING.asItem())
                .add(BppBlocks.FANCY_BIRCH_SAPLING.asItem());
    }
}
