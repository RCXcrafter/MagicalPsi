/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Psi Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: http://psi.vazkii.us/license.php
 *
 * File Created @ [21/02/2016, 16:34:43 (GMT)]
 */
package vazkii.psi.common.item;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;
import vazkii.arl.interf.IItemColorProvider;
import vazkii.arl.item.ItemMod;
import vazkii.psi.api.cad.ICADColorizer;
import vazkii.psi.api.exosuit.IExosuitSensor;
import vazkii.psi.api.exosuit.PsiArmorEvent;
import vazkii.psi.common.crafting.recipe.SensorAttachRecipe;
import vazkii.psi.common.crafting.recipe.SensorRemoveRecipe;
import vazkii.psi.common.item.base.IPsiItem;
import vazkii.psi.common.lib.LibItemNames;

public class ItemExosuitSensor extends ItemMod implements IExosuitSensor, IItemColorProvider, IPsiItem {

	public static final String[] VARIANTS = {
			"exosuitSensorLight",
			"exosuitSensorWater",
			"exosuitSensorHeat",
			"exosuitSensorStress"
	};
	public static int defaultColor = 0xEDBAFF;
	public static int fireColor = 0xFF1F00;
	public static int lightColor = 0xFFDF00;
	public static int lowHealthColor = 0x7FFF00;
	public static int underwaterColor = 0x003FFF;

	public ItemExosuitSensor() {
		super(LibItemNames.EXOSUIT_SENSOR, VARIANTS);
		setMaxStackSize(1);

		GameRegistry.addRecipe(new SensorAttachRecipe());
		GameRegistry.addRecipe(new SensorRemoveRecipe());
		RecipeSorter.register("psi:sensorAttach", SensorAttachRecipe.class, Category.SHAPELESS, "");
		RecipeSorter.register("psi:sensorRemove", SensorRemoveRecipe.class, Category.SHAPELESS, "");
	}

	@Override
	public String getEventType(ItemStack stack) {
		switch(stack.getItemDamage()) {
		case 0: return PsiArmorEvent.LOW_LIGHT;
		case 1: return PsiArmorEvent.UNDERWATER;
		case 2: return PsiArmorEvent.ON_FIRE;
		case 3: return PsiArmorEvent.LOW_HP;
		default: return PsiArmorEvent.NONE;
		}
	}

	@Override
	public int getColor(ItemStack stack) {
		switch(stack.getItemDamage()) {
		case 0: return lightColor;
		case 1: return underwaterColor;
		case 2: return fireColor;
		case 3: return lowHealthColor;
		default: return defaultColor;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IItemColor getItemColor() {
		return new IItemColor() {
			@Override
			public int getColorFromItemstack(ItemStack stack, int tintIndex) {
				return tintIndex == 1 ? getColor(stack) : 0xFFFFFF;
			}
		};
	}

}
