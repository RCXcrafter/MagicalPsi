package com.rcx.magipsideas.proxy;

import vazkii.psi.api.spell.SpellParam;
import vazkii.psi.common.item.ItemExosuitSensor;
import vazkii.psi.common.item.armor.ItemPsimetalArmor;
import wiiv.magipsi.client.ModelFocusingPlate;
import java.lang.reflect.Field;
import com.kamefrede.rpsideas.render.ModelFlowsuit;
import com.rcx.magipsideas.ModelFlowPlate;
import com.rcx.magipsideas.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {

	@Override
	public void replacePsiAssets() {
		ModelFlowsuit[] models = new ModelFlowsuit[4];
		for (int i = 0; i < models.length; i++)
			models[i] = new ModelFlowPlate(i);

		try {
			setStaticValue("com.kamefrede.rpsideas.items.flow.ItemFlowExosuit", "models", models);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setStaticValue(final String className, final String fieldName, final Object newValue) throws Exception {
		final Field field = Class.forName(className).getDeclaredField(fieldName);
		field.setAccessible(true);
		final Object oldValue = field.get(Class.forName(className));
		field.set(oldValue, newValue);
	}
}
