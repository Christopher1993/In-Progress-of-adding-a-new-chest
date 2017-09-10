package christopher.tutorial.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class DiamondBrickStairs extends BlockStairs 
{
	public DiamondBrickStairs(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName("diamond_brick_stairs");
		setRegistryName("diamond_brick_stairs");
		this.useNeighborBrightness = true;
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
