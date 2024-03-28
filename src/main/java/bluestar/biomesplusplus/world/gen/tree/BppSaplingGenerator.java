package bluestar.biomesplusplus.world.gen.tree;

import bluestar.biomesplusplus.world.gen.BppConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class BppSaplingGenerator
{
    public static final TreeGrower EUCALYPTUS =
            new TreeGrower("eucalyptus", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BppConfiguredFeatures.EUCALYPTUS_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final TreeGrower FANCY_BIRCH =
            new TreeGrower("fancy_birch", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BppConfiguredFeatures.FANCY_BIRCH_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final TreeGrower CYPRESS =
            new TreeGrower("cypress", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BppConfiguredFeatures.CYPRESS_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());


    public static final TreeGrower FROZEN =
            new TreeGrower("frozen", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BppConfiguredFeatures.FROZEN_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final TreeGrower TINY_END_BUSH =
            new TreeGrower("tiny_end", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(BppConfiguredFeatures.TINY_END_BUSH_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
