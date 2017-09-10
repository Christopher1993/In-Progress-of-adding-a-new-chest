package christopher.tutorial.init.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldSword extends ItemSword 
{
	private int attackSpeed;

	public EmeraldSword(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_sword");
		setRegistryName("emerald_sword");
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.attackSpeed = 100;
	}

}
