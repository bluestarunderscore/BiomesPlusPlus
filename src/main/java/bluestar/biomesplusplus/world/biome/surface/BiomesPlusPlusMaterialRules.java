package bluestar.biomesplusplus.world.biome.surface;

import bluestar.biomesplusplus.block.BppBlocks;
import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class BiomesPlusPlusMaterialRules
{
    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.AIR);

    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);

    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);

    private static final SurfaceRules.RuleSource MUD = makeStateRule(Blocks.MUD);

    private static final SurfaceRules.RuleSource SCORCHED_STONE = makeStateRule(BppBlocks.SCORCHED_STONE);
    private static final SurfaceRules.RuleSource SCORCHED_COBBLESTONE = makeStateRule(BppBlocks.SCORCHED_COBBLESTONE);
    private static final SurfaceRules.RuleSource SCORCHED_DIRT = makeStateRule(BppBlocks.SCORCHED_DIRT);
    private static final SurfaceRules.RuleSource COARSE_SCORCHED_DIRT = makeStateRule(BppBlocks.COARSE_SCORCHED_DIRT);

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        SurfaceRules.RuleSource wastelandNoise = SurfaceRules.sequence(
                SurfaceRules.ifTrue(surfaceNoiseAbove(0.86D), SCORCHED_DIRT), SurfaceRules.ifTrue(surfaceNoiseAbove(0.41D), SCORCHED_COBBLESTONE), SCORCHED_STONE);

        //"Grass" is first arg, "dirt" is second for the below statement
        SurfaceRules.RuleSource stoneSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(isAbove(60), AIR)),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(isAbove(60), STONE)));

        SurfaceRules.RuleSource mudSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(isAbove(59), MUD)),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(isAbove(59), MUD)));

        SurfaceRules.RuleSource wastelandSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(isAbove(48), wastelandNoise)),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(isAbove(48), wastelandNoise)));

        SurfaceRules.RuleSource swampySurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(BppBiomes.TALL_OAK_WETLAND),
                                        SurfaceRules.ifTrue(isAbove(62),
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.not(isAbove(63)),
                                                        SurfaceRules.ifTrue(
                                                                SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                                                makeStateRule(Blocks.WATER))
                                                        )
                                                ))
                        )));

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.STONE_BASIN), stoneSurface),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.WASTELAND), wastelandSurface),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.TALL_OAK_WETLAND), SurfaceRules.sequence(SurfaceRules.ifTrue(surfaceNoiseAbove(0.9D), mudSurface),swampySurface)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.DARK_SWAMP), swampySurface),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.SILK_WETLAND), swampySurface));

    }



    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double noise)
    {
        return SurfaceRules.noiseCondition(Noises.SURFACE, noise / 9D, Double.MAX_VALUE);
    }

    private static SurfaceRules.ConditionSource isAbove(int y_level)
    {
        return SurfaceRules.yBlockCheck(VerticalAnchor.absolute(y_level),0);
    }
}
