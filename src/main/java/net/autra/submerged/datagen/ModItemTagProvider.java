package net.autra.submerged.datagen;

import net.autra.submerged.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.SAPPHIRE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.SAPPHIRE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.SAPPHIRE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.SAPPHIRE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.SAPPHIRE_HOE);

    }
}
