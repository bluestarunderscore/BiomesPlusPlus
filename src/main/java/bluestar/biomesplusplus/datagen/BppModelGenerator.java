package bluestar.biomesplusplus.datagen;


import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.item.BppItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;

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

        generator.woodProvider(BppBlocks.CYPRESS_LOG)
                .log(BppBlocks.CYPRESS_LOG)
                .wood(BppBlocks.CYPRESS_WOOD);

        generator.woodProvider(BppBlocks.STRIPPED_CYPRESS_LOG)
                .log(BppBlocks.STRIPPED_CYPRESS_LOG)
                .wood(BppBlocks.STRIPPED_CYPRESS_WOOD);

        generator.woodProvider(BppBlocks.END_LOG)
                .log(BppBlocks.END_LOG)
                .wood(BppBlocks.END_WOOD);

        generator.woodProvider(BppBlocks.STRIPPED_END_LOG)
                .log(BppBlocks.STRIPPED_END_LOG)
                .wood(BppBlocks.STRIPPED_END_WOOD);

        generator.woodProvider(BppBlocks.FROZEN_LOG)
                .log(BppBlocks.FROZEN_LOG)
                .wood(BppBlocks.FROZEN_WOOD);

        generator.woodProvider(BppBlocks.STRIPPED_FROZEN_LOG)
                .log(BppBlocks.STRIPPED_FROZEN_LOG)
                .wood(BppBlocks.STRIPPED_FROZEN_WOOD);

        generator.createMushroomBlock(BppBlocks.HUGE_CYAN_MUSHROOM);
        generator.createMushroomBlock(BppBlocks.HUGE_PURPLE_MUSHROOM);

        generator.createTrivialBlock(BppBlocks.EUCALYPTUS_LEAVES, TexturedModel.LEAVES);
        generator.createTrivialBlock(BppBlocks.CYPRESS_LEAVES, TexturedModel.LEAVES);
        generator.createTrivialBlock(BppBlocks.END_LEAVES, TexturedModel.LEAVES);
        generator.createTrivialBlock(BppBlocks.FROZEN_LEAVES, TexturedModel.LEAVES);

        generator.createTrivialCube(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS);
        generator.createTrivialCube(BppBlocks.SCORCHED_DIRT);
        generator.createTrivialCube(BppBlocks.COARSE_SCORCHED_DIRT);
        generator.createTrivialCube(BppBlocks.RANGES_DIRT);

        generator.createCrossBlockWithDefaultItem(BppBlocks.EUCALYPTUS_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.FANCY_BIRCH_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.CYPRESS_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.END_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.FROZEN_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        generator.createCrossBlockWithDefaultItem(BppBlocks.CYAN_MUSHROOM, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createCrossBlockWithDefaultItem(BppBlocks.PURPLE_MUSHROOM, BlockModelGenerators.TintState.NOT_TINTED);

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

        BlockModelGenerators.BlockFamilyProvider cypressPool = generator.family(BppBlocks.CYPRESS_PLANKS);
        cypressPool.slab(BppBlocks.CYPRESS_SLAB);
        cypressPool.stairs(BppBlocks.CYPRESS_STAIRS);
        cypressPool.fence(BppBlocks.CYPRESS_FENCE);
        cypressPool.fenceGate(BppBlocks.CYPRESS_FENCE_GATE);
        cypressPool.button(BppBlocks.CYPRESS_BUTTON);
        cypressPool.pressurePlate(BppBlocks.CYPRESS_PRESSURE_PLATE);

        BlockModelGenerators.BlockFamilyProvider endPool = generator.family(BppBlocks.END_PLANKS);
        endPool.slab(BppBlocks.END_SLAB);
        endPool.stairs(BppBlocks.END_STAIRS);
        endPool.fence(BppBlocks.END_FENCE);
        endPool.fenceGate(BppBlocks.END_FENCE_GATE);
        endPool.button(BppBlocks.END_BUTTON);
        endPool.pressurePlate(BppBlocks.END_PRESSURE_PLATE);

        BlockModelGenerators.BlockFamilyProvider frozenPool = generator.family(BppBlocks.FROZEN_PLANKS);
        frozenPool.slab(BppBlocks.FROZEN_SLAB);
        frozenPool.stairs(BppBlocks.FROZEN_STAIRS);
        frozenPool.fence(BppBlocks.FROZEN_FENCE);
        frozenPool.fenceGate(BppBlocks.FROZEN_FENCE_GATE);
        frozenPool.button(BppBlocks.FROZEN_BUTTON);
        frozenPool.pressurePlate(BppBlocks.FROZEN_PRESSURE_PLATE);

        generator.createDoor(BppBlocks.EUCALYPTUS_DOOR);
        generator.createOrientableTrapdoor(BppBlocks.EUCALYPTUS_TRAPDOOR);
        generator.createDoor(BppBlocks.CYPRESS_DOOR);
        generator.createOrientableTrapdoor(BppBlocks.CYPRESS_TRAPDOOR);
        generator.createDoor(BppBlocks.END_DOOR);
        generator.createOrientableTrapdoor(BppBlocks.END_TRAPDOOR);
        generator.createDoor(BppBlocks.FROZEN_DOOR);
        generator.createOrientableTrapdoor(BppBlocks.FROZEN_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerators generator)
    {
        generator.generateFlatItem(BppItems.END_STONE_SCRAP, ModelTemplates.FLAT_ITEM);
    }
}
