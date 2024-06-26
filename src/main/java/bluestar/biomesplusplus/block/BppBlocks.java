package bluestar.biomesplusplus.block;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.world.gen.BppConfiguredFeatures;
import bluestar.biomesplusplus.world.gen.BppPlacedFeatures;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import bluestar.biomesplusplus.world.gen.tree.BppSaplingGenerator;

public class BppBlocks
{
    //END DEPOSIT
    public static final Block END_DEPOSIT = registerBlock("end_deposit", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)), true);
    public static final Block DEEPSLATE_END_DEPOSIT = registerBlock("deepslate_end_deposit", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)), true);
    public static final Block SCORCHED_END_DEPOSIT = registerBlock("scorched_end_deposit", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)), true);

    //GRIMSTONE BLOCKS
    public static final Block GRIMSTONE = registerBlock("grimstone", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)), true);
    public static final Block POLISHED_GRIMSTONE = registerBlock("polished_grimstone", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block GRIMSTONE_BRICKS = registerBlock("grimstone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)), true);
    public static final Block CRACKED_GRIMSTONE_BRICKS = registerBlock("cracked_grimstone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS)), true);

    //WASTELAND BLOCKS
    public static final Block SCORCHED_DIRT = registerBlock("scorched_dirt", new GrassBlock(FabricBlockSettings.copyOf(Blocks.DIRT)), true);
    public static final Block COARSE_SCORCHED_DIRT = registerBlock("coarse_scorched_dirt", new GrassBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)), true);

    public static final Block RANGES_DIRT = registerBlock("ranges_dirt", new GrassBlock(FabricBlockSettings.copyOf(Blocks.DIRT)), true);

    public static final Block SCORCHED_STONE = registerBlock("scorched_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)), true);
    public static final Block SCORCHED_COBBLESTONE = registerBlock("scorched_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)), true);
    public static final Block SCORCHED_STONE_BRICKS = registerBlock("scorched_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)), true);
    public static final Block CRACKED_SCORCHED_STONE_BRICKS = registerBlock("cracked_scorched_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)), true);
    public static final Block MOSSY_SCORCHED_COBBLESTONE = registerBlock("mossy_scorched_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)), true);
    public static final Block MOSSY_SCORCHED_STONE_BRICKS = registerBlock("mossy_scorched_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)), true);
    //STONE SLABS
    public static final Block SCORCHED_STONE_SLAB = registerBlock("scorched_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)), true);
    public static final Block SCORCHED_COBBLESTONE_SLAB = registerBlock("scorched_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)), true);
    public static final Block SCORCHED_STONE_BRICK_SLAB = registerBlock("scorched_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)), true);
    public static final Block MOSSY_SCORCHED_COBBLESTONE_SLAB = registerBlock("mossy_scorched_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE_SLAB)), true);
    public static final Block MOSSY_SCORCHED_STONE_BRICK_SLAB = registerBlock("mossy_scorched_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_SLAB)), true);
    public static final Block GRIMSTONE_SLAB = registerBlock("grimstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_SLAB)), true);
    public static final Block POLISHED_GRIMSTONE_SLAB = registerBlock("polished_grimstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_SLAB)), true);
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)), true);


    //STONE STAIRS
    public static final Block SCORCHED_STONE_STAIRS = registerBlock("scorched_stone_stairs", new StairBlock(BppBlocks.SCORCHED_STONE.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)), true);
    public static final Block SCORCHED_COBBLESTONE_STAIRS = registerBlock("scorched_cobblestone_stairs", new StairBlock(BppBlocks.SCORCHED_COBBLESTONE.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)), true);
    public static final Block SCORCHED_STONE_BRICK_STAIRS = registerBlock("scorched_stone_brick_stairs", new StairBlock(BppBlocks.SCORCHED_STONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)), true);
    public static final Block MOSSY_SCORCHED_COBBLESTONE_STAIRS = registerBlock("mossy_scorched_cobblestone_stairs", new StairBlock(BppBlocks.MOSSY_SCORCHED_COBBLESTONE.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE_STAIRS)), true);
    public static final Block MOSSY_SCORCHED_STONE_BRICK_STAIRS = registerBlock("mossy_scorched_stone_brick_stairs", new StairBlock(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_STAIRS)), true);
    public static final Block GRIMSTONE_STAIRS = registerBlock("grimstone_stairs", new StairBlock(BppBlocks.GRIMSTONE.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS)), true);
    public static final Block POLISHED_GRIMSTONE_STAIRS = registerBlock("polished_grimstone_stairs", new StairBlock(BppBlocks.POLISHED_GRIMSTONE.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS)), true);
    public static final Block GRIMSTONE_BRICK_STAIRS = registerBlock("grimstone_brick_stairs", new StairBlock(BppBlocks.GRIMSTONE_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)), true);


    //STONE WALLS
    public static final Block SCORCHED_COBBLESTONE_WALL = registerBlock("scorched_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)), true);
    public static final Block SCORCHED_STONE_BRICK_WALL = registerBlock("scorched_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)), true);
    public static final Block MOSSY_SCORCHED_COBBLESTONE_WALL = registerBlock("mossy_scorched_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE_WALL)), true);
    public static final Block MOSSY_SCORCHED_STONE_BRICK_WALL = registerBlock("mossy_scorched_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICK_WALL)), true);
    public static final Block GRIMSTONE_WALL = registerBlock("grimstone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_WALL)), true);
    public static final Block POLISHED_GRIMSTONE_WALL = registerBlock("polished_grimstone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_WALL)), true);
    public static final Block GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_WALL)), true);



    //MUSHROOM STUFF
    public static final Block HUGE_CYAN_MUSHROOM = registerBlock("cyan_mushroom_block", new HugeMushroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK)), true);
    public static final Block HUGE_PURPLE_MUSHROOM = registerBlock("purple_mushroom_block", new HugeMushroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK)), true);

    /***********************************************************************
     * Tree blocks
     * If adding, the following organization should be maintained in the file:
     * Sapling - Log - Stripped Log - Wood (Bark) - Stripped Wood - Leaves
     *
     ***********************************************************************/
    //SAPLINGS
    public static final Block FANCY_BIRCH_SAPLING = registerBlock("fancy_birch_sapling", new SaplingBlock(BppSaplingGenerator.FANCY_BIRCH,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling", new SaplingBlock(BppSaplingGenerator.EUCALYPTUS,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block CYPRESS_SAPLING = registerBlock("cypress_sapling", new SaplingBlock(BppSaplingGenerator.CYPRESS,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block END_SAPLING = registerBlock("end_sapling", new SaplingBlock(BppSaplingGenerator.TINY_END_BUSH,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block FROZEN_SAPLING = registerBlock("frozen_sapling", new SaplingBlock(BppSaplingGenerator.FROZEN,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block CYAN_MUSHROOM = registerBlock("cyan_mushroom", new MushroomBlock(BppConfiguredFeatures.HUGE_CYAN_MUSHROOM_KEY,
            FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)), true);

    public static final Block PURPLE_MUSHROOM = registerBlock("purple_mushroom", new MushroomBlock(BppConfiguredFeatures.HUGE_PURPLE_MUSHROOM_KEY,
            FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)), true);




    //LOGS
    public static final Block EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), true);
    public static final Block CYPRESS_LOG = registerBlock("cypress_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), true);
    public static final Block END_LOG = registerBlock("end_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), true);
    public static final Block FROZEN_LOG = registerBlock("frozen_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), true);

    //STRIPPED LOGS
    public static final Block STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_END_LOG = registerBlock("stripped_end_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_FROZEN_LOG = registerBlock("stripped_frozen_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), true);

    //WOODS
    public static final Block EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), true);
    public static final Block CYPRESS_WOOD = registerBlock("cypress_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), true);
    public static final Block END_WOOD = registerBlock("end_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), true);
    public static final Block FROZEN_WOOD = registerBlock("frozen_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), true);

    //STRIPPED WOODS
    public static final Block STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block STRIPPED_END_WOOD = registerBlock("stripped_end_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block STRIPPED_FROZEN_WOOD = registerBlock("stripped_frozen_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), true);

    //LEAVES
    public static final Block EUCALYPTUS_LEAVES =  registerBlock("eucalyptus_leaves", new LeavesBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY)
            .strength(0.2F).randomTicks()
            .sound(SoundType.GRASS).noOcclusion()
            .ignitedByLava()), true);

    public static final Block CYPRESS_LEAVES =  registerBlock("cypress_leaves", new LeavesBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY)
            .strength(0.2F).randomTicks()
            .sound(SoundType.GRASS).noOcclusion()
            .ignitedByLava()), true);

    public static final Block END_LEAVES =  registerBlock("end_leaves", new LeavesBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY)
            .strength(0.2F).randomTicks()
            .sound(SoundType.GRASS).noOcclusion()
            .ignitedByLava()), true);

    public static final Block FROZEN_LEAVES =  registerBlock("frozen_leaves", new LeavesBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW).pushReaction(PushReaction.DESTROY)
            .strength(0.2F).randomTicks()
            .sound(SoundType.GRASS).noOcclusion()
            .ignitedByLava()), true);
    /***********************************************************************
     * Wood blocks
     * If adding, the following organization should be maintained in the file:
     * Planks - Stairs - Slab - Button - Pressure Plate - Fence - Fence Gate - Door - Trapdoor
     *
     ***********************************************************************/

    //PLANKS
    public static final Block EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), true);
    public static final Block CYPRESS_PLANKS = registerBlock("cypress_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), true);
    public static final Block END_PLANKS = registerBlock("end_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), true);
    public static final Block FROZEN_PLANKS = registerBlock("frozen_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), true);

    //STAIRS AND SLABS
    public static final Block EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            new StairBlock(BppBlocks.EUCALYPTUS_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), true);
    public static final Block EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), true);

    public static final Block CYPRESS_STAIRS = registerBlock("cypress_stairs",
            new StairBlock(BppBlocks.CYPRESS_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), true);
    public static final Block CYPRESS_SLAB = registerBlock("cypress_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), true);

    public static final Block END_STAIRS = registerBlock("end_stairs",
            new StairBlock(BppBlocks.END_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), true);
    public static final Block END_SLAB = registerBlock("end_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), true);

    public static final Block FROZEN_STAIRS = registerBlock("frozen_stairs",
            new StairBlock(BppBlocks.FROZEN_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), true);
    public static final Block FROZEN_SLAB = registerBlock("frozen_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), true);

    //BUTTONS AND PRESSURE PLATES
    public static final Block EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), true);
    public static final Block EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), true);

    public static final Block CYPRESS_BUTTON = registerBlock("cypress_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), true);
    public static final Block CYPRESS_PRESSURE_PLATE = registerBlock("cypress_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), true);

    public static final Block END_BUTTON = registerBlock("end_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), true);
    public static final Block END_PRESSURE_PLATE = registerBlock("end_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), true);

    public static final Block FROZEN_BUTTON = registerBlock("frozen_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), true);
    public static final Block FROZEN_PRESSURE_PLATE = registerBlock("frozen_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), true);

    //FENCES
    public static final Block EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), true);
    public static final Block EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), true);

    public static final Block CYPRESS_FENCE = registerBlock("cypress_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), true);
    public static final Block CYPRESS_FENCE_GATE = registerBlock("cypress_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), true);

    public static final Block END_FENCE = registerBlock("end_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), true);
    public static final Block END_FENCE_GATE = registerBlock("end_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), true);

    public static final Block FROZEN_FENCE = registerBlock("frozen_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), true);
    public static final Block FROZEN_FENCE_GATE = registerBlock("frozen_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), true);

    //DOORS
    public static final Block EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()), true);
    public static final Block EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noOcclusion()), true);

    public static final Block CYPRESS_DOOR = registerBlock("cypress_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()), true);
    public static final Block CYPRESS_TRAPDOOR = registerBlock("cypress_trapdoor",
            new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noOcclusion()), true);

    public static final Block END_DOOR = registerBlock("end_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()), true);
    public static final Block END_TRAPDOOR = registerBlock("end_trapdoor",
            new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noOcclusion()), true);

    public static final Block FROZEN_DOOR = registerBlock("frozen_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()), true);
    public static final Block FROZEN_TRAPDOOR = registerBlock("frozen_trapdoor",
            new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noOcclusion()), true);

   // public static final BlockFamily EUCALYPTUS_STANDING_FAMILY = BlockFamilies.familyBuilder(EUCALYPTUS_PLANKS)
            //.sign(STANDING_EUCALYPTUS_SIGN, WALL_EUCALYPTUS_SIGN)
    //        .recipeGroupPrefix("wooden")
     //       .recipeUnlockedBy("has_planks").getFamily();


    private static Block registerBlock(String name, Block block, boolean withItem)
    {
        if(withItem)
        {
            registerItemForBlock(name, block);
        }
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BiomesPlusPlus.MOD_ID, name), block);
    }

    private static BlockItem registerItemForBlock(String name, Block block)
    {
        return Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(BiomesPlusPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBppBlocks()
    {
        BiomesPlusPlus.LOGGER.info("Registering Blocks for " + BiomesPlusPlus.MOD_ID);
    }


}
