package com.collectioncard.fullyelemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

import com.collectioncard.fullyelemental.handlers.MobDropsHandler;
import com.collectioncard.fullyelemental.mobs.MobRemover;
import com.collectioncard.fullyelemental.proxy.IProxy;
import com.collectioncard.fullyelemental.proxy.ServerProxy;
import com.collectioncard.fullyelemental.recipes.*;
import com.collectioncard.fullyelemental.tabs.FullyElementalTab;
import com.collectioncard.fullyelemental.biomes.TestBiome;

@Mod(modid = FullyElemental.MODID, name = FullyElemental.NAME, version = FullyElemental.VERSION)
public class FullyElemental
{
    public static final String MODID = "fullyelemental";
    public static final String NAME = "Fully Elemental";
    public static final String VERSION = "1.0";

    //reference proxies
    public static final String CLIENT = "com.collectioncard.fullyelemental.proxy.ClientProxy";
    public static final String SERVER = "com.collectioncard.fullyelemental.proxy.ServerProxy";
    
    @SidedProxy(clientSide = FullyElemental.CLIENT, serverSide = FullyElemental.SERVER)
    public static IProxy proxy;
    
    
    private static Logger logger;
    
    
    
    //creative tab
    public static final CreativeTabs FULLY_ELEMENTAL_TAB = new FullyElementalTab("tabFullyElemental");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new MobRemover());
    	//Calls the method for smelting recipes
    	Recipes.initSmelting();
    	MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
    	TestBiome.load(event);
    	
    	
        logger.info("I was made by someone who had no idea what he was doing!");
    }
    
   
	
	
    
    
}
