package dev.pbone.simplycoins.forge;

import dev.pbone.simplycoins.SimplyCoins;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimplyCoins.MOD_ID)
public class SimplyCoinsForge {
    public SimplyCoinsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SimplyCoins.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SimplyCoins.init();
    }
}
