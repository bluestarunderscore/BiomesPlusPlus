package bluestar.biomesplusplus.item;

import bluestar.biomesplusplus.BiomesPlusPlus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class BppItems
{
   public static final Item END_STONE_SCRAP = registerItem("end_stone_scrap",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(BiomesPlusPlus.MOD_ID, name),
                item);
    }

    public static void registerBppItems()
    {
        BiomesPlusPlus.LOGGER.info("Registering Items for " + BiomesPlusPlus.MOD_ID);
    }
}
