package bluestar.biomesplusplus.world.gen.tree.custom;


import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class BppTrunkPlacerTypes
{
    public static final Registry<TrunkPlacerType<?>> registry = BuiltInRegistries.TRUNK_PLACER_TYPE;
    public static final TrunkPlacerType<TallSwampTrunkPlacer> TALL_SWAMP_TRUNK_PLACER = register("biomesplusplus:tall_swamp_trunk", TallSwampTrunkPlacer.CODEC);

    private static <P extends TrunkPlacer> TrunkPlacerType<P> register(String name, Codec<P> codec)
    {
        return Registry.register(registry, name, new TrunkPlacerType<>(codec));
    }

    public static void init()
    {
    }
}
