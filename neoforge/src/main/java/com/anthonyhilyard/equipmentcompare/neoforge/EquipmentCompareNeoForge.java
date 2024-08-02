package com.anthonyhilyard.equipmentcompare.neoforge;

import com.anthonyhilyard.equipmentcompare.EquipmentCompare;
import com.anthonyhilyard.equipmentcompare.neoforge.client.EquipmentCompareNeoForgeClient;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = EquipmentCompare.MODID, dist = Dist.CLIENT)
public final class EquipmentCompareNeoForge
{
	public EquipmentCompareNeoForge(ModContainer container, IEventBus modBus)
	{
		// Run our common setup.
		EquipmentCompare.init();

		modBus.register(EquipmentCompareNeoForgeClient.class);
	}
}

