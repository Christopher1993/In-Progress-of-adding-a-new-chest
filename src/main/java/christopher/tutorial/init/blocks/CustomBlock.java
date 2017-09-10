package christopher.tutorial.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block
{
	public CustomBlock(String name, float hardness, float resistance)
	{
		super(Material.IRON);
		this.blockSoundType = SoundType.METAL;
		setUnlocalizedName("diamond_brick");
		setRegistryName("diamond_brick");
		setHardness(45.0F);
		setResistance(25000000.0F);
	}
}
