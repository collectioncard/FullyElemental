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
                
                new FoodBasic("RawBatWing", 3, 0.3f, false),
                new FoodBasic("RawDonkeyMeat", 3, 0.3f, false),
                new FoodBasic("RawVillagerMeat", 3, 0.3f, false),
                new FoodBasic("CookedHorseMeat", 3, 0.3f, false),
                new FoodBasic("CookedBatWing", 3, 0.3f, false),
                new FoodBasic("CookedDonkeyMeat", 3, 0.3f, false),
                new FoodBasic("CookedVillagerMeat", 3, 0.3f, false),
                new FoodBasic("RawHorseMeat", 3, 0.3f, false),
                new FoodBasic("RawLlamaMeat", 3, 0.3f, false),
                new FoodBasic("RawMuleMeat", 3, 0.3f, false),
                new FoodBasic("RawCatMeat", 3, 0.3f, false),
                new FoodBasic("RawParrotMeat", 3, 0.3f, false),
                new FoodBasic("RawTestificate", 3, 0.3f, false),
                new FoodBasic("RawCalamari", 3, 0.3f, false),
                new FoodBasic("RawDogMeat", 3, 0.3f, false),
                new FoodBasic("CookedLlamaMeat", 3, 0.3f, false),
                new FoodBasic("CookedMuleMeat", 3, 0.3f, false),
                new FoodBasic("CookedCatMeat", 3, 0.3f, false),
                new FoodBasic("CookedParrotMeat", 3, 0.3f, false),
                new FoodBasic("CookedTestificate", 3, 0.3f, false),
                new FoodBasic("CookedCalamari", 3, 0.3f, false),
                new FoodBasic("CookedDogMeat", 3, 0.3f, false),
                
        };
        //block items
        final Item[] itemBlocks = {
        		new ItemBlock(FullyElementalBlocks.Basic_Block).setRegistryName(FullyElementalBlocks.Basic_Block.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
 
}
