package net.architects.stormlightmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.architects.stormlightmod.StormlightMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {




    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block EMERALD_ORE = registerBlock("emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block SMOKESTONE_ORE = registerBlock("smokestone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block GARNET_ORE = registerBlock("garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block ZIRCON_ORE = registerBlock("zircon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block HELIODOR_ORE = registerBlock("heliodor_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_EMERALD_ORE = registerBlock("deepslate_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_SMOKESTONE_ORE = registerBlock("deepslate_smokestone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_GARNET_ORE = registerBlock("deepslate_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DEEPSLATE_HELIODOR_ORE = registerBlock("deepslate_heliodor_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));



    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(StormlightMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StormlightMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(StormlightMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StormlightMod.LOGGER.info("Registering Mod Blocks for " + StormlightMod.MOD_ID);

    }
}
