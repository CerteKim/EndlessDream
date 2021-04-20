package cn.certekim.pedmod.item;

import cn.certekim.pedmod.item.material.EasterEgg;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemLoader {
    public static final Item EASTEREGG = new EasterEgg();
    public ItemLoader(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                EASTEREGG
        );
    }
}
