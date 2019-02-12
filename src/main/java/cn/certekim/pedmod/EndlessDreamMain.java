package cn.certekim.pedmod;

import cn.certekim.pedmod.item.CreativeTabEndlessDreamMod;
import cn.certekim.pedmod.proxy.CommonProxy;
import cn.certekim.pedmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**********************************************************************************************************************
 * -------------------------------------------------------------------------------------------------------------------
 *                                             Endless Dream Mod
 *                                                              - Certe Kim
 * -------------------------------------------------------------------------------------------------------------------
 * Project Endless Dream.
 *      The first mod created bt Certe Kim,for Minecraft.
 *
 * Version Alpha 0.0.1
 *      Update Log:
 *          Display modinfo
 **********************************************************************************************************************/

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class EndlessDreamMain {

    @Instance
    public static EndlessDreamMain instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    public static final CreativeTabs tabEndlessDream = new CreativeTabEndlessDreamMod("Endless Dream");
}
