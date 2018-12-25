package com.thomas.fullyelemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


//Import proxies
import com.thomas.fullyelemental.proxy.ServerProxy;
import com.thomas.fullyelemental.tabs.FullyElementalTab;
import com.thomas.fullyelemental.proxy.IProxy;

@Mod(modid = FullyElemental.MODID, name = FullyElemental.NAME, version = FullyElemental.VERSION)
public class FullyElemental
{
    public static final String MODID = "fullyelemental";
    public static final String NAME = "Fully Elemental";
    public static final String VERSION = "1.0";

    //reference proxies
    public static final String CLIENT = "com.thomas.fullyelemental.proxy.ClientProxy";
    public static final String SERVER = "com.thomas.fullyelemental.proxy.ServerProxy";
    
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
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
