package bluestar.biomesplusplus;

import bluestar.biomesplusplus.registry.BppRegistryLoader;
import bluestar.biomesplusplus.world.biome.BiomesPlusPlusOverworldRegion;
import bluestar.biomesplusplus.world.biome.surface.BiomesPlusPlusMaterialRules;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class BiomesPlusPlus implements ModInitializer, TerraBlenderApi
{
	// Writes text to console and log file
	// Use MOD_ID as logger's name, makes debugging easier
	public static final String MOD_ID = "biomesplusplus";
	public static final String REGISTRY_ID = "BiomesPlusPlus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize()
	{
		BppRegistryLoader.loadCoreRegistries();
		BppRegistryLoader.loadLevelRegistries();
		LOGGER.info("BiomesPlusPlus loaded");
	}

	@Override
	public void onTerraBlenderInitialized()
	{
		Regions.register(new BiomesPlusPlusOverworldRegion(new ResourceLocation(MOD_ID, "overworld"), 10));

		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, BiomesPlusPlusMaterialRules.makeRules());
	}
}