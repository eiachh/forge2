package com.eiachh.mainmod.event;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.event.entity.Li
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class LootTableCatch {

	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
	 
		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
		
	    if (event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
	    	System.out.println("simple dungeon chest");
	    }

	}

	/*@SubscribeEvent
	public  void catchEntityDeath(LivingDeathEvent event){
		System.out.println(event.getEntity()+"Ded REEEE");
		//EntityLiving tmpEntity ;
		//tmpEntity.getlo
	}*/

	/*@SubscribeEvent
	public  void  catchEntitySpawn(EntityJoinWorldEvent event){
		if (event.getEntity().getName() == "Cow"){
			//event.getEntity()
		}
	}*/

	@SubscribeEvent
	public void drops(LivingDropsEvent event) {

		if (event.getEntity().getName() == "Cow") {

			//Creates the item
			Item itemToAdd = new com.eiachh.mainmod.init.TutorialItems().BASIC_STAR_ITEM;
			ItemStack stack = new ItemStack(itemToAdd);

			//this is the droppable existing item on the ground acts like an actual living entity eg:Cow just doesnt move XD
			EntityItem entityItemToAdd = new EntityItem(event.getEntity().getEntityWorld(),
														event.getEntity().chunkCoordX,
														event.getEntity().chunkCoordY,
														event.getEntity().chunkCoordZ,
														stack);

			event.getDrops().add(entityItemToAdd);

		}

		System.out.println("Dieded and drops a star?");
	}
}
