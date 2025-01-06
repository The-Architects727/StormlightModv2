package net.architects.stormlightmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(StormlightMod.MOD_ID, "pink_garnet_items"),
//            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
//                    .displayName(Text.translatable("itemgroup.stormlightmod.pink_garnet_items"))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.PINK_GARNET);
//                        entries.add(ModItems.RAW_PINK_GARNET);
//
//
//                        entries.add(ModItems.STARLIGHT_ASHES);
//
////                        entries.add(ModItems.PINK_GARNET_SWORD);
////                        entries.add(ModItems.PINK_GARNET_PICKAXE);
////                        entries.add(ModItems.PINK_GARNET_SHOVEL);
////                        entries.add(ModItems.PINK_GARNET_AXE);
////                        entries.add(ModItems.PINK_GARNET_HOE);
//
////                        entries.add(ModItems.PINK_GARNET_HAMMER);
//
//                        entries.add(ModItems.PINK_GARNET_HELMET);
//                        entries.add(ModItems.PINK_GARNET_CHESTPLATE);
//                        entries.add(ModItems.PINK_GARNET_LEGGINGS);
//                        entries.add(ModItems.PINK_GARNET_BOOTS);
//
//                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);
//
//
//                    }).build());
//
//    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(StormlightMod.MOD_ID, "pink_garnet_blocks"),
//            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
//                    .displayName(Text.translatable("itemgroup.stormlightmod.pink_garnet_blocks"))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
//                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
//
//                        entries.add(ModBlocks.PINK_GARNET_ORE);
//                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
//
//                        entries.add(ModBlocks.DRIFTWOOD_LOG);
//                        entries.add(ModBlocks.DRIFTWOOD_WOOD);
//                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
//                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
//
//                        entries.add(ModBlocks.DRIFTWOOD_PLANKS);
//                        entries.add(ModBlocks.DRIFTWOOD_LEAVES);
//
//                        entries.add(ModBlocks.DRIFTWOOD_SAPLING);
//
//
//                    }).build());

    public static final ItemGroup STORMLIGHT_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StormlightMod.MOD_ID, "stormlight_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DEEPSLATE_EMERALD_ORE))
                    .displayName(Text.translatable("itemgroup.stormlightmod.stormlight_blocks"))
                    .entries((displayContext, entries) -> {

//                        entries.add(ModBlocks.DRIFTWOOD_LOG);
//                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
//                        entries.add(ModBlocks.DRIFTWOOD_WOOD);
//                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
//                        entries.add(ModBlocks.DRIFTWOOD_PLANKS);
//                        entries.add(ModBlocks.DRIFTWOOD_LEAVES);


                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.EMERALD_ORE);
                        entries.add(ModBlocks.SMOKESTONE_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.GARNET_ORE);
                        entries.add(ModBlocks.ZIRCON_ORE);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.HELIODOR_ORE);

                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_EMERALD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SMOKESTONE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZIRCON_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_HELIODOR_ORE);

                    }).build());

    public static final ItemGroup STORMLIGHT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StormlightMod.MOD_ID, "stormlight_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EMERALD_SPHERE))
                    .displayName(Text.translatable("itemgroup.stormlightmod.stormlight_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.UNCUT_SAPPHIRE);
                        entries.add(ModItems.UNCUT_EMERALD);
                        entries.add(ModItems.UNCUT_SMOKESTONE);
                        entries.add(ModItems.UNCUT_RUBY);
                        entries.add(ModItems.UNCUT_GARNET);
                        entries.add(ModItems.UNCUT_ZIRCON);
                        entries.add(ModItems.UNCUT_TOPAZ);
                        entries.add(ModItems.UNCUT_HELIODOR);

                        entries.add(ModItems.CUT_SAPPHIRE);
                        entries.add(ModItems.CUT_EMERALD);
                        entries.add(ModItems.CUT_SMOKESTONE);
                        entries.add(ModItems.CUT_RUBY);
                        entries.add(ModItems.CUT_GARNET);
                        entries.add(ModItems.CUT_DIAMOND);
                        entries.add(ModItems.CUT_ZIRCON);
                        entries.add(ModItems.CUT_AMETHYST);
                        entries.add(ModItems.CUT_TOPAZ);
                        entries.add(ModItems.CUT_HELIODOR);

                        entries.add(ModItems.SAPPHIRE_SPHERE);
                        entries.add(ModItems.EMERALD_SPHERE);
                        entries.add(ModItems.SMOKESTONE_SPHERE);
                        entries.add(ModItems.RUBY_SPHERE);
                        entries.add(ModItems.GARNET_SPHERE);
                        entries.add(ModItems.DIAMOND_SPHERE);
                        entries.add(ModItems.ZIRCON_SPHERE);
                        entries.add(ModItems.AMETHYST_SPHERE);
                        entries.add(ModItems.TOPAZ_SPHERE);
                        entries.add(ModItems.HELIODOR_SPHERE);

                        entries.add(ModItems.INFUSED_SAPPHIRE_SPHERE);
                        entries.add(ModItems.INFUSED_EMERALD_SPHERE);
                        entries.add(ModItems.INFUSED_SMOKESTONE_SPHERE);
                        entries.add(ModItems.INFUSED_RUBY_SPHERE);
                        entries.add(ModItems.INFUSED_GARNET_SPHERE);
                        entries.add(ModItems.INFUSED_DIAMOND_SPHERE);
                        entries.add(ModItems.INFUSED_ZIRCON_SPHERE);
                        entries.add(ModItems.INFUSED_AMETHYST_SPHERE);
                        entries.add(ModItems.INFUSED_TOPAZ_SPHERE);
                        entries.add(ModItems.INFUSED_HELIODOR_SPHERE);

                        entries.add(ModItems.VOID_INFUSED_SAPPHIRE_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_EMERALD_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_SMOKESTONE_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_RUBY_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_GARNET_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_DIAMOND_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_ZIRCON_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_AMETHYST_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_TOPAZ_SPHERE);
                        entries.add(ModItems.VOID_INFUSED_HELIODOR_SPHERE);

                    }).build());

    public static final ItemGroup STORMLIGHT_EQUIPPABLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StormlightMod.MOD_ID, "stormlight_equippables"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHARD_PLATE_HELMET))
                    .displayName(Text.translatable("itemgroup.stormlightmod.stormlight_equippables"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHARD_PLATE_HELMET);
                        entries.add(ModItems.SHARD_PLATE_CHESTPLATE);
                        entries.add(ModItems.SHARD_PLATE_LEGGINGS);
                        entries.add(ModItems.SHARD_PLATE_BOOTS);
                        entries.add(ModItems.SHARD_BLADE);

                    }).build());


    public static void registerItemGroups() {
        StormlightMod.LOGGER.info("Registering Item Groups for " + StormlightMod.MOD_ID);
    }
}
