package com.thomas.fullyelemental.util;


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
                new ItemBasic("rock", "rock"),
                new ItemBasic("lol", "lol"),
                new ItemBasic("RawBatWing", "RawBatWing"),
                new ItemBasic("RawDonkeyMeat", "RawDonkeyMeat"),
                new ItemBasic("RawVillagerMeat", "RawVillagerMeat"),
                new ItemBasic("CookedHorseMeat", "CookedHorseMeat"),
                new ItemBasic("CookedBatWing", "CookedBatWing"),
                new ItemBasic("CookedDonkeyMeat", "CookedDonkeyMeat"),
                new ItemBasic("CookedVillagerMeat", "CookedVillagerMeat"),
                new ItemBasic("RawHorseMeat", "RawHorseMeat"),
                
        };
        //block items
        final Item[] itemBlocks = {
        		new ItemBlock(FullyElementalBlocks.Basic_Block).setRegistryName(FullyElementalBlocks.Basic_Block.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
 
}
