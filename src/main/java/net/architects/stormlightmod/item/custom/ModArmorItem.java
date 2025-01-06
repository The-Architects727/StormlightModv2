package net.architects.stormlightmod.item.custom;

import com.google.common.collect.ImmutableMap;
import net.architects.stormlightmod.effect.ModEffects;
import net.architects.stormlightmod.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

//TODO (FIX ARMOR)

public class ModArmorItem extends ArmorItem {
//    private static final Map<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>> MATERIAL_TO_EFFECT_MAP =
//            (new ImmutableMap.Builder<RegistryEntry<ArmorMaterial>, List<StatusEffectInstance>>())
//                    .put(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL,
//                            List.of(new StatusEffectInstance(StatusEffects.STRENGTH, 50, 3, false, false),
//                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 50, 3, false, false),
//                                    new StatusEffectInstance(StatusEffects.SPEED, 50, 3, false, false))).build();

    public ModArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public static boolean isUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 2;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                if(hasSomeCorrectArmorOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player)){
                    int goodLevel = 0;
                    int badLevel = 0;
                    if (hasCorrectChestOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player)) {
                        goodLevel += 1;
                    } else {
                        badLevel += 1;
                    }
                    if (hasCorrectLeggingsOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player)) {
                        goodLevel += 1;
                    } else {
                        badLevel += 1;
                    }
                    if (hasCorrectBootsOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player)) {
                        goodLevel += 1;
                    } else {
                        badLevel += 1;
                    }
                    evaluateArmorEffects(player, true, goodLevel);
                    evaluateArmorEffects(player, false, badLevel);
//                    if(hasFullSuitOfArmorOn(player)) {
//                        if(hasCorrectArmorOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player)) {
//                            evaluateArmorEffects(player, true, amountOfCorrectArmorOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player));
//                        } else {
//                            evaluateArmorEffects(player, false, amountOfIncorrectArmorOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player));
//                        }
//                    } else {
//                        evaluateArmorEffects(player, false, amountOfIncorrectArmorOn(ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL, player));
//                    }
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }



    private void evaluateArmorEffects(PlayerEntity player, boolean good, int level) {

        if (level - 1 >= 0) {
            List<StatusEffectInstance> badEffects = List.of(
                    new StatusEffectInstance(ModEffects.INCOMPLETE_SHARD_PLATE, 50, level-1, false, false));

            List<StatusEffectInstance> goodEffects = List.of(
                    new StatusEffectInstance(ModEffects.SHARD_PLATE_BENEFITS, 50, level-1, false, false));

            if(good) {
                addStatusEffect(player, goodEffects);
            } else {
                addStatusEffect(player, badEffects);
            }
        }


    }

    private void addStatusEffect(PlayerEntity player, List<StatusEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream().allMatch(statusEffectInstance -> player.hasStatusEffect(statusEffectInstance.getEffectType()));

        if(!hasPlayerEffect) {
            for (StatusEffectInstance instance : mapStatusEffect) {
                player.addStatusEffect(new StatusEffectInstance(instance.getEffectType(),
                        instance.getDuration(), instance.getAmplifier(), instance.isAmbient(), instance.shouldShowParticles()));
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, RegistryEntry<ArmorMaterial> mapArmorMaterial, List<StatusEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream().allMatch(statusEffectInstance -> player.hasStatusEffect(statusEffectInstance.getEffectType()));

        if(!hasPlayerEffect) {
            for (StatusEffectInstance instance : mapStatusEffect) {
                player.addStatusEffect(new StatusEffectInstance(instance.getEffectType(),
                        instance.getDuration(), instance.getAmplifier(), instance.isAmbient(), instance.shouldShowParticles()));
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        ItemStack helmetStack = ((ItemStack)player.getInventory().getArmorStack(3));
        ItemStack breastplateStack = ((ItemStack)player.getInventory().getArmorStack(2));
        ItemStack leggingsStack = ((ItemStack)player.getInventory().getArmorStack(1));
        ItemStack bootsStack = ((ItemStack)player.getInventory().getArmorStack(0));

        if(helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material) {
            if(isUsable(helmetStack) && isUsable(breastplateStack) && isUsable(leggingsStack) && isUsable(bootsStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasCorrectChestOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        boolean value = false;
        if ((player.getInventory().getArmorStack(2).getItem() instanceof ArmorItem)) {
            if (((ArmorItem) player.getInventory().getArmorStack(2).getItem()).getMaterial() == ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL && isUsable(player.getInventory().getArmorStack(2))) {
                value = true;
            }
        }
        return value;
    }
    private boolean hasCorrectLeggingsOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        boolean value = false;
        if ((player.getInventory().getArmorStack(1).getItem() instanceof ArmorItem)) {
            if (((ArmorItem) player.getInventory().getArmorStack(1).getItem()).getMaterial() == ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL && isUsable(player.getInventory().getArmorStack(1))) {
                value = true;
            }
        }
        return value;
    }
    private boolean hasCorrectBootsOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        boolean value = false;
        if ((player.getInventory().getArmorStack(0).getItem() instanceof ArmorItem)) {
            if (((ArmorItem) player.getInventory().getArmorStack(0).getItem()).getMaterial() == ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL && isUsable(player.getInventory().getArmorStack(0))) {
                value = true;
            }
        }
        return value;
    }


    private boolean hasSomeCorrectArmorOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        boolean value = false;
        for (ItemStack armorStack: player.getInventory().armor) {
            if ((armorStack.getItem() instanceof ArmorItem)) {
                if(((ArmorItem) armorStack.getItem()).getMaterial() == ModArmorMaterials.SHARDPLATE_ARMOR_MATERIAL) {
                    value = true;
                }
            }
        }
        return value;

//        ItemStack boots = player.getInventory().getArmorStack(0);
//        ItemStack leggings = player.getInventory().getArmorStack(1);
//        ItemStack breastplate = player.getInventory().getArmorStack(2);
//        ItemStack helmet = player.getInventory().getArmorStack(3);
//
//        if(!helmet.isEmpty()) {
//            ArmorItem armorHelmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());
//            return armorHelmet.getMaterial() == material;
//        }
//        if(!breastplate.isEmpty()) {
//            ArmorItem armorbreastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
//            return armorbreastplate.getMaterial() == material;
//        }
//        if(!leggings.isEmpty()) {
//            ArmorItem armorleggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
//            return armorleggings.getMaterial() == material;
//        }
//        if(!boots.isEmpty()) {
//            ArmorItem armorboots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
//            return armorboots.getMaterial() == material;
//        }
//
//
//        return false;
    }

    private int amountOfIncorrectArmorOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        int value = 0;
        for (ItemStack armorStack: player.getInventory().armor) {
            if ((armorStack.getItem() instanceof ArmorItem)) {
                if(((ArmorItem) armorStack.getItem()).getMaterial() != material || (((ArmorItem) armorStack.getItem()).getMaterial() == material && !isUsable(armorStack))) {
                    value += 1;
                }
            }
        }
        return value;

    }

    private int amountOfCorrectArmorOn(RegistryEntry<ArmorMaterial> material, PlayerEntity player) {
        int value = 0;
        for (ItemStack armorStack: player.getInventory().armor) {
            if ((armorStack.getItem() instanceof ArmorItem)) {
                if(((ArmorItem) armorStack.getItem()).getMaterial() == material && isUsable(armorStack)) {
                    value += 1;
                }
            }
        }
        return value;

    }



}