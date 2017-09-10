package christopher.tutorial.init;

import christopher.tutorial.Reference;
import christopher.tutorial.Tutorial;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import christopher.tutorial.init.armor.EmeraldArmor;

public class ArmorInit 
{
	public static final ArmorMaterial christopher = EnumHelper.addArmorMaterial("christopher", Reference.MODID + ":emerald", 40000, new int[]{1000, 1000, 1000, 1000}, 80, SoundEvents.BLOCK_ANVIL_PLACE, 1000.0F);
	
	public static EmeraldArmor emerald_helmet, emerald_chestplate, emerald_leggings, emerald_boots;
	
	public static void init()
	{
		emerald_helmet = new EmeraldArmor("emerald_helmet", christopher, 1, EntityEquipmentSlot.HEAD);
		emerald_chestplate = new EmeraldArmor("emerald_chestplate", christopher, 1, EntityEquipmentSlot.CHEST);
		emerald_leggings = new EmeraldArmor("emerald_leggings", christopher, 2, EntityEquipmentSlot.LEGS);
		emerald_boots = new EmeraldArmor("emerald_boots", christopher, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register()
	{
		registerItem(emerald_helmet);
		registerItem(emerald_chestplate);
		registerItem(emerald_leggings);
		registerItem(emerald_boots);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(CreativeTabs.COMBAT);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
