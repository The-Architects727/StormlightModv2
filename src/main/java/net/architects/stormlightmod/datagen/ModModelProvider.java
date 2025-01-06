package net.architects.stormlightmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SHARD_BLADE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHARD_PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHARD_PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHARD_PLATE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHARD_PLATE_BOOTS));


    }
}
