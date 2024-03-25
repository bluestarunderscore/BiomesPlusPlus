package bluestar.biomesplusplus.world.biome.surface;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class BiomesPlusPlusMaterialRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);

    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);

    private static final SurfaceRules.RuleSource DRIED_STONE = makeStateRule(Blocks.SMOOTH_SANDSTONE);



    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isAtSurface = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63),0);
        SurfaceRules.ConditionSource isAtOrAbove62 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62),0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        //"Grass" is first arg, "dirt" is second
        SurfaceRules.RuleSource wastelandSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, STONE),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, DRIED_STONE));

        SurfaceRules.RuleSource stoneSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(isAtOrAbove62, STONE)),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(isAtOrAbove62, STONE)));

        /*SurfaceRules.RuleSource swampySurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(BppBiomes.TALL_OAK_WETLAND),
                                        SurfaceRules.ifTrue(isAtOrAbove62,
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.not(isAtSurface),
                                                        SurfaceRules.ifTrue(
                                                                SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                                                makeStateRule(Blocks.WATER))
                                                        )
                                                ))
                                );
        */
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.STONE_BASIN), stoneSurface));
    }


    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
