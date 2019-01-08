package com.collectioncard.fullyelemental.Handlers;

import com.collectioncard.fullyelemental.init.FullyElementalItems;

import net.minecraft.client.Minecraft;
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
import net.minecraft.item.Item;
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
	    	addDeathItem(FullyElementalItems.RawTestificate, FullyElementalItems.CookedTestificate,  event);
	    }
	    else if (event.getEntity() instanceof EntityLlama) {
	    	addDeathItem(FullyElementalItems.RawLlamaMeat, FullyElementalItems.CookedLlamaMeat,      event);
	    }
	    else if (event.getEntity() instanceof EntityBat) {
	    	addDeathItem(FullyElementalItems.RawBatWing, FullyElementalItems.CookedBatWing,  event);
	    }
	    else if (event.getEntity() instanceof EntityMule) {
	    	addDeathItem(FullyElementalItems.RawMuleMeat, FullyElementalItems.CookedMuleMeat,  event);
	    }
	    else if (event.getEntity() instanceof EntityOcelot) {
	    	addDeathItem(FullyElementalItems.RawCatMeat, FullyElementalItems.CookedCatMeat,  event);
	    }
	    else if (event.getEntity() instanceof EntityParrot) {
	    	addDeathItem(FullyElementalItems.RawParrotMeat, FullyElementalItems.CookedParrotMeat,  event);
	    }
	    else if (event.getEntity() instanceof EntitySquid) {
	    	addDeathItem(FullyElementalItems.RawCalamari, FullyElementalItems.CookedCalamari,  event);
	    }
	    else if (event.getEntity() instanceof EntityWolf) {
	    	addDeathItem(FullyElementalItems.RawDogMeat, FullyElementalItems.CookedDogMeat,  event);
	    }
	    else if (event.getEntity() instanceof AbstractHorse ) {
	    	addDeathItem(FullyElementalItems.RawHorseMeat, FullyElementalItems.CookedHorseMeat,  event);
	    }
	    else if (event.getEntity() instanceof EntityDonkey) {
	    	addDeathItem(FullyElementalItems.RawDonkeyMeat, FullyElementalItems.CookedDonkeyMeat,  event);
	    }
	    
	    
	    
	}
	
	
	
	//This handles the code for adding mob drops--- Call with addDeathItem(mod.item, event)
	private void addDeathItem (Item ReferencedItemRaw,Item ReferencedItemCooked, LivingDropsEvent event) {
		
		if (event.getEntity().isBurning()){
			ItemStack itemStackToDrop = new ItemStack(ReferencedItemCooked, mobDropCalculator());
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	              event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
		}
		else {
			ItemStack itemStackToDrop = new ItemStack(ReferencedItemRaw, mobDropCalculator());
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
		drops = ran;
		
		return drops;
	}
	
	
	
}
