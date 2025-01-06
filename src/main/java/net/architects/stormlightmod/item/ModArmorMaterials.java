package net.architects.stormlightmod.item;

import net.architects.stormlightmod.StormlightMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> SHARDPLATE_ARMOR_MATERIAL = registerArmorMaterial("shard_plate",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 10);
                map.put(ArmorItem.Type.CHESTPLATE, 14);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 8);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.AIR),
                    List.of(new ArmorMaterial.Layer(Identifier.of(StormlightMod.MOD_ID, "shard_plate"))), 8,2));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(StormlightMod.MOD_ID, name), material.get());
    }
}
