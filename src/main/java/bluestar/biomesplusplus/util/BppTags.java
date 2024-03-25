package bluestar.biomesplusplus.util;

import bluestar.biomesplusplus.BiomesPlusPlus;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BppTags
{
    public static class Blocks
    {
        public static final TagKey<Block> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");

        public static TagKey<Block> createTag(String name)
        {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");

        public static TagKey<Item> createTag(String name)
        {
            return TagKey.create(Registries.ITEM, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
        }
    }
}
