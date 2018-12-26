package com.eiachh.mainmod.event;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableCatch {

	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
	 
		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
		
	    if (event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
	    	System.out.println("simple dungeon chest");
	    }
	}
}
