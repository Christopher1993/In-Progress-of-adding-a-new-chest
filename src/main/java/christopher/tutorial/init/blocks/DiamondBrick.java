package christopher.tutorial.init.blocks;

import net.minecraft.block.Block;

public class DiamondBrick extends CustomBlock 
{

	public DiamondBrick(String name, float hardness, float resistance, int harvestlevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestlevel);
	}

}
