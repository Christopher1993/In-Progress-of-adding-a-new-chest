package christopher.tutorial.handlers;

import christopher.tutorial.tileentity.TileEntityCustomFurnace;
import christopher.tutorial.tileentity.TileEntityDiamondChest;
import christopher.tutorial.tileentity.TileEntityDiamondChestRenderer;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
		public static void register()
		{
			GameRegistry.registerTileEntity(TileEntityCustomFurnace.class, "custom_furnace_idle");
			GameRegistry.registerTileEntity(TileEntityDiamondChest.class, "diamond_brick_chest");
			GameRegistry.registerTileEntity(TileEntityDiamondChestRenderer.class, "diamond_brick_chest");
		}
}
