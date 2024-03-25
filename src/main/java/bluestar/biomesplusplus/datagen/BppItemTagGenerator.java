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
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(BppBlocks.EUCALYPTUS_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(BppBlocks.EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.EUCALYPTUS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BppBlocks.EUCALYPTUS_LEAVES.asItem());

        getOrCreateTagBuilder(BppTags.Items.EUCALYPTUS_LOGS)
                .add(BppBlocks.EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.EUCALYPTUS_WOOD.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_LOG.asItem())
                .add(BppBlocks.STRIPPED_EUCALYPTUS_WOOD.asItem());
    }
}
