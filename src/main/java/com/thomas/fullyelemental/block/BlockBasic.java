package com.thomas.fullyelemental.block;

import com.thomas.fullyelemental.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {

	public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);
}

	public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
        setSoundType(sound);
    }
	
}