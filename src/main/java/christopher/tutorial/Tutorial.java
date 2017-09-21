package christopher.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import christopher.tutorial.handlers.TileEntityHandler;
import christopher.tutorial.proxy.CommonProxy;
import christopher.tutorial.tabs.ChristopherTab;

@Mod(modid =  Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Tutorial 
{
	public static final CreativeTabs christophertab = new ChristopherTab("christophertab");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@SideOnly(Side.CLIENT)
	@Instance
	public static Tutorial INSTANCE;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
		TileEntityHandler.register();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
