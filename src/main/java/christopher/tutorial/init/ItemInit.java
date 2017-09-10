package christopher.tutorial.init;

import christopher.tutorial.Reference;
import christopher.tutorial.init.items.DiamondApple;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
	public static DiamondApple diamond_apple;
	
	public static void init()
	{
		diamond_apple = new DiamondApple(20, 20.0F, false);
	}
	
	public static void register()
	{
		registerItem(diamond_apple);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
