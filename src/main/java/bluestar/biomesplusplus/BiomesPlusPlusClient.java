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

    }

    private static void registerBlockColors()
    {
        registerLeafBlockColor(BppBlocks.EUCALYPTUS_LEAVES);
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
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 9619016, BppBlocks.EUCALYPTUS_LEAVES);
    }
}
