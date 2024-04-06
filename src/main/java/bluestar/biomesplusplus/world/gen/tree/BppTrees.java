package bluestar.biomesplusplus.world.gen.tree;

import bluestar.biomesplusplus.world.gen.tree.custom.FiveBlockFoliagePlacer;
import bluestar.biomesplusplus.world.gen.tree.custom.TallSwampTrunkPlacer;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.IceSpikeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

public class BppTrees
{
    public static TreeConfiguration getStandardOakTree(Block log, Block leaves, int height, int variation)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(height,variation,0),
                BlockStateProvider.simple(leaves),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1,0,2))
                .build();
    }

    public static TreeConfiguration getStandardFancyTree(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(leaves),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0))
                .build();
    }

    public static TreeConfiguration getSwampTree(Block log, Block leaves, int height, int variation, boolean hasRoots)
    {
        if(hasRoots)
        {
            return new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(log),
                    new TallSwampTrunkPlacer(height, variation, 0),
                    BlockStateProvider.simple(leaves),
                    new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1))
                    .decorators(ImmutableList.of(new LeaveVineDecorator(0.31f))).build();
        }
        else
        {
            return new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(log),
                    new StraightTrunkPlacer(height, variation, 0),
                    BlockStateProvider.simple(leaves),
                    new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1))
                    .decorators(ImmutableList.of(new LeaveVineDecorator(0.31f))).build();
        }
    }

    public static TreeConfiguration getAcaciaTree(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new ForkingTrunkPlacer(6, 2, 2),
                BlockStateProvider.simple(leaves),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1,0,2))
                .build();
    }

    public static TreeConfiguration getDarkOakTree(int height, int variation, Block log, Block leaves, boolean hasVines)
    {
        if(hasVines)
        {
            return new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(log),
                    new DarkOakTrunkPlacer(height, variation, 1),
                    BlockStateProvider.simple(leaves),
                    new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                    .decorators(ImmutableList.of(new LeaveVineDecorator(0.31f))).build();
        }
        else
        {
            return new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(log),
                    new DarkOakTrunkPlacer(height, variation, 1),
                    BlockStateProvider.simple(leaves),
                    new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()))
                    .build();
        }

    }

    public static TreeConfiguration getJungleTree(int height, int variation, Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log), new MegaJungleTrunkPlacer(height, variation, 19),
                BlockStateProvider.simple(leaves),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(TrunkVineDecorator.INSTANCE,
                new LeaveVineDecorator(0.23f))).build();

    }
    public static TreeConfiguration getSpruceTree(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
        new StraightTrunkPlacer(9, 2, 1),
        BlockStateProvider.simple(leaves),
        new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
        new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build();

    }

    public static TreeConfiguration getPineTree(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(6, 4, 0),
                BlockStateProvider.simple(leaves),
                new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
                new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build();
    }

    public static TreeConfiguration getBush(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(leaves),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)).build();
    }

    public static TreeConfiguration getTinyBush(Block log, Block leaves)
    {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(log),
                new StraightTrunkPlacer(2,1,0),
                BlockStateProvider.simple(leaves),
                new FiveBlockFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1)),
                new TwoLayersFeatureSize(0,0,0)).build();
    }

    public static TreeConfiguration getCherryTree(Block log, Block leaves)
    {
       return new TreeConfiguration.TreeConfigurationBuilder(
               BlockStateProvider.simple(log),
               new CherryTrunkPlacer(7,1,0, ConstantInt.of(3), UniformInt.of(2,4), UniformInt.of(-4,-3), UniformInt.of(-1,0)),
               BlockStateProvider.simple(leaves), new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25f, 0.5f, 0.16666667f, 0.33333334f),
                       new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build();

    }

}
