package com.thomas.fullyelemental.item;

import com.thomas.fullyelemental.FullyElemental;

import net.minecraft.item.ItemFood;

public class FoodBasic extends ItemFood  {

	
	//creates method for creating food items
	public FoodBasic (String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
	}
}
