package christopher.tutorial.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Fuels implements IFuelHandler{

	public Fuels() {}
	
	public int getBurnTime(ItemStack fuel)  
	{
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.diamond_brick_fence))
			return 12800;
		if (fuel.getItem() == ItemInit.diamond_apple){
			return 200;
	}
		return 0;
	}

}

