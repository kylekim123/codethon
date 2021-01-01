package com.example.examplemod.util;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.BlockItemBase;
import com.example.examplemod.blocks.CobaltBlock;
import com.example.examplemod.items.ItemBase;
import com.example.examplemod.tools.ModitemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);


    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //items
    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt", ItemBase::new);
    public static final RegistryObject<Item> REFINED_COBALT = ITEMS.register("refined_cobalt", ItemBase::new);

    //FOR BLOCKS
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", CobaltBlock::new);
    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));


    //tools
    public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword",() ->
            new SwordItem(ModitemTier.COBALT, 8, -2.7F, new Item.Properties().group(ExampleMod.TAB)));
    public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () ->
            new PickaxeItem(ModitemTier.COBALT,2, -3.0F, new Item.Properties().group(ExampleMod.TAB)));
    public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe", () ->
            new AxeItem(ModitemTier.COBALT,10, -3.3F, new Item.Properties().group(ExampleMod.TAB)));
    public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () ->
            new ShovelItem(ModitemTier.COBALT,1, -3.0F, new Item.Properties().group(ExampleMod.TAB)));




}
