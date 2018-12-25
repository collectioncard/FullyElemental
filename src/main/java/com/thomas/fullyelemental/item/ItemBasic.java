package com.thomas.fullyelemental.item;


import com.thomas.fullyelemental.FullyElemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {
	 
    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
    }
    
    
 
    
}