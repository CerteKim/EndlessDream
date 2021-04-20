package cn.certekim.pedmod.item;

import cn.certekim.pedmod.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabEndlessDreamMod extends CreativeTabs
{
    public CreativeTabEndlessDreamMod(String label) {
        super("Endless Dream");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.EASTEREGG);
    }
}
