package com.thomas.fullyelemental.util;


import com.thomas.fullyelemental.item.FoodBasic;
import com.thomas.fullyelemental.item.ItemBasic;
import com.thomas.fullyelemental.block.BlockBasic;
import com.thomas.fullyelemental.init.FullyElementalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
 
    //Blocks
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
		};
		event.getRegistry().registerAll(blocks);
	}
	
	
	
	
	
	
	//Items
	@SubscribeEvent
    public static void registerItems(Register<Item> event) {
       //normal items
		final Item[] items = {
                //new ItemBasic("itemBasic", "basic_item"),
                new FoodBasic("TEST", 3, 0.3f, false),
                new ItemBasic("lol", "lol"),
                new ItemBasic("RawBatWing", "RawBatWing"),
                new ItemBasic("RawDonkeyMeat", "RawDonkeyMeat"),
                new ItemBasic("RawVillagerMeat", "RawVillagerMeat"),
                new ItemBasic("CookedHorseMeat", "CookedHorseMeat"),
                new ItemBasic("CookedBatWing", "CookedBatWing"),
                new ItemBasic("CookedDonkeyMeat", "CookedDonkeyMeat"),
                new ItemBasic("CookedVillagerMeat", "CookedVillagerMeat"),
                new ItemBasic("RawHorseMeat", "RawHorseMeat"),
                new ItemBasic("RawLlamaMeat", "RawLlamaMeat"),
                new ItemBasic("RawMuleMeat", "RawMuleMeat"),
                new ItemBasic("RawCatMeat", "RawCatMeat"),
                new ItemBasic("RawParrotMeat", "RawParrotMeat"),
                new ItemBasic("RawTestificate", "RawTestificate"),
                new ItemBasic("RawCalamari", "RawCalamari"),
                new ItemBasic("RawDogMeat", "RawDogMeat"),
                new ItemBasic("CookedLlamaMeat", "CookedLlamaMeat"),
                new ItemBasic("CookedMuleMeat", "CookedMuleMeat"),
                new ItemBasic("CookedCatMeat", "CookedCatMeat"),
                new ItemBasic("CookedParrotMeat", "CookedParrotMeat"),
                new ItemBasic("CookedTestificate", "CookedTestificate"),
                new ItemBasic("CookedCalamari", "CookedCalamari"),
                new ItemBasic("CookedDogMeat", "CookedDogMeat"),
        };
        //block items
        final Item[] itemBlocks = {
        		new ItemBlock(FullyElementalBlocks.Basic_Block).setRegistryName(FullyElementalBlocks.Basic_Block.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
 
}
