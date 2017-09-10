package christopher.tutorial.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DiamondApple extends ItemFood 
{


	public DiamondApple(int amount,float saturation, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName("diamond_apple");
		setRegistryName("diamond_apple");
		setCreativeTab(CreativeTabs.FOOD);
		this.setAlwaysEdible();
	}

	public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1728000, 127));
        player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1728000, 127));
	}
}
