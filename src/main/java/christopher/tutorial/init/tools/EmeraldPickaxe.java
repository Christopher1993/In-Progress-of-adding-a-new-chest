package christopher.tutorial.init.tools;

import net.minecraft.item.ItemHoe;
import christopher.tutorial.Tutorial;

public class EmeraldHoe extends ItemHoe 
{
	private int attackSpeed;

	public EmeraldHoe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_hoe");
		setRegistryName("emerald_hoe");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}

}
