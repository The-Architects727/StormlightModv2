package net.architects.stormlightmod;

import net.architects.stormlightmod.effect.ModEffects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.*;
import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.item.ModItemGroups;
import net.architects.stormlightmod.item.ModItems;
import net.architects.stormlightmod.world.gen.ModWorldGeneration;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class StormlightMod implements ModInitializer {
	public static final String MOD_ID = "stormlightmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();

		ModWorldGeneration.generateModWorldGen();


	}
}