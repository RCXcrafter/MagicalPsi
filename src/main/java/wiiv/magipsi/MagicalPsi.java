package wiiv.magipsi;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MagicalPsi.MOD_ID, name = MagicalPsi.MOD_NAME, version = MagicalPsi.VERSION, dependencies = MagicalPsi.DEPENDENCIES)
public class MagicalPsi {

	public static final String MOD_ID = "magipsi";
	public static final String MOD_NAME = "Magical Psi";
	public static final String VERSION = "dev";
	public static final String DEPENDENCIES = "required-after:Psi";
	
	public MagicalPsi() {
		ensureResourceOrder();
	}

	// Construction is called before resources are loaded and before
	// proxies are assigned, so we have to reflect around
	private void ensureResourceOrder() {
		if(FMLCommonHandler.instance().getSide().isServer())
			return;

		String classname = "wiiv.magipsi.client.ResourceProxy";
		try {
			Class<?> clazz = Class.forName(classname);
			clazz.getMethod("init").invoke(null);
		} catch(Throwable e) {
			FMLLog.severe("[Magical Psi] Could not hook Resource Proxy.");
			e.printStackTrace();
		}
	}

}

