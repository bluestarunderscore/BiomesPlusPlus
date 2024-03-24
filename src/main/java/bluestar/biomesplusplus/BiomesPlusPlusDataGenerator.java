package bluestar.biomesplusplus;

import bluestar.biomesplusplus.datagen.BppWorldGenerator;
import bluestar.biomesplusplus.world.biome.BppBiomes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class BiomesPlusPlusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		BiomesPlusPlus.LOGGER.info("Init bpp datagen");
		pack.addProvider(BppWorldGenerator::new);
	}

	//May not be registering properly, unsure
	@Override
	public void buildRegistry(RegistrySetBuilder builder)
	{
		BiomesPlusPlus.LOGGER.info("Building BPP Biomes (If this didn't print, something broke)");
		builder.add(Registries.BIOME, BppBiomes::bootstrap);
	}

}
