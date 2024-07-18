package com.heebin.completevanilladrawers;

import com.jaquadro.minecraft.storagedrawers.block.BlockStandardDrawers;
import com.jaquadro.minecraft.storagedrawers.block.BlockTrim;
import com.jaquadro.minecraft.storagedrawers.item.ItemDrawers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CompleteVanillaDrawers.MODID)
public class CompleteVanillaDrawers {
    public static final String MODID = "completevanilladrawers";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Block>
        CHERRY_FULL_DRAWERS_1 = BLOCKS.register("cherry_full_drawers_1", () -> new BlockStandardDrawers(1, false, getWoodenDrawerProperties())),
        CHERRY_FULL_DRAWERS_2 = BLOCKS.register("cherry_full_drawers_2", () -> new BlockStandardDrawers(2, false, getWoodenDrawerProperties())),
        CHERRY_FULL_DRAWERS_4 = BLOCKS.register("cherry_full_drawers_4", () -> new BlockStandardDrawers(4, false, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_1 = BLOCKS.register("cherry_half_drawers_1", () -> new BlockStandardDrawers(1, true, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_2 = BLOCKS.register("cherry_half_drawers_2", () -> new BlockStandardDrawers(2, true, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_4 = BLOCKS.register("cherry_half_drawers_4", () -> new BlockStandardDrawers(4, true, getWoodenDrawerProperties())),

        MANGROVE_FULL_DRAWERS_1 = BLOCKS.register("mangrove_full_drawers_1", () -> new BlockStandardDrawers(1, false, getWoodenDrawerProperties())),
        MANGROVE_FULL_DRAWERS_2 = BLOCKS.register("mangrove_full_drawers_2", () -> new BlockStandardDrawers(2, false, getWoodenDrawerProperties())),
        MANGROVE_FULL_DRAWERS_4 = BLOCKS.register("mangrove_full_drawers_4", () -> new BlockStandardDrawers(4, false, getWoodenDrawerProperties())),
        MANGROVE_HALF_DRAWERS_1 = BLOCKS.register("mangrove_half_drawers_1", () -> new BlockStandardDrawers(1, true, getWoodenDrawerProperties())),
        MANGROVE_HALF_DRAWERS_2 = BLOCKS.register("mangrove_half_drawers_2", () -> new BlockStandardDrawers(2, true, getWoodenDrawerProperties())),
        MANGROVE_HALF_DRAWERS_4 = BLOCKS.register("mangrove_half_drawers_4", () -> new BlockStandardDrawers(4, true, getWoodenDrawerProperties())),

        BAMBOO_FULL_DRAWERS_1 = BLOCKS.register("bamboo_full_drawers_1", () -> new BlockStandardDrawers(1, false, getWoodenDrawerProperties())),
        BAMBOO_FULL_DRAWERS_2 = BLOCKS.register("bamboo_full_drawers_2", () -> new BlockStandardDrawers(2, false, getWoodenDrawerProperties())),
        BAMBOO_FULL_DRAWERS_4 = BLOCKS.register("bamboo_full_drawers_4", () -> new BlockStandardDrawers(4, false, getWoodenDrawerProperties())),
        BAMBOO_HALF_DRAWERS_1 = BLOCKS.register("bamboo_half_drawers_1", () -> new BlockStandardDrawers(1, true, getWoodenDrawerProperties())),
        BAMBOO_HALF_DRAWERS_2 = BLOCKS.register("bamboo_half_drawers_2", () -> new BlockStandardDrawers(2, true, getWoodenDrawerProperties())),
        BAMBOO_HALF_DRAWERS_4 = BLOCKS.register("bamboo_half_drawers_4", () -> new BlockStandardDrawers(4, true, getWoodenDrawerProperties())),

        CHERRY_TRIM = BLOCKS.register("cherry_trim", () -> new BlockTrim(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 4f))),
        MANGROVE_TRIM = BLOCKS.register("mangrove_trim", () -> new BlockTrim(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 4f))),
        BAMBOO_TRIM = BLOCKS.register("bamboo_trim", () -> new BlockTrim(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 4f)));

    public static final RegistryObject<Item>
        CHERRY_FULL_DRAWERS_1_ITEM = ITEMS.register("cherry_full_drawers_1", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_1.get(), new Item.Properties())),
        CHERRY_FULL_DRAWERS_2_ITEM = ITEMS.register("cherry_full_drawers_2", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_2.get(), new Item.Properties())),
        CHERRY_FULL_DRAWERS_4_ITEM = ITEMS.register("cherry_full_drawers_4", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_4.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_1_ITEM = ITEMS.register("cherry_half_drawers_1", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_1.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_2_ITEM = ITEMS.register("cherry_half_drawers_2", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_2.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_4_ITEM = ITEMS.register("cherry_half_drawers_4", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_4.get(), new Item.Properties())),

        MANGROVE_FULL_DRAWERS_1_ITEM = ITEMS.register("mangrove_full_drawers_1", () -> new ItemDrawers(MANGROVE_FULL_DRAWERS_1.get(), new Item.Properties())),
        MANGROVE_FULL_DRAWERS_2_ITEM = ITEMS.register("mangrove_full_drawers_2", () -> new ItemDrawers(MANGROVE_FULL_DRAWERS_2.get(), new Item.Properties())),
        MANGROVE_FULL_DRAWERS_4_ITEM = ITEMS.register("mangrove_full_drawers_4", () -> new ItemDrawers(MANGROVE_FULL_DRAWERS_4.get(), new Item.Properties())),
        MANGROVE_HALF_DRAWERS_1_ITEM = ITEMS.register("mangrove_half_drawers_1", () -> new ItemDrawers(MANGROVE_HALF_DRAWERS_1.get(), new Item.Properties())),
        MANGROVE_HALF_DRAWERS_2_ITEM = ITEMS.register("mangrove_half_drawers_2", () -> new ItemDrawers(MANGROVE_HALF_DRAWERS_2.get(), new Item.Properties())),
        MANGROVE_HALF_DRAWERS_4_ITEM = ITEMS.register("mangrove_half_drawers_4", () -> new ItemDrawers(MANGROVE_HALF_DRAWERS_4.get(), new Item.Properties())),

        BAMBOO_FULL_DRAWERS_1_ITEM = ITEMS.register("bamboo_full_drawers_1", () -> new ItemDrawers(BAMBOO_FULL_DRAWERS_1.get(), new Item.Properties())),
        BAMBOO_FULL_DRAWERS_2_ITEM = ITEMS.register("bamboo_full_drawers_2", () -> new ItemDrawers(BAMBOO_FULL_DRAWERS_2.get(), new Item.Properties())),
        BAMBOO_FULL_DRAWERS_4_ITEM = ITEMS.register("bamboo_full_drawers_4", () -> new ItemDrawers(BAMBOO_FULL_DRAWERS_4.get(), new Item.Properties())),
        BAMBOO_HALF_DRAWERS_1_ITEM = ITEMS.register("bamboo_half_drawers_1", () -> new ItemDrawers(BAMBOO_HALF_DRAWERS_1.get(), new Item.Properties())),
        BAMBOO_HALF_DRAWERS_2_ITEM = ITEMS.register("bamboo_half_drawers_2", () -> new ItemDrawers(BAMBOO_HALF_DRAWERS_2.get(), new Item.Properties())),
        BAMBOO_HALF_DRAWERS_4_ITEM = ITEMS.register("bamboo_half_drawers_4", () -> new ItemDrawers(BAMBOO_HALF_DRAWERS_4.get(), new Item.Properties())),

        CHERRY_TRIM_ITEM = ITEMS.register("cherry_trim", () -> new BlockItem(CHERRY_TRIM.get(), new Item.Properties())),
        MANGROVE_TRIM_ITEM = ITEMS.register("mangrove_trim", () -> new BlockItem(MANGROVE_TRIM.get(), new Item.Properties())),
        BAMBOO_TRIM_ITEM = ITEMS.register("bamboo_trim", () -> new BlockItem(BAMBOO_TRIM.get(), new Item.Properties()));

    private static BlockBehaviour.Properties getWoodenDrawerProperties() {
        return BlockBehaviour.Properties.of()
            .sound(SoundType.WOOD)
            .strength(3f, 4f)
            .isSuffocating((blockState, blockGetter, blockPos) -> false )
            .isRedstoneConductor((blockState, blockGetter, blockPos) -> false);
    }

    public CompleteVanillaDrawers() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::addCreative);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // AHAHAHAHGAQHAHAHGAQEH TQAAHTEAQGHAQHAHAHAHAHHAQAHAHTAQOHGadkgjaqk;ytjqt;kq2j3;q1kf;tg
        if (event.getTabKey().toString()
                .equals("ResourceKey[minecraft:creative_mode_tab / storagedrawers:storagedrawers]")) {
            for(RegistryObject<Item> obj : CompleteVanillaDrawers.ITEMS.getEntries()) {
                event.accept(obj);
            }
        }
    }
}
