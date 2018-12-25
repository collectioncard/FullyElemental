package com.thomas.fullyelemental.util;


import com.thomas.fullyelemental.init.FullyElementalBlocks;
import com.thomas.fullyelemental.init.FullyElementalItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		//registerModel(FullyElementalItems.BASIC_ITEM);
		registerModel(FullyElementalItems.rock);
		registerModel(FullyElementalItems.lol);
		registerModel(FullyElementalItems.RawBatWing);
		registerModel(FullyElementalItems.RawDonkeyMeat);
		registerModel(FullyElementalItems.RawVillagerMeat);
		registerModel(FullyElementalItems.RawHorseMeat);
		registerModel(FullyElementalItems.CookedBatWing);
		registerModel(FullyElementalItems.CookedDonkeyMeat);
		registerModel(FullyElementalItems.CookedVillagerMeat);
		registerModel(FullyElementalItems.CookedHorseMeat);
		
		registerModel(Item.getItemFromBlock(FullyElementalBlocks.Basic_Block));

}

	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}