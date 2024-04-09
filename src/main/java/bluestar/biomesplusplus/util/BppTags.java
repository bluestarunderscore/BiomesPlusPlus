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
        public static final TagKey<Block> CYPRESS_LOGS = createTag("cypress_logs");
        public static final TagKey<Block> END_LOGS = createTag("end_logs");
        public static final TagKey<Block> FROZEN_LOGS = createTag("frozen_logs");
        public static final TagKey<Block> END_DEPOSITS = createTag("end_deposits");


        public static TagKey<Block> createTag(String name)
        {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<Item> CYPRESS_LOGS = createTag("cypress_logs");
        public static final TagKey<Item> END_LOGS = createTag("end_logs");
        public static final TagKey<Item> FROZEN_LOGS = createTag("frozen_logs");
        public static final TagKey<Item> END_DEPOSITS = createTag("end_deposits");

        public static TagKey<Item> createTag(String name)
        {
            return TagKey.create(Registries.ITEM, new ResourceLocation(BiomesPlusPlus.MOD_ID, name));
        }
    }
}
