package bluestar.biomesplusplus.world.biome.surface;

import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class BiomesPlusPlusMaterialRules
{
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);

    private static final MaterialRules.MaterialRule BASIN = makeStateRule(Blocks.STONE);


    public static MaterialRules.MaterialRule makeRules()
    {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(BppBiomes.STONE_BASIN),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, BASIN)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BASIN)),

                // DEFAULT GRASS + DIRT
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }
    public static MaterialRules.MaterialRule makeStateRule(Block block)
    {
        return MaterialRules.block(block.getDefaultState());
    }
}
