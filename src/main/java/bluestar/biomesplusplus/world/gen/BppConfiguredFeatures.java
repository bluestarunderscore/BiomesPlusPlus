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

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.IceSpikeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class BppConfiguredFeatures
{

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_OAK_KEY = registerKey("tall_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_BIRCH_KEY = registerKey("fancy_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SWAMP_KEY = registerKey("tall_swamp");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROOFED_VINED_KEY = registerKey("roofed_vined");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_KEY = registerKey("dead");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_KEY = registerKey("frozen");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WEB_BUSH_KEY = registerKey("web_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_BUSH_KEY = registerKey("oak_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_PINE_KEY = registerKey("oak_pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TINY_OAK_BUSH_KEY = registerKey("tiny_oak_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TINY_END_BUSH_KEY = registerKey("tiny_end_bush");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        register(context, TALL_OAK_KEY, Feature.TREE,
                BppTrees.getStandardOakTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 10, 2));

        register(context, FANCY_BIRCH_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.BIRCH_LOG, Blocks.BIRCH_LEAVES));

        register(context, EUCALYPTUS_KEY, Feature.TREE,
                BppTrees.getAcaciaTree(BppBlocks.EUCALYPTUS_LOG, BppBlocks.EUCALYPTUS_LEAVES));

        register(context, TALL_SWAMP_KEY, Feature.TREE,
                BppTrees.getSwampTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 12, 4, true));

        register(context, DEAD_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.DARK_OAK_LOG, Blocks.AIR));

        register(context, ROOFED_VINED_KEY, Feature.TREE,
                BppTrees.getDarkOakTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, true));

        register(context, WEB_BUSH_KEY, Feature.TREE,
                BppTrees.getBush(Blocks.COBWEB, Blocks.COBWEB));

        register(context, CYPRESS_KEY, Feature.TREE,
                BppTrees.getSwampTree(BppBlocks.CYPRESS_LOG, BppBlocks.CYPRESS_LEAVES, 7, 3, false));

        register(context, FROZEN_KEY, Feature.TREE,
                BppTrees.getSpruceTree(BppBlocks.FROZEN_LOG, BppBlocks.FROZEN_LEAVES));

        register(context, OAK_PINE_KEY, Feature.TREE,
                BppTrees.getPineTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, OAK_BUSH_KEY, Feature.TREE,
                BppTrees.getBush(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, TINY_OAK_BUSH_KEY, Feature.TREE,
                BppTrees.getTinyBush(Blocks.OAK_LOG, Blocks.OAK_LEAVES));

        register(context, TINY_END_BUSH_KEY, Feature.TREE,
                BppTrees.getTinyBush(BppBlocks.END_LOG, BppBlocks.END_LEAVES));

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
