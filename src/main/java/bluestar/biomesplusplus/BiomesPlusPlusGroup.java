package bluestar.biomesplusplus;

import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.item.BppItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;

public class BiomesPlusPlusGroup
{
    public static final CreativeModeTab BIOMESPLUSPLUS_GROUP = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(BiomesPlusPlus.MOD_ID, "biomesplusplus"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.biomesplusplus"))
                    .icon(() -> new ItemStack(BppBlocks.EUCALYPTUS_SAPLING))
                    .displayItems((displayContext, entries) ->
                            {
                                entries.accept(BppBlocks.EUCALYPTUS_LOG);
                                entries.accept(BppBlocks.EUCALYPTUS_WOOD);
                                entries.accept(BppBlocks.STRIPPED_EUCALYPTUS_LOG);
                                entries.accept(BppBlocks.STRIPPED_EUCALYPTUS_WOOD);
                                entries.accept(BppBlocks.EUCALYPTUS_PLANKS);
                                entries.accept(BppBlocks.EUCALYPTUS_STAIRS);
                                entries.accept(BppBlocks.EUCALYPTUS_SLAB);
                                entries.accept(BppBlocks.EUCALYPTUS_FENCE);
                                entries.accept(BppBlocks.EUCALYPTUS_FENCE_GATE);
                                entries.accept(BppBlocks.EUCALYPTUS_DOOR);
                                entries.accept(BppBlocks.EUCALYPTUS_TRAPDOOR);
                                entries.accept(BppBlocks.EUCALYPTUS_PRESSURE_PLATE);
                                entries.accept(BppBlocks.EUCALYPTUS_BUTTON);

                                entries.accept(BppBlocks.CYPRESS_LOG);
                                entries.accept(BppBlocks.CYPRESS_WOOD);
                                entries.accept(BppBlocks.STRIPPED_CYPRESS_LOG);
                                entries.accept(BppBlocks.STRIPPED_CYPRESS_WOOD);
                                entries.accept(BppBlocks.CYPRESS_PLANKS);
                                entries.accept(BppBlocks.CYPRESS_STAIRS);
                                entries.accept(BppBlocks.CYPRESS_SLAB);
                                entries.accept(BppBlocks.CYPRESS_FENCE);
                                entries.accept(BppBlocks.CYPRESS_FENCE_GATE);
                                entries.accept(BppBlocks.CYPRESS_DOOR);
                                entries.accept(BppBlocks.CYPRESS_TRAPDOOR);
                                entries.accept(BppBlocks.CYPRESS_PRESSURE_PLATE);
                                entries.accept(BppBlocks.CYPRESS_BUTTON);

                                entries.accept(BppBlocks.END_LOG);
                                entries.accept(BppBlocks.END_WOOD);
                                entries.accept(BppBlocks.STRIPPED_END_LOG);
                                entries.accept(BppBlocks.STRIPPED_END_WOOD);
                                entries.accept(BppBlocks.END_PLANKS);
                                entries.accept(BppBlocks.END_STAIRS);
                                entries.accept(BppBlocks.END_SLAB);
                                entries.accept(BppBlocks.END_FENCE);
                                entries.accept(BppBlocks.END_FENCE_GATE);
                                entries.accept(BppBlocks.END_DOOR);
                                entries.accept(BppBlocks.END_TRAPDOOR);
                                entries.accept(BppBlocks.END_PRESSURE_PLATE);
                                entries.accept(BppBlocks.END_BUTTON);

                                entries.accept(BppBlocks.FROZEN_LOG);
                                entries.accept(BppBlocks.FROZEN_WOOD);
                                entries.accept(BppBlocks.STRIPPED_FROZEN_LOG);
                                entries.accept(BppBlocks.STRIPPED_FROZEN_WOOD);
                                entries.accept(BppBlocks.FROZEN_PLANKS);
                                entries.accept(BppBlocks.FROZEN_STAIRS);
                                entries.accept(BppBlocks.FROZEN_SLAB);
                                entries.accept(BppBlocks.FROZEN_FENCE);
                                entries.accept(BppBlocks.FROZEN_FENCE_GATE);
                                entries.accept(BppBlocks.FROZEN_DOOR);
                                entries.accept(BppBlocks.FROZEN_TRAPDOOR);
                                entries.accept(BppBlocks.FROZEN_PRESSURE_PLATE);
                                entries.accept(BppBlocks.FROZEN_BUTTON);

                                entries.accept(BppBlocks.SCORCHED_STONE);
                                entries.accept(BppBlocks.SCORCHED_STONE_STAIRS);
                                entries.accept(BppBlocks.SCORCHED_STONE_SLAB);

                                entries.accept(BppBlocks.SCORCHED_COBBLESTONE);
                                entries.accept(BppBlocks.SCORCHED_COBBLESTONE_STAIRS);
                                entries.accept(BppBlocks.SCORCHED_COBBLESTONE_SLAB);
                                entries.accept(BppBlocks.SCORCHED_COBBLESTONE_WALL);

                                entries.accept(BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL);

                                entries.accept(BppBlocks.SCORCHED_STONE_BRICKS);
                                entries.accept(BppBlocks.SCORCHED_STONE_BRICK_STAIRS);
                                entries.accept(BppBlocks.SCORCHED_STONE_BRICK_SLAB);
                                entries.accept(BppBlocks.SCORCHED_STONE_BRICK_WALL);

                                entries.accept(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB);
                                entries.accept(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL);

                                entries.accept(BppBlocks.CRACKED_SCORCHED_STONE_BRICKS);

                                entries.accept(BppBlocks.SCORCHED_DIRT);
                                entries.accept(BppBlocks.COARSE_SCORCHED_DIRT);
                                entries.accept(BppBlocks.RANGES_DIRT);

                                entries.accept(BppBlocks.EUCALYPTUS_LEAVES);
                                entries.accept(BppBlocks.CYPRESS_LEAVES);
                                entries.accept(BppBlocks.END_LEAVES);
                                entries.accept(BppBlocks.FROZEN_LEAVES);

                                entries.accept(BppBlocks.HUGE_CYAN_MUSHROOM);
                                entries.accept(BppBlocks.HUGE_PURPLE_MUSHROOM);

                                entries.accept(BppBlocks.EUCALYPTUS_SAPLING);
                                entries.accept(BppBlocks.CYPRESS_SAPLING);
                                entries.accept(BppBlocks.END_SAPLING);
                                entries.accept(BppBlocks.FROZEN_SAPLING);
                                entries.accept(BppBlocks.FANCY_BIRCH_SAPLING);

                                entries.accept(BppBlocks.CYAN_MUSHROOM);
                                entries.accept(BppBlocks.PURPLE_MUSHROOM);

                                //entries.accept(BppItems.END_STONE_SCRAP);

                            }).build());

    public static void registerItemGroups()
    {
       BiomesPlusPlus.LOGGER.info("BPP Item Groups");
    }
}
