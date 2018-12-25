package com.thomas.fullyelemental.Recipes;

import com.thomas.fullyelemental.init.FullyElementalItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

	public static void initSmelting() {
		 
		GameRegistry.addSmelting(FullyElementalItems.RawBatWing, new ItemStack(FullyElementalItems.CookedBatWing), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawDonkeyMeat, new ItemStack(FullyElementalItems.CookedDonkeyMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawVillagerMeat, new ItemStack(FullyElementalItems.CookedVillagerMeat), 10.0F);
		GameRegistry.addSmelting(FullyElementalItems.RawHorseMeat, new ItemStack(FullyElementalItems.CookedHorseMeat), 10.0F);

    }
	
}
