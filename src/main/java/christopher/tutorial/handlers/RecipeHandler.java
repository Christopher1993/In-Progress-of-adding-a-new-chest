
package christopher.tutorial.handlers;

import christopher.tutorial.init.BlockInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerFurnaceRecipes()
	{
		GameRegistry.addSmelting(BlockInit.diamond_brick, new ItemStack(Items.DIAMOND), 100);
	}
}