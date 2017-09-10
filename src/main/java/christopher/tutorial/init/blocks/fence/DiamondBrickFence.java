package christopher.tutorial.init.blocks.fence;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class DiamondBrickFence extends BlockFence
{
	public DiamondBrickFence(String name, float hardness, float resistance) 
	{
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		this.blockSoundType = SoundType.METAL;
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
	}

}
