package com.anthonyhilyard.equipmentcompare.fabric.client;

import com.anthonyhilyard.equipmentcompare.EquipmentCompare;

import net.fabricmc.api.ClientModInitializer;

public final class EquipmentCompareFabricClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		EquipmentCompare.init();
	}
}
