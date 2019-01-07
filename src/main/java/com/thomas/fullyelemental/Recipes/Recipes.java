package com.thomas.fullyelemental.Recipes;

import com.thomas.fullyelemental.init.FullyElementalItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

	
	
	public static void initSmelting() {
		//Cooking Food 
		//creates smelting recipe 
		GameRegistry.addSmelting(FullyElementalItems.RawBatWing, new ItemStack(FullyElementalItems.CookedBatWing), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawDonkeyMeat, new ItemStack(FullyElementalItems.CookedDonkeyMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawHorseMeat, new ItemStack(FullyElementalItems.CookedHorseMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawLlamaMeat, new ItemStack(FullyElementalItems.CookedLlamaMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawMuleMeat, new ItemStack(FullyElementalItems.CookedMuleMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawCatMeat, new ItemStack(FullyElementalItems.CookedCatMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawParrotMeat, new ItemStack(FullyElementalItems.CookedParrotMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawTestificate, new ItemStack(FullyElementalItems.CookedTestificate), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawCalamari, new ItemStack(FullyElementalItems.CookedCalamari), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawDogMeat, new ItemStack(FullyElementalItems.CookedDogMeat), 10.0F);
		

    }
	
}
