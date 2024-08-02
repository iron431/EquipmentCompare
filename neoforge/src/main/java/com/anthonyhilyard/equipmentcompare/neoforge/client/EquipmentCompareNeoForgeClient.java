package com.anthonyhilyard.equipmentcompare.neoforge.client;

import com.anthonyhilyard.equipmentcompare.EquipmentCompare;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;


@Mod(value = EquipmentCompare.MODID, dist = Dist.CLIENT)
public class EquipmentCompareNeoForgeClient
{
	public EquipmentCompareNeoForgeClient()
	{
		EquipmentCompare.init();
	}
}
