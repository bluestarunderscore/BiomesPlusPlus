package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

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

        //TODO: CREATE (BY HAND) MODELS FOR TINTED BLOCKS
        generator.createTrivialBlock(BppBlocks.EUCALYPTUS_LEAVES, TexturedModel.LEAVES);

        //generator.createTrivialCube(BppBlocks.SCORCHED_STONE);
        //generator.createTrivialCube(BppBlocks.SCORCHED_COBBLESTONE);
        //generator.createTrivialCube(BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
        //generator.createTrivialCube(BppBlocks.SCORCHED_STONE_BRICKS);
        //generator.createTrivialCube(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
        generator.createTrivialCube(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS);
        generator.createTrivialCube(BppBlocks.SCORCHED_DIRT);
        generator.createTrivialCube(BppBlocks.COARSE_SCORCHED_DIRT);

        generator.createCrossBlockWithDefaultItem(BppBlocks.EUCALYPTUS_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.FANCY_BIRCH_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        BlockModelGenerators.BlockFamilyProvider scorchedStonePool = generator.family(BppBlocks.SCORCHED_STONE);
        scorchedStonePool.slab(BppBlocks.SCORCHED_STONE_SLAB);
        scorchedStonePool.stairs(BppBlocks.SCORCHED_STONE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider scorchedCobblestonePool = generator.family(BppBlocks.SCORCHED_COBBLESTONE);
        scorchedCobblestonePool.slab(BppBlocks.SCORCHED_COBBLESTONE_SLAB);
        scorchedCobblestonePool.stairs(BppBlocks.SCORCHED_COBBLESTONE_STAIRS);
        scorchedCobblestonePool.wall(BppBlocks.SCORCHED_COBBLESTONE_WALL);

        BlockModelGenerators.BlockFamilyProvider scorchedMossyCobblestonePool = generator.family(BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
        scorchedMossyCobblestonePool.slab(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB);
        scorchedMossyCobblestonePool.stairs(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS);
        scorchedMossyCobblestonePool.wall(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL);

        BlockModelGenerators.BlockFamilyProvider scorchedStoneBrickPool = generator.family(BppBlocks.SCORCHED_STONE_BRICKS);
        scorchedStoneBrickPool.slab(BppBlocks.SCORCHED_STONE_BRICK_SLAB);
        scorchedStoneBrickPool.stairs(BppBlocks.SCORCHED_STONE_BRICK_STAIRS);
        scorchedStoneBrickPool.wall(BppBlocks.SCORCHED_STONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider mossyScorchedStoneBrickPool = generator.family(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
        mossyScorchedStoneBrickPool.slab(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB);
        mossyScorchedStoneBrickPool.stairs(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS);
        mossyScorchedStoneBrickPool.wall(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL);


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
        //generator.generateFlatItem(BppBlocks.FANCY_BIRCH_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);
        //generator.generateFlatItem(BppBlocks.EUCALYPTUS_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);
    }
}
