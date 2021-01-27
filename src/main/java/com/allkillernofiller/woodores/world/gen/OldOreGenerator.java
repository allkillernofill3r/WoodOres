package com.allkillernofiller.woodores.world.gen;

import com.allkillernofiller.woodores.WoodOres;
import com.allkillernofiller.woodores.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
// import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

// @Mod.EventBusSubscriber(modid = WoodOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OldOreGenerator {
    /*
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.OAK_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SPRUCE_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BIRCH_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.JUNGLE_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ACACIA_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.DARK_OAK_WOOD_ORE.get().getDefaultState());
        }
    }

    private static void addFeatureToBiome(Biome biome, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate) {
        CountRangeConfig range = new CountRangeConfig(5, 0, 0, 60);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, 3);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
    */
}
