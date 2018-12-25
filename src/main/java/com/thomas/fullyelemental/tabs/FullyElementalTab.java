package com.thomas.fullyelemental.tabs;

import com.thomas.fullyelemental.*;
import com.thomas.fullyelemental.init.FullyElementalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FullyElementalTab extends CreativeTabs {

	public FullyElementalTab(String name) {
		super(FullyElemental.MODID + "." + name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(FullyElementalItems.rock);
	}
}
