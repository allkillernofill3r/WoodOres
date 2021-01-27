package com.allkillernofiller.woodores.init;

import com.allkillernofiller.woodores.WoodOres;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoodOres.MOD_ID);

    public static final RegistryObject<Item> OAK_WOOD_ORE_ITEM = ITEMS.register("oak_wood_ore",
            () -> new BlockItem(BlockInit.OAK_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> SPRUCE_WOOD_ORE_ITEM = ITEMS.register("spruce_wood_ore",
            () -> new BlockItem(BlockInit.SPRUCE_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> BIRCH_WOOD_ORE_ITEM = ITEMS.register("birch_wood_ore",
            () -> new BlockItem(BlockInit.BIRCH_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> JUNGLE_WOOD_ORE_ITEM = ITEMS.register("jungle_wood_ore",
            () -> new BlockItem(BlockInit.JUNGLE_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> ACACIA_WOOD_ORE_ITEM = ITEMS.register("acacia_wood_ore",
            () -> new BlockItem(BlockInit.ACACIA_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> DARK_OAK_WOOD_ORE_ITEM = ITEMS.register("dark_oak_wood_ore",
            () -> new BlockItem(BlockInit.DARK_OAK_WOOD_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> CRIMSON_STEM_ORE_ITEM = ITEMS.register("crimson_stem_ore",
            () -> new BlockItem(BlockInit.CRIMSON_STEM_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
    public static final RegistryObject<Item> WARPED_STEM_ORE_ITEM = ITEMS.register("warped_stem_ore",
            () -> new BlockItem(BlockInit.WARPED_STEM_ORE.get(), new Item.Properties().group(WoodOres.TAB)));
}
