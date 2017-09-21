package christopher.tutorial.tabs;

import christopher.tutorial.init.ToolInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ChristopherTab extends CreativeTabs
{
	public ChristopherTab(String label)
	{
		super("christophertab");
		this.setBackgroundImageName("christopher.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ToolInit.emerald_sword);
	}
}
