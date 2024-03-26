package bluestar.biomesplusplus.world.biome;

import bluestar.biomesplusplus.BiomesPlusPlus;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;

import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.sounds.Music;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.jetbrains.annotations.Nullable;

public class BppBiomes
{
    private static final Music DESERT_MUSIC = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_DESERT);
    private static final Music FOREST_MUSIC = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_FOREST);
    private static final Music GROVE_MUSIC = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_CHERRY_GROVE);
    private static final Music JUNGLE_MUSIC = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_JUNGLE);
    private static final Music SWAMP_MUSIC = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP);

    public static final ResourceKey<Biome> STONE_BASIN = registerBiomeKey("stone_basin");
    public static final ResourceKey<Biome> TALL_OAK_FOREST = registerBiomeKey("tall_oak_forest");
    public static final ResourceKey<Biome> TALL_OAK_WETLAND = registerBiomeKey("tall_oak_wetland");
    public static final ResourceKey<Biome> WASTELAND = registerBiomeKey("wasteland");
    public static final ResourceKey<Biome> DARK_SWAMP = registerBiomeKey("dark_swamp");
    public static final ResourceKey<Biome> SILK_WETLAND = registerBiomeKey("silk_wetland");

    public static void bootstrap(BootstapContext<Biome> context)
    {

        context.register(STONE_BASIN, stoneBasin(context));
        context.register(TALL_OAK_FOREST, tallOakForest(context));
        context.register(TALL_OAK_WETLAND, tallOakWetland(context));
        context.register(WASTELAND, wasteland(context));
        context.register(DARK_SWAMP, darkSwamp(context));
        context.register(SILK_WETLAND, silkWetland(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder)
    {
        //BiomesPlusPlus.LOGGER.info("Init default region features for bpp overworld");
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }


    public static Biome stoneBasin(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp stoneBasin");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_DEAD_BUSH);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.2F)
                .temperature(1.4F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(BppBiomeColors.DEFAULT_WATER_COLOR)
                        .waterFogColor(BppBiomeColors.DEFAULT_WATER_FOG_COLOR)
                        .skyColor(BppBiomeColors.DESERT_BADLANDS_SKY_COLOR)
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();

    }

    public static Biome tallOakForest(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp tallOakForest");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_FOREST);



        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8F)
                .temperature(0.7F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(BppBiomeColors.DEFAULT_WATER_COLOR)
                        .waterFogColor(BppBiomeColors.DEFAULT_WATER_FOG_COLOR)
                        .skyColor(OverworldBiomes.calculateSkyColor(0.7f))
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(FOREST_MUSIC)
                        .build())
                .build();
    }

    public static Biome wasteland(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp wasteland");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addPlainGrass(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_DEAD_BUSH);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.0F)
                .temperature(2.0F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(BppBiomeColors.DEFAULT_WATER_COLOR)
                        .waterFogColor(BppBiomeColors.DEFAULT_WATER_FOG_COLOR)
                        .skyColor(BppBiomeColors.DESERT_BADLANDS_SKY_COLOR)
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(DESERT_MUSIC)
                        .build())
                .build();

    }

    public static Biome tallOakWetland(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp tallOakWetland");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 1, 1, 1));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FROG, 10, 2, 5));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        BiomeDefaultFeatures.addFossilDecoration(biomeBuilder);
        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addSwampClayDisk(biomeBuilder);
        BiomeDefaultFeatures.addSwampVegetation(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addSwampExtraVegetation(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_SWAMP);



        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.9F)
                .temperature(0.8F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x617B64)
                        .waterFogColor(0x232317)
                        .grassColorModifier(BiomeSpecialEffects.GrassColorModifier.SWAMP)
                        .foliageColorOverride(0x6A7039)
                        .skyColor(OverworldBiomes.calculateSkyColor(0.8f))
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(SWAMP_MUSIC)
                        .build())
                .build();
    }

    public static Biome darkSwamp(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp darkSwamp");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 1, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addSwampClayDisk(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FLOWER_SWAMP);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_NORMAL);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_DEAD_BUSH);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_WATERLILY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_SWAMP);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_SWAMP);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addSwampExtraVegetation(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_SWAMP);



        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8F)
                .temperature(0.7F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(7695176)
                        .waterFogColor(7695176)
                        .grassColorOverride(BppBiomeColors.ROOFED_SWAMP_GRASS_COLOR)
                        .foliageColorOverride(BppBiomeColors.ROOFED_SWAMP_FOLIAGE_COLOR)
                        .skyColor(BppBiomeColors.ROOFED_SWAMP_SKY_COLOR)
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(SWAMP_MUSIC)
                        .build())
                .build();
    }

    public static Biome silkWetland(BootstapContext<Biome> context)
    {
        BiomesPlusPlus.LOGGER.info("Init default biome features for bpp silkWetland");
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addSwampClayDisk(biomeBuilder);
        BiomeDefaultFeatures.addSwampVegetation(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addSwampExtraVegetation(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_SWAMP);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.9F)
                .temperature(0.8F)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(8291724)
                        .waterFogColor(8291724)
                        .grassColorOverride(BppBiomeColors.SILK_WETLAND_GRASS_COLOR)
                        .foliageColorOverride(BppBiomeColors.SILK_WETLAND_FOLIAGE_COLOR)
                        .skyColor(BppBiomeColors.SILK_WETLAND_SKY_COLOR)
                        .fogColor(BppBiomeColors.DEFAULT_FOG_COLOR)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(SWAMP_MUSIC)
                        .build())
                .build();
    }

    /*
     * @param name the biome name in underscore case.
     *
     */
    private static ResourceKey<Biome> registerBiomeKey(String name)
    {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
    }
}
