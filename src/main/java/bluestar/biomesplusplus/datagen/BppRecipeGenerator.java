package bluestar.biomesplusplus.datagen;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.Items;

public class BppRecipeGenerator extends FabricRecipeProvider
{
    public BppRecipeGenerator(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.EUCALYPTUS_LOG).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_LOG), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_PLANKS)));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_PLANKS, 4).requires(BppBlocks.EUCALYPTUS_WOOD).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_WOOD), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation("stripped_eucalyptus_planks"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_BUTTON, 1).requires(BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), FabricRecipeProvider.has(BppBlocks.EUCALYPTUS_BUTTON)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_BUTTON)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_SLAB, 6).pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_SLAB)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_STAIRS, 4).pattern("P  ").pattern("PP ").pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_STAIRS)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_PRESSURE_PLATE, 1).pattern(" PP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_PRESSURE_PLATE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_FENCE, 3).pattern("PSP").pattern("PSP").define('P', BppBlocks.EUCALYPTUS_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_FENCE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_FENCE_GATE, 1).pattern("SPS").pattern("SPS").define('P', BppBlocks.EUCALYPTUS_PLANKS).define('S', Items.STICK).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_FENCE_GATE)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_DOOR, 3).pattern(" PP").pattern(" PP").pattern(" PP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_DOOR)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_TRAPDOOR, 2).pattern("PPP").pattern("PPP").define('P', BppBlocks.EUCALYPTUS_PLANKS).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_PLANKS), has(BppBlocks.EUCALYPTUS_PLANKS)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_TRAPDOOR)));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BppBlocks.EUCALYPTUS_WOOD, 3).pattern("LL ").pattern("LL ").define('L', BppBlocks.EUCALYPTUS_LOG).unlockedBy(getHasName(BppBlocks.EUCALYPTUS_LOG), has(BppBlocks.EUCALYPTUS_LOG)).save(exporter, new ResourceLocation(getSimpleRecipeName(BppBlocks.EUCALYPTUS_WOOD)));

    }
}
