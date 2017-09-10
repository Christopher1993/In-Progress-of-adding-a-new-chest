package christopher.tutorial.init.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class EmeraldAxe extends ItemTool
{
	 private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.LEAVES, Blocks.LEAVES2);


	 public EmeraldAxe(String name ,Item.ToolMaterial material)
	 {
		 super(material, EFFECTIVE_ON);
		 setUnlocalizedName("emerald_axe");
		 setRegistryName("emerald_axe");
		 this.setCreativeTab(CreativeTabs.TOOLS);
		 this.attackSpeed = 100;
	 }

	 public float getStrVsBlock(ItemStack stack, IBlockState state)
	 {
		 Material material = state.getMaterial();
		 return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	 }
}
