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
import net.minecraft.world.level.biome.BiomeSpecialEffects;

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
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                pos != null && world != null ?
                        GrassColor.get(0.5, 1.0) :
                        FoliageColor.get(0.5, 1.0), BppBlocks.EUCALYPTUS_LEAVES);
    }

    private static void registerItemColors()
    {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 9619016, BppBlocks.EUCALYPTUS_LEAVES);
    }
}
