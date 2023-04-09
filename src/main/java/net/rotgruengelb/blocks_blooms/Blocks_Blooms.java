package net.rotgruengelb.blocks_blooms;

import net.fabricmc.api.ModInitializer;

import net.rotgruengelb.blocks_blooms.item.ModItemGroup;
import net.rotgruengelb.blocks_blooms.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blocks_Blooms implements ModInitializer {
	public static final String MOD_ID = "blocks_blooms";
	public static final Logger LOGGER = LoggerFactory.getLogger("blocks_blooms");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}