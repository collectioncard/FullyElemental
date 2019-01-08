package com.collectioncard.fullyelemental.block;

import com.collectioncard.fullyelemental.*;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {

	
	
	
	//creates Blocks 
	public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.METAL, unlocalizedName, registryName);
}

	
	
	//this method is what is used to create blocks. Call it and pass the correct variables to make block
	public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
        setSoundType(sound);
    }
	
}