package com.heebin.completevanilladrawers;

import com.jaquadro.minecraft.storagedrawers.block.BlockStandardDrawers;
import com.jaquadro.minecraft.storagedrawers.block.BlockTrim;
import com.jaquadro.minecraft.storagedrawers.item.ItemDrawers;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {
    public static final String MODID = "completevanilladrawers";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    public static final RegistryObject<Block>
        CHERRY_FULL_DRAWERS_1 = BLOCKS.register("cherry_full_drawers_1", () -> new BlockStandardDrawers(1, false, getWoodenDrawerProperties())),
        CHERRY_FULL_DRAWERS_2 = BLOCKS.register("cherry_full_drawers_2", () -> new BlockStandardDrawers(2, false, getWoodenDrawerProperties())),
        CHERRY_FULL_DRAWERS_4 = BLOCKS.register("cherry_full_drawers_4", () -> new BlockStandardDrawers(4, false, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_1 = BLOCKS.register("cherry_half_drawers_1", () -> new BlockStandardDrawers(1, true, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_2 = BLOCKS.register("cherry_half_drawers_2", () -> new BlockStandardDrawers(2, true, getWoodenDrawerProperties())),
        CHERRY_HALF_DRAWERS_4 = BLOCKS.register("cherry_half_drawers_4", () -> new BlockStandardDrawers(4, true, getWoodenDrawerProperties())),
        CHERRY_TRIM = BLOCKS.register("cherry_trim", () -> new BlockTrim(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 4f)));

    public static final RegistryObject<Item>
        CHERRY_FULL_DRAWERS_1_ITEM = ITEMS.register("cherry_full_drawers_1", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_1.get(), new Item.Properties())),
        CHERRY_FULL_DRAWERS_2_ITEM = ITEMS.register("cherry_full_drawers_2", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_2.get(), new Item.Properties())),
        CHERRY_FULL_DRAWERS_4_ITEM = ITEMS.register("cherry_full_drawers_4", () -> new ItemDrawers(CHERRY_FULL_DRAWERS_4.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_1_ITEM = ITEMS.register("cherry_half_drawers_1", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_1.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_2_ITEM = ITEMS.register("cherry_half_drawers_2", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_2.get(), new Item.Properties())),
        CHERRY_HALF_DRAWERS_4_ITEM = ITEMS.register("cherry_half_drawers_4", () -> new ItemDrawers(CHERRY_HALF_DRAWERS_4.get(), new Item.Properties())),
        CHERRY_TRIM_ITEM = ITEMS.register("cherry_trim", () -> new BlockItem(CHERRY_TRIM.get(), new Item.Properties()));

    private static BlockBehaviour.Properties getWoodenDrawerProperties() {
        return BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 4f).isSuffocating(Main::predFalse).isRedstoneConductor(Main::predFalse);
    }

    private static boolean predFalse(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // AHAHAHAQHAHAHAHAHAHAHAHA HAHAHA
        if (event.getTabKey().toString()
                .equals("ResourceKey[minecraft:creative_mode_tab / storagedrawers:storagedrawers]")) {
            for(RegistryObject<Item> obj : Main.ITEMS.getEntries()) {
                event.accept(obj);
            }
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        if (ModList.get().isLoaded("storagedrawers")) {
            LOGGER.info("storage drawers found!!!!!!!!!!!!!!!");
        } else {
            LOGGER.info("storage drawers not found!!!!!!!!!!!!!!!");
        }
    }
}
