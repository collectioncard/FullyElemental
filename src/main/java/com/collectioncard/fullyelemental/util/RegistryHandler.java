package com.collectioncard.fullyelemental.util;


import com.collectioncard.fullyelemental.block.BlockBasic;
import com.collectioncard.fullyelemental.block.ElementalFurnace;
import com.collectioncard.fullyelemental.block.Pedestal;
import com.collectioncard.fullyelemental.init.FullyElementalBlocks;
import com.collectioncard.fullyelemental.item.FoodBasic;
import com.collectioncard.fullyelemental.item.ItemBasic;

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
				new ElementalFurnace(Material.ROCK, "elementalfurnace", "elemental_furnace"),
				
				//For @Copetan
				new Pedestal(Material.ROCK, "pedestal", "pedestal")
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
                new FoodBasic("RawBatWing", 2, 0.6f, false),
                new FoodBasic("RawDonkeyMeat", 3, 1.8f, true),
                new FoodBasic("RawLlamaMeat", 3, 1.6f, true),
                new FoodBasic("RawMuleMeat", 3, 1.6f, true),
                new FoodBasic("RawCatMeat", 2, 0.9f, true),
                new FoodBasic("RawParrotMeat", 2, 0.6f, false),
                new FoodBasic("RawTestificate", 3, 1.8f, true),
                new FoodBasic("RawCalamari", 2, 0.9f, false),
                new FoodBasic("RawDogMeat", 2, 0.9f, false),
                //Cooked
                new FoodBasic("CookedHorseMeat", 8, 12.8f, true),
                new FoodBasic("CookedBatWing", 4, 6f, false),
                new FoodBasic("CookedDonkeyMeat", 8, 12.8f, true),
                new FoodBasic("CookedLlamaMeat", 7, 12.6f, true),
                new FoodBasic("CookedMuleMeat", 7, 12.6f, true),
                new FoodBasic("CookedCatMeat", 5, 7f, true),
                new FoodBasic("CookedParrotMeat", 4, 6f, false),
                new FoodBasic("CookedTestificate", 8, 12.8f, true),
                new FoodBasic("CookedCalamari", 5, 7f, false),
                new FoodBasic("CookedDogMeat", 5, 7f, false),
                
        };
        //block items
        final Item[] itemBlocks = {
        		new ItemBlock(FullyElementalBlocks.Basic_Block).setRegistryName(FullyElementalBlocks.Basic_Block.getRegistryName()),
        		new ItemBlock(FullyElementalBlocks.Elemental_Furnace).setRegistryName(FullyElementalBlocks.Elemental_Furnace.getRegistryName()),
        		
        		//For @Copetan
        		new ItemBlock(FullyElementalBlocks.pedestal).setRegistryName(FullyElementalBlocks.pedestal.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
 
}
