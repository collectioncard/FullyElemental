package com.thomas.fullyelemental.block;

import com.thomas.fullyelemental.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ElementalFurnace extends Block {

	//creates Blocks 
	public ElementalFurnace(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.METAL, unlocalizedName, registryName);
}

	
	
	//this method is what is used to create blocks. Call it and pass the correct variables to make block
	public ElementalFurnace(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
        setSoundType(sound);
    }
	
}
