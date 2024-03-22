package bluestar.biomesplusplus;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomesPlusPlus implements ModInitializer
{
	// Writes text to console and log file
	// Use MOD_ID as logger's name, makes debugging easier
	public static final String MOD_ID = "biomesplusplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		// Runs when Minecraft is in a mod-load-ready state
		// However, some things (resources) may still be uninitialized (caution)

		LOGGER.info("Hello Fabric world!");
	}
}