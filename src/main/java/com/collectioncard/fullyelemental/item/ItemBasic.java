package com.collectioncard.fullyelemental.item;


import com.collectioncard.fullyelemental.FullyElemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {
	 
	
	//creates method for item creation
    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
    }
    
    
 
    
}