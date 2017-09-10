package christopher.tutorial.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import christopher.tutorial.init.tools.EmeraldAxe;
import christopher.tutorial.init.tools.EmeraldHoe;
import christopher.tutorial.init.tools.EmeraldPickaxe;
import christopher.tutorial.init.tools.EmeraldShovel;
import christopher.tutorial.init.tools.EmeraldSword;
import christopher.tutorial.Reference;

public class ToolInit 
{
	public static final ToolMaterial christopher = EnumHelper.addToolMaterial("emerald", 3, 100000, 1000.0F, 1000.0F, 100);
	
	public static Item emerald_pickaxe, emerald_axe, emerald_hoe, emerald_shovel, emerald_sword;
	
	public static void init()
	{
		emerald_pickaxe = new EmeraldPickaxe("emerald_pickaxe", christopher);
		emerald_axe = new EmeraldAxe("emerald_axe", christopher);
		emerald_hoe = new EmeraldHoe("emerald_hoe", christopher);
		emerald_shovel = new EmeraldShovel("emerald_shovel", christopher);
		emerald_sword = new EmeraldSword("emerald_sword", christopher);
	}
	
	public static void register()
	{
		registerItem(emerald_pickaxe);
		registerItem(emerald_axe);
		registerItem(emerald_hoe);
		registerItem(emerald_shovel);
		registerItem(emerald_sword);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
