package bluestar.biomesplusplus.world.gen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class TallSwampTrunkPlacer extends TrunkPlacer
{
    public static final Codec<TallSwampTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> TallSwampTrunkPlacer.trunkPlacerParts(instance).apply(instance, TallSwampTrunkPlacer::new));

    public TallSwampTrunkPlacer(int baseHeight, int r1, int r2)
    {
        super(baseHeight, r1, r2);
    }

    @Override
    protected TrunkPlacerType<?> type()
    {
        return BppTrunkPlacerTypes.TALL_SWAMP_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer,
                                                            RandomSource rand, int height, BlockPos startPos, TreeConfiguration treeConfig)
    {
        StraightTrunkPlacer.setDirtAt(world, replacer, rand, startPos.below(), treeConfig);
        StraightTrunkPlacer.setDirtAt(world, replacer, rand, startPos.below().east(), treeConfig);
        StraightTrunkPlacer.setDirtAt(world, replacer, rand, startPos.below().west(), treeConfig);
        StraightTrunkPlacer.setDirtAt(world, replacer, rand, startPos.below().north(), treeConfig);
        StraightTrunkPlacer.setDirtAt(world, replacer, rand, startPos.below().south(), treeConfig);

        int eHeight = 3 + rand.nextInt(2);
        int wHeight = 3 + rand.nextInt(2);
        int nHeight = 3 + rand.nextInt(2);
        int sHeight = 3 + rand.nextInt(2);
        for (int j = 0; j < height; ++j)
        {
            if(j < eHeight) this.placeLog(world, replacer, rand, startPos.east().above(j), treeConfig);
            if(j < wHeight) this.placeLog(world, replacer, rand, startPos.west().above(j), treeConfig);
            if(j < nHeight) this.placeLog(world, replacer, rand, startPos.north().above(j), treeConfig);
            if(j < sHeight) this.placeLog(world, replacer, rand, startPos.south().above(j), treeConfig);
            this.placeLog(world, replacer, rand, startPos.east().above(eHeight), treeConfig);
            this.placeLog(world, replacer, rand, startPos.west().above(wHeight), treeConfig);
            this.placeLog(world, replacer, rand, startPos.north().above(nHeight), treeConfig);
            this.placeLog(world, replacer, rand, startPos.south().above(sHeight), treeConfig);


            this.placeLog(world, replacer, rand, startPos.above(j), treeConfig);
        }

        //Return what appears to be the internal position of the top of the trunk.
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(height), 0, false));
    }


}
