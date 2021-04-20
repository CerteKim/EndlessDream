package cn.certekim.pedmod.item.material;

import cn.certekim.pedmod.EndlessDreamMain;
import cn.certekim.pedmod.util.Reference;

import net.minecraft.item.Item;

public class EasterEgg extends Item {
    private static final String name = "easteregg";
    public EasterEgg()
    {
        this.setRegistryName(name);
        this.setUnlocalizedName(Reference.MOD_ID+":"+name);
        this.setCreativeTab(EndlessDreamMain.tabEndlessDream);
    }
}
