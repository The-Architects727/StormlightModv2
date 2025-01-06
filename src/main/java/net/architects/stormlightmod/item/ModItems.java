package net.architects.stormlightmod.item;

import net.architects.stormlightmod.item.custom.ShardBladeItem;
import net.architects.stormlightmod.util.ShardbladeDamageHandeler;
import net.architects.stormlightmod.util.ShardplateDamageHandeler;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.architects.stormlightmod.StormlightMod;
import net.architects.stormlightmod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item UNCUT_SAPPHIRE = registerItem("uncut_sapphire",
            new Item(new Item.Settings()));
    public static final Item UNCUT_EMERALD = registerItem("uncut_emerald",
            new Item(new Item.Settings()));
    public static final Item UNCUT_SMOKESTONE = registerItem("uncut_smokestone",
            new Item(new Item.Settings()));
    public static final Item UNCUT_RUBY = registerItem("uncut_ruby",
            new Item(new Item.Settings()));
    public static final Item UNCUT_GARNET = registerItem("uncut_garnet",
            new Item(new Item.Settings()));
    public static final Item UNCUT_ZIRCON = registerItem("uncut_zircon",
            new Item(new Item.Settings()));
    public static final Item UNCUT_TOPAZ = registerItem("uncut_topaz",
            new Item(new Item.Settings()));
    public static final Item UNCUT_HELIODOR = registerItem("uncut_heliodor",
            new Item(new Item.Settings()));

    public static final Item CUT_SAPPHIRE = registerItem("cut_sapphire",
            new Item(new Item.Settings()));
    public static final Item CUT_SMOKESTONE = registerItem("cut_smokestone",
            new Item(new Item.Settings()));
    public static final Item CUT_RUBY = registerItem("cut_ruby",
            new Item(new Item.Settings()));
    public static final Item CUT_GARNET = registerItem("cut_garnet",
            new Item(new Item.Settings()));
    public static final Item CUT_DIAMOND = registerItem("cut_diamond",
            new Item(new Item.Settings()));
    public static final Item CUT_EMERALD = registerItem("cut_emerald",
            new Item(new Item.Settings()));
    public static final Item CUT_ZIRCON = registerItem("cut_zircon",
            new Item(new Item.Settings()));
    public static final Item CUT_AMETHYST = registerItem("cut_amethyst",
            new Item(new Item.Settings()));
    public static final Item CUT_TOPAZ = registerItem("cut_topaz",
            new Item(new Item.Settings()));
    public static final Item CUT_HELIODOR = registerItem("cut_heliodor",
            new Item(new Item.Settings()));

    public static final Item SAPPHIRE_SPHERE = registerItem("sapphire_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item SMOKESTONE_SPHERE = registerItem("smokestone_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item RUBY_SPHERE = registerItem("ruby_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item GARNET_SPHERE = registerItem("garnet_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item DIAMOND_SPHERE = registerItem("diamond_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item EMERALD_SPHERE = registerItem("emerald_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item ZIRCON_SPHERE = registerItem("zircon_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item AMETHYST_SPHERE = registerItem("amethyst_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item TOPAZ_SPHERE = registerItem("topaz_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item HELIODOR_SPHERE = registerItem("heliodor_sphere",
            new Item(new Item.Settings().maxCount(16)));

    public static final Item INFUSED_SAPPHIRE_SPHERE = registerItem("infused_sapphire_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_SMOKESTONE_SPHERE = registerItem("infused_smokestone_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_RUBY_SPHERE = registerItem("infused_ruby_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_GARNET_SPHERE = registerItem("infused_garnet_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_DIAMOND_SPHERE = registerItem("infused_diamond_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_EMERALD_SPHERE = registerItem("infused_emerald_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_ZIRCON_SPHERE = registerItem("infused_zircon_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_AMETHYST_SPHERE = registerItem("infused_amethyst_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_TOPAZ_SPHERE = registerItem("infused_topaz_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item INFUSED_HELIODOR_SPHERE = registerItem("infused_heliodor_sphere",
            new Item(new Item.Settings().maxCount(16)));

    public static final Item VOID_INFUSED_SAPPHIRE_SPHERE = registerItem("void_infused_sapphire_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_SMOKESTONE_SPHERE = registerItem("void_infused_smokestone_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_RUBY_SPHERE = registerItem("void_infused_ruby_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_GARNET_SPHERE = registerItem("void_infused_garnet_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_DIAMOND_SPHERE = registerItem("void_infused_diamond_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_EMERALD_SPHERE = registerItem("void_infused_emerald_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_ZIRCON_SPHERE = registerItem("void_infused_zircon_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_AMETHYST_SPHERE = registerItem("void_infused_amethyst_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_TOPAZ_SPHERE = registerItem("void_infused_topaz_sphere",
            new Item(new Item.Settings().maxCount(16)));
    public static final Item VOID_INFUSED_HELIODOR_SPHERE = registerItem("void_infused_heliodor_sphere",
            new Item(new Item.Settings().maxCount(16)));


    private static final ShardplateDamageHandeler damageHandeler = new ShardplateDamageHandeler();
    public static final Item SHARD_PLATE_HELMET = registerItem("shard_plate_helmet",
            new ModArmorItem(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(15).customDamage(damageHandeler)));
    public static final Item SHARD_PLATE_CHESTPLATE = registerItem("shard_plate_chestplate",
            new ArmorItem(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(25).customDamage(damageHandeler)));
    public static final Item SHARD_PLATE_LEGGINGS = registerItem("shard_plate_leggings",
            new ArmorItem(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(15).customDamage(damageHandeler)));
    public static final Item SHARD_PLATE_BOOTS = registerItem("shard_plate_boots",
            new ArmorItem(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(15).customDamage(damageHandeler)));


    private static final ShardbladeDamageHandeler damageHandelerShardblade = new ShardbladeDamageHandeler();
    public static final Item SHARD_BLADE = registerItem("shard_blade",
            new ShardBladeItem(ModToolMaterials.SHARD,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SHARD, 4, 1f)).customDamage(damageHandelerShardblade)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StormlightMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        StormlightMod.LOGGER.info("Registering Mod Items for " + StormlightMod.MOD_ID);

    }
}