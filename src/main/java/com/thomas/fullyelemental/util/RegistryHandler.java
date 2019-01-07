package com.thomas.fullyelemental.util;


import com.thomas.fullyelemental.item.FoodBasic;
import com.thomas.fullyelemental.item.ItemBasic;
import com.thomas.fullyelemental.block.BlockBasic;
import com.thomas.fullyelemental.block.ElementalFurnace;
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
				new BlockBasic(Material.ROCK, "blockBasic", "basic_block"),
				new ElementalFurnace(Material.ROCK, "elementalfurnace", "elemental_furnace")
		};
		event.getRegistry().registerAll(blocks);
	}
	
	
	
	
	
	
	//Items
	@SubscribeEvent
    public static void registerItems(Register<Item> event) {
       //normal items
		final Item[] items = {
                //new ItemBasic("itemBasic", "basic_item"),
               
				
				
				
				// new FoodBasic("name",foodPoints, saturationInFloat, IsWolfMeat),
				//Raw
                new FoodBasic("RawHorseMeat", 3, 1.8f, true),
                new FoodBasic("RawBatWing", 2, 0.6f, true),
                new FoodBasic("RawDonkeyMeat", 3, 1.8f, true),
                new FoodBasic("RawLlamaMeat", 3, 1.6f, true),
                new FoodBasic("RawMuleMeat", 3, 1.6f, true),
                new FoodBasic("RawCatMeat", 2, 0.9f, true),
                new FoodBasic("RawParrotMeat", 2, 0.6f, true),
                new FoodBasic("RawTestificate", 3, 1.8f, true),
                new FoodBasic("RawCalamari", 2, 0.9f, true),
                new FoodBasic("RawDogMeat", 2, 0.9f, true),
                //Cooked
                new FoodBasic("CookedHorseMeat", 8, 12.8f, true),
                new FoodBasic("CookedBatWing", 4, 6f, true),
                new FoodBasic("CookedDonkeyMeat", 8, 12.8f, true),
                new FoodBasic("CookedLlamaMeat", 7, 12.6f, true),
                new FoodBasic("CookedMuleMeat", 7, 12.6f, true),
                new FoodBasic("CookedCatMeat", 5, 7f, true),
                new FoodBasic("CookedParrotMeat", 4, 6f, true),
                new FoodBasic("CookedTestificate", 8, 128f, true),
                new FoodBasic("CookedCalamari", 5, 7f, true),
                new FoodBasic("CookedDogMeat", 5, 7f, true),
                
        };
        //block items
        final Item[] itemBlocks = {
        		new ItemBlock(FullyElementalBlocks.Basic_Block).setRegistryName(FullyElementalBlocks.Basic_Block.getRegistryName()),
        		new ItemBlock(FullyElementalBlocks.Elemental_Furnace).setRegistryName(FullyElementalBlocks.Elemental_Furnace.getRegistryName()),
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
 
}
