package bluestar.biomesplusplus.world.gen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

public class FiveBlockFoliagePlacer extends FoliagePlacer
{
    public static final Codec<FiveBlockFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            FiveBlockFoliagePlacer.foliagePlacerParts(instance).apply(instance, FiveBlockFoliagePlacer::new));

    public FiveBlockFoliagePlacer(IntProvider p1, IntProvider p2)
    {
        super(p1, p2);
    }

    @Override
    protected FoliagePlacerType<?> type()
    {
        return BppFoliagePlacerTypes.FIVE_BLOCK_FOLIAGE_PLACER;
    }



    @Override
    protected void createFoliage(LevelSimulatedReader world, FoliageSetter placer, RandomSource rand,
                                 TreeConfiguration treeConfiguration, int i, FoliageAttachment node, int j, int k, int l)
    {
        placeLeaf(world, placer, rand, treeConfiguration, node.pos().below().east());
        placeLeaf(world, placer, rand, treeConfiguration, node.pos().below().west());
        placeLeaf(world, placer, rand, treeConfiguration, node.pos().below().north());
        placeLeaf(world, placer, rand, treeConfiguration, node.pos().below().south());

        placeLeaf(world, placer, rand, treeConfiguration, node.pos());
    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return 1;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }

    public static void placeLeaf(LevelSimulatedReader world, FoliageSetter placer, RandomSource rand,
                                 TreeConfiguration treeConfiguration, BlockPos pos)
    {
        BlockState blockState = treeConfiguration.foliageProvider.getState(rand, pos);
        placer.set(pos, blockState);
    }

}
