package bluestar.biomesplusplus.block;
import net.fabricmc.fabric.api.registry.FlattenableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.minecraft.core.Direction;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Predicate;

public class BppPathable
{
    public static void registerPathBlocks()
    {
        //LOGS
        //FlattenableBlockRegistry.register(BppBlocks.SCORCHED_DIRT, Blocks.DIRT_PATH.defaultBlockState());

        //FlattenableBlockRegistry.register(BppBlocks.RANGES_DIRT, Blocks.DIRT_PATH.defaultBlockState());
        TillableBlockRegistry.register(
                BppBlocks.COARSE_SCORCHED_DIRT, BppPathable::alwaysTrue, BppBlocks.SCORCHED_DIRT.defaultBlockState());
    }

    public static boolean alwaysTrue(UseOnContext useOnContext)
    {
        return true;
    }
}
