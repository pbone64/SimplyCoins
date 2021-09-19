package dev.pbone.simplycoins.fabric;

import dev.pbone.simplycoins.SimplyCoins;
import net.fabricmc.api.ModInitializer;

public class SimplyCoinsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SimplyCoins.init();
    }
}
