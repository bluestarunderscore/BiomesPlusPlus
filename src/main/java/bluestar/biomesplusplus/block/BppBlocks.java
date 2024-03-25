package bluestar.biomesplusplus.block;

import bluestar.biomesplusplus.BiomesPlusPlus;
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

    //SAPLINGS
    public static final Block EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling", new SaplingBlock(BppSaplingGenerator.EUCALYPTUS,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);

    public static final Block FANCY_BIRCH_SAPLING = registerBlock("fancy_birch_sapling", new SaplingBlock(BppSaplingGenerator.FANCY_BIRCH,
            FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), true);


    //LOGS
    public static final Block EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), true);

    //STRIPPED LOGS
    public static final Block STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), true);

    //WOODS
    public static final Block EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), true);

    //STRIPPED WOODS
    public static final Block STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), true);

    //LEAVES
    public static final Block EUCALYPTUS_LEAVES =  registerBlock("eucalyptus_leaves", new LeavesBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY)
            .strength(0.2F).randomTicks()
            .sound(SoundType.GRASS).noOcclusion()
            .ignitedByLava()), true);


    //PLANKS
    public static final Block EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), true);

    //STAIRS AND SLABS
    public static final Block EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            new StairBlock(BppBlocks.EUCALYPTUS_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), true);
    public static final Block EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), true);

    //BUTTONS AND PRESSURE PLATES
    public static final Block EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), true);
    public static final Block EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), true);

    //FENCES
    public static final Block EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), true);
    public static final Block EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), true);

    //DOORS
    public static final Block EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()), true);
    public static final Block EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).noOcclusion()), true);

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
