package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.world.gen.tree.BppTrees;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.IceSpikeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class BppConfiguredFeatures
{

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_OAK_KEY = registerKey("tall_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGIC_OAK_KEY = registerKey("magic_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_BIRCH_KEY = registerKey("fancy_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_OAK_KEY = registerKey("fancy_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SWAMP_KEY = registerKey("tall_swamp");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROOFED_VINED_KEY = registerKey("roofed_vined");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_KEY = registerKey("dead");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_KEY = registerKey("frozen");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WEB_BUSH_KEY = registerKey("web_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_BUSH_KEY = registerKey("oak_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_BUSH_KEY = registerKey("end_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_PINE_KEY = registerKey("oak_pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TINY_OAK_BUSH_KEY = registerKey("tiny_oak_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TINY_END_BUSH_KEY = registerKey("tiny_end_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_END_KEY = registerKey("dark_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_END_KEY = registerKey("jungle_end");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RAINFOREST_OAK_KEY = registerKey("rainforest_oak");

    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_CYAN_MUSHROOM_KEY = registerKey("huge_cyan_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_PURPLE_MUSHROOM_KEY = registerKey("huge_purple_mushroom");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        register(context, TALL_OAK_KEY, Feature.TREE,
                BppTrees.getStandardOakTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 10, 2));

        register(context, FANCY_BIRCH_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.BIRCH_LOG, Blocks.BIRCH_LEAVES));

        register(context, FANCY_OAK_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, EUCALYPTUS_KEY, Feature.TREE,
                BppTrees.getAcaciaTree(BppBlocks.EUCALYPTUS_LOG, BppBlocks.EUCALYPTUS_LEAVES));

        register(context, TALL_SWAMP_KEY, Feature.TREE,
                BppTrees.getSwampTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 12, 4, true));

        register(context, DEAD_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.DARK_OAK_LOG, Blocks.AIR));

        register(context, ROOFED_VINED_KEY, Feature.TREE,
                BppTrees.getDarkOakTree(6, 2, Blocks.OAK_LOG, Blocks.OAK_LEAVES, true));

        register(context, WEB_BUSH_KEY, Feature.TREE,
                BppTrees.getBush(Blocks.COBWEB, Blocks.COBWEB));

        register(context, END_BUSH_KEY, Feature.TREE,
                BppTrees.getBush(BppBlocks.END_LOG, BppBlocks.END_LEAVES));

        register(context, CYPRESS_KEY, Feature.TREE,
                BppTrees.getSwampTree(BppBlocks.CYPRESS_LOG, BppBlocks.CYPRESS_LEAVES, 7, 3, false));

        register(context, FROZEN_KEY, Feature.TREE,
                BppTrees.getSpruceTree(BppBlocks.FROZEN_LOG, BppBlocks.FROZEN_LEAVES));

        register(context, OAK_PINE_KEY, Feature.TREE,
                BppTrees.getPineTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, OAK_BUSH_KEY, Feature.TREE,
                BppTrees.getBush(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, TINY_OAK_BUSH_KEY, Feature.TREE,
                BppTrees.getTinyBush(2, 1, Blocks.OAK_LOG, Blocks.OAK_LEAVES, false));

        register(context, TINY_END_BUSH_KEY, Feature.TREE,
                BppTrees.getTinyBush(2, 1, BppBlocks.END_LOG, BppBlocks.END_LEAVES, false));

        register(context, DARK_END_KEY, Feature.TREE,
                BppTrees.getDarkOakTree(16, 5, BppBlocks.END_LOG, BppBlocks.END_LEAVES, false));

        register(context, JUNGLE_END_KEY, Feature.TREE,
                BppTrees.getJungleTree(14, 3, BppBlocks.END_LOG, BppBlocks.END_LEAVES));

        register(context, MAGIC_OAK_KEY, Feature.TREE,
                BppTrees.getCherryTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, RAINFOREST_OAK_KEY, Feature.TREE,
                BppTrees.getMegaSpruceTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, HUGE_CYAN_MUSHROOM_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfiguration(BlockStateProvider.simple((BlockState)BppBlocks.HUGE_CYAN_MUSHROOM.defaultBlockState().setValue(HugeMushroomBlock.DOWN, false)), BlockStateProvider.simple((BlockState)((BlockState)Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, false)).setValue(HugeMushroomBlock.DOWN, false)), 2));

        register(context, HUGE_PURPLE_MUSHROOM_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfiguration(BlockStateProvider.simple((BlockState)BppBlocks.HUGE_PURPLE_MUSHROOM.defaultBlockState().setValue(HugeMushroomBlock.DOWN, false)), BlockStateProvider.simple((BlockState)((BlockState)Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, false)).setValue(HugeMushroomBlock.DOWN, false)), 2));


    }

    public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                          F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
