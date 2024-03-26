package bluestar.biomesplusplus.block;
import net.fabricmc.fabric.api.registry.FlattenableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.world.level.block.Blocks;

public class BppPathable
{
    public static void registerPathBlocks()
    {
        //LOGS
        FlattenableBlockRegistry.register(BppBlocks.SCORCHED_DIRT, Blocks.DIRT_PATH.defaultBlockState());
    }
}
