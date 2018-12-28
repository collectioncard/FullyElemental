package com.thomas.fullyelemental.Handlers;

import com.thomas.fullyelemental.init.FullyElementalItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {

	
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(LivingDropsEvent event)
	{
		//Checks to see if an entity that died is an instance of a certain mob
	    if (event.getEntity() instanceof EntityVillager)
	    {
	    	//checks to see if entity died while on fire
	    	if (event.getEntity().isBurning()) {
	    		ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.CookedTestificate, mobDropCalculator());
		        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
		              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));			
	    	}
	    	//if the previous if statement is wrong, run this
	    	else {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawTestificate, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));	
	    	}
	        
	    }
	    else if (event.getEntity() instanceof EntityLlama) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawLlamaMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityBat) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawBatWing, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityMule) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawMuleMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityOcelot) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawCatMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityParrot) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawParrotMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntitySquid) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawCalamari, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityWolf) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawDogMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof AbstractHorse ) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawHorseMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	    else if (event.getEntity() instanceof EntityDonkey) {
	    	ItemStack itemStackToDrop = new ItemStack(FullyElementalItems.RawDonkeyMeat, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    }
	}
	
	//When called, this function returns a random number between 1 and 5
	private static int mobDropCalculator(){
		int drops, ran;
		
		ran = (int)(Math.random() * 6);
		
		if (ran <= 0) {
			ran = 1;
		}
		else {
			
		}
		
		drops = ran;
		
		return drops;
	}
}
