package net.architects.stormlightmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.architects.stormlightmod.block.ModBlocks;
import net.architects.stormlightmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.EMERALD_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.GARNET_ORE)
                .add(ModBlocks.ZIRCON_ORE)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.HELIODOR_ORE)

                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_ZIRCON_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_HELIODOR_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.EMERALD_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.GARNET_ORE)
                .add(ModBlocks.ZIRCON_ORE)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.HELIODOR_ORE)

                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_EMERALD_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_ZIRCON_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_HELIODOR_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.SHARDBLADE_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);


    }
}
