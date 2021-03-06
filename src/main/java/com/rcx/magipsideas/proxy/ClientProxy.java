package com.rcx.magipsideas.proxy;

import vazkii.psi.api.spell.SpellParam;
import vazkii.psi.common.item.ItemExosuitSensor;
import vazkii.psi.common.item.armor.ItemPsimetalArmor;
import wiiv.magipsi.client.ModelFocusingPlate;

import com.rcx.magipsideas.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {

	@Override
	public void replacePsiAssets() {
		
		
		ItemPsimetalArmor.modelSupplier = ModelFocusingPlate::new;
	}
	
}
