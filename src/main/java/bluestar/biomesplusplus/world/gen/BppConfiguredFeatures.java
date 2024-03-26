package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.world.gen.tree.BppTrees;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class BppConfiguredFeatures
{
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_OAK_KEY = registerKey("tall_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_BIRCH_KEY = registerKey("fancy_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SWAMP_KEY = registerKey("tall_swamp");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROOFED_VINED_KEY = registerKey("roofed_vined");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_KEY = registerKey("dead");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        register(context, TALL_OAK_KEY, Feature.TREE,
                BppTrees.getStandardOakTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 10, 2));

        register(context, FANCY_BIRCH_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.BIRCH_LOG, Blocks.BIRCH_LEAVES));

        register(context, EUCALYPTUS_KEY, Feature.TREE,
                BppTrees.getAcaciaTree(BppBlocks.EUCALYPTUS_LOG, BppBlocks.EUCALYPTUS_LEAVES));

        register(context, TALL_SWAMP_KEY, Feature.TREE,
                BppTrees.getSwampTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 12, 4));

        register(context, DEAD_KEY, Feature.TREE,
                BppTrees.getStandardFancyTree(Blocks.DARK_OAK_LOG, Blocks.AIR));

        register(context, ROOFED_VINED_KEY, Feature.TREE,
                BppTrees.getDarkOakTree(Blocks.OAK_LOG, Blocks.OAK_LEAVES, true));
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
