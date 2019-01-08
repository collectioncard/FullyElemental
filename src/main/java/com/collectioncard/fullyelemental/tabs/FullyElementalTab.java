package com.collectioncard.fullyelemental.tabs;

import com.collectioncard.fullyelemental.*;
import com.collectioncard.fullyelemental.init.FullyElementalItems;

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
		return new ItemStack(FullyElementalItems.RawTestificate);
	}
}
