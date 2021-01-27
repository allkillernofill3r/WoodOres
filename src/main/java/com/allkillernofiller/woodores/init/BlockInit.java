package com.allkillernofiller.woodores.init;

import com.allkillernofiller.woodores.WoodOres;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoodOres.MOD_ID);

    public static final RegistryObject<Block> OAK_WOOD_ORE = BLOCKS.register("oak_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> SPRUCE_WOOD_ORE = BLOCKS.register("spruce_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> BIRCH_WOOD_ORE = BLOCKS.register("birch_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> JUNGLE_WOOD_ORE = BLOCKS.register("jungle_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> ACACIA_WOOD_ORE = BLOCKS.register("acacia_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> DARK_OAK_WOOD_ORE = BLOCKS.register("dark_oak_wood_ore", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> CRIMSON_STEM_ORE = BLOCKS.register("crimson_stem_ore", () -> new Block(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE)));
    public static final RegistryObject<Block> WARPED_STEM_ORE = BLOCKS.register("warped_stem_ore", () -> new Block(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE)));
}
