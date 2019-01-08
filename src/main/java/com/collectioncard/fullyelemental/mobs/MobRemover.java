package com.collectioncard.fullyelemental.mobs;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Blocks;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobRemover{
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event){
		
		if(event.getEntity() instanceof EntityMooshroom) {
	    	event.setCanceled(true);
	    }
		
		if(event.getEntity() instanceof EntitySkeletonHorse) {
	    	event.setCanceled(true);	
		}
	
		if(event.getEntity() instanceof EntityEnderman) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityPigZombie) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityBlaze) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityCreeper) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityElderGuardian) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityEndermite) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityEvoker) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityGhast) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityGuardian) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityHusk) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityMagmaCube) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityShulker) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntitySkeleton) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntitySlime) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityStray) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityVex) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityVindicator) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityWitherSkeleton) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityZombie) {
	    	event.setCanceled(true);
	    	
		}
		
		if(event.getEntity() instanceof EntityIronGolem) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntitySnowman) {
	    	event.setCanceled(true);
		}
		
		if(event.getEntity() instanceof EntityWither) {
	    	event.setCanceled(true);
		}
			
	}
		
}
