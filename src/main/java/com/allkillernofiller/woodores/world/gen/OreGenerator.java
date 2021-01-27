package com.allkillernofiller.woodores.world.gen;

import com.allkillernofiller.woodores.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerator {
    public static void generateOres(final BiomeLoadingEvent event) {
        if (event.getCategory().equals(Biome.Category.NETHER)) {
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.CRIMSON_STEM_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.WARPED_STEM_ORE.get().getDefaultState());
        }
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OAK_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.SPRUCE_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.BIRCH_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.JUNGLE_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ACACIA_WOOD_ORE.get().getDefaultState());
            addFeatureToBiome(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.DARK_OAK_WOOD_ORE.get().getDefaultState());
        }
    }

    private static void addFeatureToBiome(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, 3))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 60)))
                        .square().func_242731_b(5));
    }
}
