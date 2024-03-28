package bluestar.biomesplusplus.world.gen.tree.custom;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class BppFoliagePlacerTypes
{
    public static final Registry<FoliagePlacerType<?>> registry = BuiltInRegistries.FOLIAGE_PLACER_TYPE;
    public static final FoliagePlacerType<FiveBlockFoliagePlacer> FIVE_BLOCK_FOLIAGE_PLACER = register("biomesplusplus:five_block_leaves", FiveBlockFoliagePlacer.CODEC);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, Codec<P> codec)
    {
        return Registry.register(registry, name, new FoliagePlacerType<>(codec));
    }

    public static void init()
    {
    }
}
