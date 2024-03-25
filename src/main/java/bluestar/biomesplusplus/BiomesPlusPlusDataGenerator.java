package bluestar.biomesplusplus;

import bluestar.biomesplusplus.datagen.*;
import bluestar.biomesplusplus.world.biome.BppBiomes;
import bluestar.biomesplusplus.world.gen.BppConfiguredFeatures;
import bluestar.biomesplusplus.world.gen.BppPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class BiomesPlusPlusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BppBlockTagGenerator::new);
		pack.addProvider(BppItemTagGenerator::new);
		pack.addProvider(BppRecipeGenerator::new);
		pack.addProvider(BppLootTableGenerator::new);
		pack.addProvider(BppModelGenerator::new);
		pack.addProvider(BppWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder builder)
	{
		builder.add(Registries.CONFIGURED_FEATURE, BppConfiguredFeatures::bootstrap);
		builder.add(Registries.PLACED_FEATURE, BppPlacedFeatures::bootstrap);
		builder.add(Registries.BIOME, BppBiomes::bootstrap);
	}

}
