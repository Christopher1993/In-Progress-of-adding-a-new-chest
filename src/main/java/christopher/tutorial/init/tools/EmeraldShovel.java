package christopher.tutorial.init.tools;

import net.minecraft.item.ItemSpade;
import christopher.tutorial.Tutorial;

public class EmeraldShovel extends ItemSpade 
{
	public EmeraldShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_shovel");
		setRegistryName("emerald_shovel");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}

}
