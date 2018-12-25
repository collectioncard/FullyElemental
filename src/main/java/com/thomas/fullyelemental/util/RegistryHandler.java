package com.thomas.fullyelemental.util;


import com.thomas.fullyelemental.item.ItemBasic;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                //new ItemBasic("itemBasic", "basic_item"),
                new ItemBasic("rock", "rock"),
                new ItemBasic("lol", "lol"),
                new ItemBasic("RawBatWing", "RawBatWing"),
                new ItemBasic("RawDonkeyMeat", "RawDonkeyMeat"),
                new ItemBasic("RawVillagerMeat", "RawVillagerMeat"),
                new ItemBasic("RawHorseMeat", "RawHorseMeat"),
                
                
        };
 
        event.getRegistry().registerAll(items);
    }
 
}
