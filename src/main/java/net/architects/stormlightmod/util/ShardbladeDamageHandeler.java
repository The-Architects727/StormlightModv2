package net.architects.stormlightmod.util;

import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class ShardbladeDamageHandeler implements CustomDamageHandler {
    @Override
    public int damage(ItemStack stack, int amount, LivingEntity entity, EquipmentSlot slot, Runnable breakCallback) {
        return 0;
    }
}
