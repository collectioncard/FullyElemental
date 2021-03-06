package com.collectioncard.fullyelemental.util;


import com.collectioncard.fullyelemental.FullyElemental;
import com.collectioncard.fullyelemental.init.FullyElementalBlocks;
import com.collectioncard.fullyelemental.init.FullyElementalItems;

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
		//register items
		//registerModel(FullyElementalItems.BASIC_ITEM);
		
		registerModel(FullyElementalItems.RawBatWing);
		registerModel(FullyElementalItems.RawDonkeyMeat);
		registerModel(FullyElementalItems.RawHorseMeat);
		registerModel(FullyElementalItems.CookedBatWing);
		registerModel(FullyElementalItems.CookedDonkeyMeat);
		registerModel(FullyElementalItems.CookedHorseMeat);
		registerModel(FullyElementalItems.RawLlamaMeat);
		registerModel(FullyElementalItems.RawMuleMeat);
		registerModel(FullyElementalItems.RawCatMeat);
		registerModel(FullyElementalItems.RawParrotMeat);
		registerModel(FullyElementalItems.RawTestificate);
		registerModel(FullyElementalItems.RawCalamari);
		registerModel(FullyElementalItems.RawDogMeat);
		registerModel(FullyElementalItems.CookedLlamaMeat);
		registerModel(FullyElementalItems.CookedMuleMeat);
		registerModel(FullyElementalItems.CookedCatMeat);
		registerModel(FullyElementalItems.CookedParrotMeat);
		registerModel(FullyElementalItems.CookedTestificate);
		registerModel(FullyElementalItems.CookedCalamari);
		registerModel(FullyElementalItems.CookedDogMeat);
		
		//Blocks
		registerModel(Item.getItemFromBlock(FullyElementalBlocks.Basic_Block));
		registerModel(Item.getItemFromBlock(FullyElementalBlocks.Elemental_Furnace));
		
		
		//for @Copetan
		registerModel(Item.getItemFromBlock(FullyElementalBlocks.pedestal));

}

	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}