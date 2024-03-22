package bluestar.biomesplusplus.world.biome;

import bluestar.biomesplusplus.BiomesPlusPlus;
import bluestar.biomesplusplus.world.biome.surface.BiomesPlusPlusMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class BppTerrablenderAPI implements TerraBlenderApi
{
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new BiomesPlusPlusOverworldRegion(new Identifier(BiomesPlusPlus.MOD_ID, "bpp_overworld"), 10));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, BiomesPlusPlus.MOD_ID, BiomesPlusPlusMaterialRules.makeRules());
    }
}
