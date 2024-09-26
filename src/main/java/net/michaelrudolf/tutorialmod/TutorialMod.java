package net.michaelrudolf.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.michaelrudolf.tutorialmod.block.ModBlocks;
import net.michaelrudolf.tutorialmod.item.ModItemGroups;
import net.michaelrudolf.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod"; // Only lowercase
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}