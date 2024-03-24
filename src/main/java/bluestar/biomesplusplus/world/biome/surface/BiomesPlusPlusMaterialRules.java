package bluestar.biomesplusplus.world.biome.surface;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class BiomesPlusPlusMaterialRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);

    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);



    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        //"Grass" is first arg, "dirt" is second
        SurfaceRules.RuleSource stoneSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, STONE),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, STONE));

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(BppBiomes.STONE_BASIN), STONE),

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
                );
    }


    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
