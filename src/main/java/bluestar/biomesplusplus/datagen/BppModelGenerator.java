package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class BppModelGenerator extends FabricModelProvider
{
    public BppModelGenerator(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator)
    {
        generator.woodProvider(BppBlocks.EUCALYPTUS_LOG)
                .log(BppBlocks.EUCALYPTUS_LOG)
                .wood(BppBlocks.EUCALYPTUS_WOOD);

        generator.woodProvider(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .log(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .wood(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);

        generator.createTrivialCube(BppBlocks.EUCALYPTUS_LEAVES);

        generator.createCrossBlock(BppBlocks.EUCALYPTUS_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlock(BppBlocks.FANCY_BIRCH_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        BlockModelGenerators.BlockFamilyProvider eucalyptusPool = generator.family(BppBlocks.EUCALYPTUS_PLANKS);
        eucalyptusPool.slab(BppBlocks.EUCALYPTUS_SLAB);

        eucalyptusPool.stairs(BppBlocks.EUCALYPTUS_STAIRS);
        eucalyptusPool.fence(BppBlocks.EUCALYPTUS_FENCE);
        eucalyptusPool.fenceGate(BppBlocks.EUCALYPTUS_FENCE_GATE);
        eucalyptusPool.button(BppBlocks.EUCALYPTUS_BUTTON);
        eucalyptusPool.pressurePlate(BppBlocks.EUCALYPTUS_PRESSURE_PLATE);

        generator.createDoor(BppBlocks.EUCALYPTUS_DOOR);
        generator.createTrapdoor(BppBlocks.EUCALYPTUS_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        //generator.generateFlatItem();
    }
}
