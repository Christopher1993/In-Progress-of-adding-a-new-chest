package christopher.tutorial.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import christopher.tutorial.init.ArmorInit;
import christopher.tutorial.init.Fuels;
import christopher.tutorial.init.ItemInit;
import christopher.tutorial.init.BlockInit;
import christopher.tutorial.init.ToolInit;

public class RegistryHandler 
{
	public static void Client()
	{
		RecipeHandler.registerFurnaceRecipes();
		GameRegistry.registerFuelHandler(new Fuels());
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
		
		TileEntityHandler.register();
		GUIHandler.register();
	}
}
