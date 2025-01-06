package net.architects.stormlightmod.effect;

import net.architects.stormlightmod.StormlightMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> SHARD_PLATE_BENEFITS = registerStatusEffect("shard_enhanced",
            new ArmorEffect(StatusEffectCategory.BENEFICIAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(StormlightMod.MOD_ID, "strength"), 3,
                            EntityAttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(StormlightMod.MOD_ID, "speed"), 0.3F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_JUMP_STRENGTH,
                            Identifier.of(StormlightMod.MOD_ID, "jump_boost"), 0.2,
                            EntityAttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_SAFE_FALL_DISTANCE,
                            Identifier.of(StormlightMod.MOD_ID, "fall_disatance"), 5.0,
                            EntityAttributeModifier.Operation.ADD_VALUE
                    )
    );

    public static final RegistryEntry<StatusEffect> INCOMPLETE_SHARD_PLATE = registerStatusEffect("incomplete_shardplate",
            new ArmorEffect(StatusEffectCategory.HARMFUL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR,
                            Identifier.of(StormlightMod.MOD_ID, "cracked_armor"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_JUMP_STRENGTH,
                            Identifier.of(StormlightMod.MOD_ID, "heavy"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(StormlightMod.MOD_ID, "slowness"), -0.25F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(StormlightMod.MOD_ID, "weakness"), -4f,
                            EntityAttributeModifier.Operation.ADD_VALUE));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(StormlightMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        StormlightMod.LOGGER.info("Registering Mod Effects for " + StormlightMod.MOD_ID);
    }
}
