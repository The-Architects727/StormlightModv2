package net.architects.stormlightmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.SAPPHIRE_ORE, multipleOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.UNCUT_SAPPHIRE, 3, 7));
        addDrop(ModBlocks.EMERALD_ORE, multipleOreDrops(ModBlocks.EMERALD_ORE, ModItems.UNCUT_EMERALD, 3, 7));
        addDrop(ModBlocks.SMOKESTONE_ORE, multipleOreDrops(ModBlocks.SMOKESTONE_ORE, ModItems.UNCUT_SMOKESTONE, 3, 7));
        addDrop(ModBlocks.RUBY_ORE, multipleOreDrops(ModBlocks.RUBY_ORE, ModItems.UNCUT_RUBY, 3, 7));
        addDrop(ModBlocks.GARNET_ORE, multipleOreDrops(ModBlocks.GARNET_ORE, ModItems.UNCUT_GARNET, 3, 7));
        addDrop(ModBlocks.ZIRCON_ORE, multipleOreDrops(ModBlocks.ZIRCON_ORE, ModItems.UNCUT_ZIRCON, 3, 7));
        addDrop(ModBlocks.TOPAZ_ORE, multipleOreDrops(ModBlocks.TOPAZ_ORE, ModItems.UNCUT_TOPAZ, 3, 7));
        addDrop(ModBlocks.HELIODOR_ORE, multipleOreDrops(ModBlocks.HELIODOR_ORE, ModItems.UNCUT_HELIODOR, 3, 7));

        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.UNCUT_SAPPHIRE, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_EMERALD_ORE, ModItems.UNCUT_EMERALD, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_SMOKESTONE_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_SMOKESTONE_ORE, ModItems.UNCUT_SMOKESTONE, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.UNCUT_RUBY, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_GARNET_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_GARNET_ORE, ModItems.UNCUT_GARNET, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_ZIRCON_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_ZIRCON_ORE, ModItems.UNCUT_ZIRCON, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.UNCUT_TOPAZ, 3, 7));
        addDrop(ModBlocks.DEEPSLATE_HELIODOR_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_HELIODOR_ORE, ModItems.UNCUT_HELIODOR, 3, 7));

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
