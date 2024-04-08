package bluestar.biomesplusplus;

import bluestar.biomesplusplus.block.BppBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.FoliageColor;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.block.Block;

import java.awt.*;

@Environment(EnvType.CLIENT)
public class BiomesPlusPlusClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient()
    {
        registerBlockColors();
        registerItemColors();
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.EUCALYPTUS_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.FANCY_BIRCH_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.CYPRESS_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.END_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.FROZEN_SAPLING, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.EUCALYPTUS_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.CYPRESS_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.END_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.FROZEN_DOOR, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.EUCALYPTUS_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.CYPRESS_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.END_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.FROZEN_TRAPDOOR, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.CYAN_MUSHROOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BppBlocks.PURPLE_MUSHROOM, RenderType.cutout());


    }

    private static void registerBlockColors()
    {
        registerLeafBlockColor(BppBlocks.EUCALYPTUS_LEAVES);
        registerLeafBlockColor(BppBlocks.CYPRESS_LEAVES);
        registerLeafBlockColor(BppBlocks.END_LEAVES);
    }

    private static void registerLeafBlockColor(Block block)
    {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null)
            {
                return GrassColor.get(0.5, 1.0);
            }
            return BiomeColors.getAverageFoliageColor(view, pos);
        }, block);
    }

    private static void registerGrassBlockColor(Block block)
    {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null)
            {
                return GrassColor.get(0.5, 1.0);
            }
            return BiomeColors.getAverageGrassColor(view, pos);
        }, block);
    }


    private static void registerItemColors()
    {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x48b518, BppBlocks.EUCALYPTUS_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x48b518, BppBlocks.CYPRESS_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 11228917, BppBlocks.END_LEAVES); //10309091

    }
}
