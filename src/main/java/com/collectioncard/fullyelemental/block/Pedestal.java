package com.collectioncard.fullyelemental.block;

import com.collectioncard.fullyelemental.*;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Pedestal extends Block {

	//creates Blocks 
	public Pedestal(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.METAL, unlocalizedName, registryName);
}

	
	
	//this method is what is used to create blocks. Call it and pass the correct variables to make block
	public Pedestal(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(FullyElemental.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FullyElemental.FULLY_ELEMENTAL_TAB);
        setSoundType(sound);
    }
	
}



/*Some stuff for @copetan, 
  
  
 
---this is called in a couple of places.---
   
1. Line 16 of the FullyElementalBlocks class in the init package
2. Line 51 of the ModelRegistryHandler class in the util package
3. Line 30 of the RegistryHandler class in the util package
4. Line 81 of the RegistryHandler Class in the util package

-This block also has a json file in assets.fullyelemental.blockstates folder in the resources folder

- It also has a json model in assets.fullyelemental.models.block
   - It is currently using the texture for "basic_block"
   
It does not have an entry in /MDKExample/src/main/resources/assets/fullyelemental/lang/en_us.lang, but it should
   - This gives it a normal name
   
   
This shouldnt be all that difficult


*/