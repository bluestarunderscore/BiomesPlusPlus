package bluestar.biomesplusplus.world.gen;

import bluestar.biomesplusplus.BiomesPlusPlus;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class BppPlacedFeatures
{
    public static final ResourceKey<PlacedFeature> TALL_OAK_KEY_PLACED = registerKey("tall_oak");
    public static final ResourceKey<PlacedFeature> FANCY_BIRCH_KEY_PLACED = registerKey("fancy_birch");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_KEY_PLACED = registerKey("eucalyptus");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_RANGES_KEY_PLACED = registerKey("eucalyptus_ranges");
    public static final ResourceKey<PlacedFeature> TALL_SWAMP_KEY_PLACED = registerKey("tall_swamp");
    public static final ResourceKey<PlacedFeature> DEAD_KEY_PLACED = registerKey("dead");
    public static final ResourceKey<PlacedFeature> ROOFED_VINED_KEY_PLACED = registerKey("roofed_vined");

    public static final ResourceKey<PlacedFeature> CYPRESS_KEY_PLACED = registerKey("cypress");
    public static final ResourceKey<PlacedFeature> FROZEN_KEY_PLACED = registerKey("frozen");

    public static final ResourceKey<PlacedFeature> WEB_BUSH_KEY_PLACED = registerKey("web_bush");
    public static final ResourceKey<PlacedFeature> OAK_BUSH_KEY_PLACED = registerKey("oak_bush");

    public static final ResourceKey<PlacedFeature> OAK_PINE_KEY_PLACED = registerKey("oak_pine");

    public static final ResourceKey<PlacedFeature> TINY_END_BUSH_KEY_PLACED = registerKey("tiny_end_bush");

    public static final ResourceKey<PlacedFeature> TINY_OAK_BUSH_KEY_PLACED = registerKey("tiny_oak_bush");


    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, TALL_OAK_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.TALL_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(9, 0.01f, 10),(Blocks.OAK_SAPLING)));

        register(context, FANCY_BIRCH_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.FANCY_BIRCH_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(13),(Blocks.OAK_SAPLING)));

        register(context, EUCALYPTUS_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.EUCALYPTUS_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(35),(Blocks.OAK_SAPLING)));

        register(context, EUCALYPTUS_RANGES_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.EUCALYPTUS_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(9),(Blocks.OAK_SAPLING)));

        register(context, TALL_SWAMP_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.TALL_SWAMP_KEY),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(9, 0.01f, 10),(Blocks.OAK_SAPLING)));

        register(context, DEAD_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.DEAD_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(2),(Blocks.OAK_SAPLING)));

        register(context, ROOFED_VINED_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.ROOFED_VINED_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(50, 0.01f, 1),(Blocks.OAK_SAPLING)));

        register(context, WEB_BUSH_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.WEB_BUSH_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(2),(Blocks.OAK_SAPLING)));

        register(context, CYPRESS_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.CYPRESS_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(2),(Blocks.OAK_SAPLING)));

        register(context, FROZEN_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.FROZEN_KEY),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(3),(Blocks.OAK_SAPLING)));

        register(context, OAK_PINE_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.OAK_PINE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.01f, 1),(Blocks.OAK_SAPLING)));

        register(context, OAK_BUSH_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.OAK_BUSH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(8, 0.01f, 1),(Blocks.OAK_SAPLING)));

        register(context, TINY_OAK_BUSH_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.TINY_OAK_BUSH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(8, 0.01f, 1),(Blocks.OAK_SAPLING)));

        register(context, TINY_END_BUSH_KEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(BppConfiguredFeatures.TINY_END_BUSH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(8, 0.01f, 1),(Blocks.OAK_SAPLING)));

    }

    public static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
    }


    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<PlacedFeature> context,
                                                                                          ResourceKey<PlacedFeature> key,
                                                                                          Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                          PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}
