package com.smartcodelabs.smarttradebot;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SmartTradeBot.MOD_ID)
public class SmartTradeBot {
    public static final String MOD_ID = "smarttradebot";
    private static final Logger LOGGER = LogManager.getLogger();

    public SmartTradeBot() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        LOGGER.info("Smart Trade Bot initialized");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Smart Trade Bot common setup");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Smart Trade Bot client setup");
    }
}
