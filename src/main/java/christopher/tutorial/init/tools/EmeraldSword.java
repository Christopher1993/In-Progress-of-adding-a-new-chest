package christopher.tutorial.init.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import christopher.tutorial.Tutorial;

public class EmeraldSword extends ItemSword 
{
	private int attackSpeed;
	private Object material;

	public EmeraldSword(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_sword");
		setRegistryName("emerald_sword");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}
	public float getDamageVsEntity()
    {
        return ((EmeraldSword) this.material).getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.WEB)
        {
            return 15.0F;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }
}
