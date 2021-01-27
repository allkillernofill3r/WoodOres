package com.allkillernofiller.woodores;

import com.allkillernofiller.woodores.init.BlockInit;
import com.allkillernofiller.woodores.init.ItemInit;
import com.allkillernofiller.woodores.world.gen.OreGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("woodores")
public class WoodOres
{
    public static final String MOD_ID = "woodores";

    public WoodOres() {
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGenerator::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ItemGroup TAB = new ItemGroup("woodores_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.OAK_WOOD_ORE.get());
        }
    };
}
