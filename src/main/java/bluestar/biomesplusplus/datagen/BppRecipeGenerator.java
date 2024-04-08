package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.*;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.util.datafix.fixes.FurnaceRecipeFix;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public class BppRecipeGenerator extends FabricRecipeProvider
{
    public BppRecipeGenerator(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter)
    {
        //FURNACE
        BppRecipeGenerator.smeltingResultFromBase(exporter, BppBlocks.SCORCHED_STONE, BppBlocks.SCORCHED_COBBLESTONE);
        BppRecipeGenerator.smeltingResultFromBase(exporter, BppBlocks.CRACKED_SCORCHED_STONE_BRICKS, BppBlocks.SCORCHED_STONE_BRICKS);

        //STONECUTTER
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_SLAB, BppBlocks.SCORCHED_STONE, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_STAIRS, BppBlocks.SCORCHED_STONE);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, BppBlocks.SCORCHED_STONE_BRICK_WALL, BppBlocks.SCORCHED_STONE);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICKS, BppBlocks.SCORCHED_STONE);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_SLAB, BppBlocks.SCORCHED_STONE, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_STAIRS, BppBlocks.SCORCHED_STONE);

        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_SLAB, BppBlocks.SCORCHED_STONE_BRICKS, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_STAIRS, BppBlocks.SCORCHED_STONE_BRICKS);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, BppBlocks.SCORCHED_STONE_BRICK_WALL, BppBlocks.SCORCHED_STONE_BRICKS);

        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB, BppBlocks.MOSSY_SCORCHED_STONE_BRICKS, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS, BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL, BppBlocks.MOSSY_SCORCHED_STONE_BRICKS);

        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_COBBLESTONE_SLAB, BppBlocks.SCORCHED_COBBLESTONE, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_COBBLESTONE_STAIRS, BppBlocks.SCORCHED_COBBLESTONE);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, BppBlocks.SCORCHED_COBBLESTONE_WALL, BppBlocks.SCORCHED_COBBLESTONE);

        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB, BppBlocks.MOSSY_SCORCHED_COBBLESTONE, 2);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE);
        BppRecipeGenerator.stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL, BppBlocks.MOSSY_SCORCHED_COBBLESTONE);


        //MOSSY COBBLE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE, 4).requires(BppBlocks.SCORCHED_COBBLESTONE).requires(Blocks.MOSS_BLOCK)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_COBBLESTONE), FabricRecipeProvider.has(BppBlocks.SCORCHED_COBBLESTONE))
                .save(exporter, new ResourceLocation("mossy_scorched_cobblestone_moss"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE, 4).requires(BppBlocks.SCORCHED_COBBLESTONE).requires(Blocks.VINE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_COBBLESTONE), FabricRecipeProvider.has(BppBlocks.SCORCHED_COBBLESTONE))
                .save(exporter, new ResourceLocation("mossy_scorched_cobblestone_vine"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICKS, 4).requires(BppBlocks.SCORCHED_STONE_BRICKS).requires(Blocks.MOSS_BLOCK)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE_BRICKS), FabricRecipeProvider.has(BppBlocks.SCORCHED_STONE_BRICKS))
                .save(exporter, new ResourceLocation("mossy_scorched_stone_brick_moss"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICKS, 4).requires(BppBlocks.SCORCHED_STONE_BRICKS).requires(Blocks.VINE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE_BRICKS), FabricRecipeProvider.has(BppBlocks.SCORCHED_STONE_BRICKS))
                .save(exporter, new ResourceLocation("mossy_scorched_stone_brick_vine"));

        //STONE SLABS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.SCORCHED_STONE).unlockedBy(getHasName(BppBlocks.SCORCHED_STONE), has(BppBlocks.SCORCHED_STONE_SLAB))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_STONE_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_COBBLESTONE_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_COBBLESTONE), has(BppBlocks.SCORCHED_COBBLESTONE_SLAB))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_COBBLESTONE_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE), has(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE_BRICKS), has(BppBlocks.SCORCHED_STONE_BRICK_SLAB))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_STONE_BRICK_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS), has(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_SLAB)));

        //STONE STAIRS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.SCORCHED_STONE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE), has(BppBlocks.SCORCHED_STONE_STAIRS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_STONE_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_COBBLESTONE_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_COBBLESTONE), has(BppBlocks.SCORCHED_COBBLESTONE_STAIRS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_COBBLESTONE_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE), has(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.SCORCHED_STONE_BRICK_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE_BRICKS), has(BppBlocks.SCORCHED_STONE_BRICK_STAIRS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_STONE_BRICK_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS), has(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_STAIRS)));

        //WALLS
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BppBlocks.SCORCHED_COBBLESTONE_WALL, 6)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_COBBLESTONE), has(BppBlocks.SCORCHED_COBBLESTONE_WALL))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_COBBLESTONE_WALL)));
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL, 6)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_COBBLESTONE)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE), has(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_COBBLESTONE_WALL)));
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BppBlocks.SCORCHED_STONE_BRICK_WALL, 6)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.SCORCHED_STONE_BRICKS), has(BppBlocks.SCORCHED_STONE_BRICK_WALL))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.SCORCHED_STONE_BRICK_WALL)));
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL, 6)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.MOSSY_SCORCHED_STONE_BRICKS)
                .unlockedBy(getHasName(BppBlocks.MOSSY_SCORCHED_STONE_BRICKS), has(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.MOSSY_SCORCHED_STONE_BRICK_WALL)));

        //PLANKS (LOG AND BARK)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.EUCALYPTUS_LOG)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_LOG), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_PLANKS)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_PLANKS, 4).requires(BppBlocks.CYPRESS_LOG)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_LOG), FabricRecipeProvider.has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_PLANKS)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_PLANKS, 4).requires(BppBlocks.END_LOG)
                .unlockedBy(getHasName(BppBlocks.END_LOG), FabricRecipeProvider.has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_PLANKS)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_PLANKS, 4).requires(BppBlocks.FROZEN_LOG)
                .unlockedBy(getHasName(BppBlocks.FROZEN_LOG), FabricRecipeProvider.has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_PLANKS)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.STRIPPED_EUCALYPTUS_LOG)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_EUCALYPTUS_LOG), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation("stripped_eucalyptus_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_PLANKS, 4).requires(BppBlocks.STRIPPED_CYPRESS_LOG)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_CYPRESS_LOG), FabricRecipeProvider.has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation("stripped_cypress_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_PLANKS, 4).requires(BppBlocks.STRIPPED_END_LOG)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_END_LOG), FabricRecipeProvider.has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation("stripped_end_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_PLANKS, 4).requires(BppBlocks.STRIPPED_FROZEN_LOG)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_FROZEN_LOG), FabricRecipeProvider.has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation("stripped_frozen_planks"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.EUCALYPTUS_WOOD)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_WOOD), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation("bark_eucalyptus_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_PLANKS, 4).requires(BppBlocks.CYPRESS_WOOD)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_WOOD), FabricRecipeProvider.has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation("bark_cypress_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_PLANKS, 4).requires(BppBlocks.END_WOOD)
                .unlockedBy(getHasName(BppBlocks.END_WOOD), FabricRecipeProvider.has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation("bark_end_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_PLANKS, 4).requires(BppBlocks.FROZEN_WOOD)
                .unlockedBy(getHasName(BppBlocks.FROZEN_WOOD), FabricRecipeProvider.has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation("bark_frozen_planks"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.STRIPPED_EUCALYPTUS_WOOD)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_EUCALYPTUS_WOOD), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation("stripped_bark_eucalyptus_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_PLANKS, 4).requires(BppBlocks.STRIPPED_CYPRESS_WOOD)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_CYPRESS_WOOD), FabricRecipeProvider.has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation("stripped_bark_cypress_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_PLANKS, 4).requires(BppBlocks.STRIPPED_END_WOOD)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_END_WOOD), FabricRecipeProvider.has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation("stripped_bark_end_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_PLANKS, 4).requires(BppBlocks.STRIPPED_FROZEN_WOOD)
                .unlockedBy(getHasName(BppBlocks.STRIPPED_FROZEN_WOOD), FabricRecipeProvider.has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation("stripped_bark_frozen_planks"));


        //WOOD BUTTONS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BppBlocks.EUCALYPTUS_BUTTON, 1)
                .requires(BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS),
                        FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_BUTTON))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BppBlocks.CYPRESS_BUTTON, 1)
                .requires(BppBlocks.CYPRESS_PLANKS).unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS),
                        FabricRecipeProvider.has(BppBlocks.CYPRESS_BUTTON))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BppBlocks.END_BUTTON, 1)
                .requires(BppBlocks.END_PLANKS).unlockedBy(getHasName(BppBlocks.END_PLANKS),
                        FabricRecipeProvider.has(BppBlocks.END_BUTTON))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BppBlocks.FROZEN_BUTTON, 1)
                .requires(BppBlocks.FROZEN_PLANKS).unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS),
                        FabricRecipeProvider.has(BppBlocks.FROZEN_BUTTON))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_BUTTON)));

        //WOOD SLABS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_SLAB)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.CYPRESS_PLANKS).unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_SLAB)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.END_PLANKS).unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_SLAB)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_SLAB, 6)
                .pattern("PPP").define('P', BppBlocks.FROZEN_PLANKS).unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_SLAB)));

        //WOOD STAIRS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.CYPRESS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.END_PLANKS)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_STAIRS, 4)
                .pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.FROZEN_PLANKS)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_STAIRS)));


        //PRESSURE PLATES
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BppBlocks.EUCALYPTUS_PRESSURE_PLATE, 1).pattern(" PP").define('P', BppBlocks.EUCALYPTUS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_PRESSURE_PLATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BppBlocks.CYPRESS_PRESSURE_PLATE, 1).pattern(" PP").define('P', BppBlocks.CYPRESS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_PRESSURE_PLATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BppBlocks.END_PRESSURE_PLATE, 1).pattern(" PP").define('P', BppBlocks.END_PLANKS)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_PRESSURE_PLATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, BppBlocks.FROZEN_PRESSURE_PLATE, 1).pattern(" PP").define('P', BppBlocks.FROZEN_PLANKS)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_PRESSURE_PLATE)));

        //FENCES
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_FENCE, 3)
                .pattern("PSP").pattern("PSP").define('P', BppBlocks.EUCALYPTUS_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_FENCE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_FENCE, 3)
                .pattern("PSP").pattern("PSP").define('P', BppBlocks.CYPRESS_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_FENCE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_FENCE, 3)
                .pattern("PSP").pattern("PSP").define('P', BppBlocks.END_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_FENCE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_FENCE, 3)
                .pattern("PSP").pattern("PSP").define('P', BppBlocks.FROZEN_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_FENCE)));

        //FENCE GATES
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_FENCE_GATE, 1)
                .pattern("SPS").pattern("SPS").define('P', BppBlocks.EUCALYPTUS_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_FENCE_GATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_FENCE_GATE, 1)
                .pattern("SPS").pattern("SPS").define('P', BppBlocks.CYPRESS_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_FENCE_GATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_FENCE_GATE, 1)
                .pattern("SPS").pattern("SPS").define('P', BppBlocks.END_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_FENCE_GATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_FENCE_GATE, 1)
                .pattern("SPS").pattern("SPS").define('P', BppBlocks.FROZEN_PLANKS).define('S', Items.STICK)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_FENCE_GATE)));

        //DOORS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_DOOR, 3)
                .pattern(" PP").pattern(" PP").pattern(" PP").define('P', BppBlocks.EUCALYPTUS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_DOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_DOOR, 3)
                .pattern(" PP").pattern(" PP").pattern(" PP").define('P', BppBlocks.CYPRESS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_DOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_DOOR, 3)
                .pattern(" PP").pattern(" PP").pattern(" PP").define('P', BppBlocks.END_PLANKS)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_DOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_DOOR, 3)
                .pattern(" PP").pattern(" PP").pattern(" PP").define('P', BppBlocks.FROZEN_PLANKS)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_DOOR)));

        //TRAPDOORS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_TRAPDOOR, 2)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_TRAPDOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_TRAPDOOR, 2)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.CYPRESS_PLANKS)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_PLANKS), has(BppBlocks.CYPRESS_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_TRAPDOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_TRAPDOOR, 2)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.END_PLANKS)
                .unlockedBy(getHasName(BppBlocks.END_PLANKS), has(BppBlocks.END_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_TRAPDOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_TRAPDOOR, 2)
                .pattern("PPP").pattern("PPP").define('P', BppBlocks.FROZEN_PLANKS)
                .unlockedBy(getHasName(BppBlocks.FROZEN_PLANKS), has(BppBlocks.FROZEN_PLANKS))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_TRAPDOOR)));


        //WOOD (BARK)
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.EUCALYPTUS_WOOD, 3)
                .pattern("LL ").pattern("LL ").define('L', BppBlocks.EUCALYPTUS_LOG)
                .unlockedBy(getHasName(BppBlocks.EUCALYPTUS_LOG), has(BppBlocks.EUCALYPTUS_LOG))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_WOOD)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.CYPRESS_WOOD, 3)
                .pattern("LL ").pattern("LL ").define('L', BppBlocks.CYPRESS_LOG)
                .unlockedBy(getHasName(BppBlocks.CYPRESS_LOG), has(BppBlocks.CYPRESS_LOG))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.CYPRESS_WOOD)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.END_WOOD, 3)
                .pattern("LL ").pattern("LL ").define('L', BppBlocks.END_LOG)
                .unlockedBy(getHasName(BppBlocks.END_LOG), has(BppBlocks.END_LOG))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.END_WOOD)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BppBlocks.FROZEN_WOOD, 3)
                .pattern("LL ").pattern("LL ").define('L', BppBlocks.FROZEN_LOG)
                .unlockedBy(getHasName(BppBlocks.FROZEN_LOG), has(BppBlocks.FROZEN_LOG))
                .save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.FROZEN_WOOD)));

    }
}
