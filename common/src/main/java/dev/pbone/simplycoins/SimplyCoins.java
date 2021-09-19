package dev.pbone.simplycoins;

import me.shedaniel.architectury.registry.CreativeTabs;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import java.util.function.Supplier;

public class SimplyCoins {
    public static final String MOD_ID = "simplycoins";
    // Registering a new creative tab
    public static final CreativeModeTab COINS_TAB = CreativeTabs.create(new ResourceLocation(MOD_ID, "coins_tab"), new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(COIN_2.get());
        }
    });
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> COIN_1 = ITEMS.register("coin_1", () ->
            new Item(new Item.Properties().tab(SimplyCoins.COINS_TAB).rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> COIN_2 = ITEMS.register("coin_2", () ->
            new Item(new Item.Properties().tab(SimplyCoins.COINS_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> COIN_3 = ITEMS.register("coin_3", () ->
            new Item(new Item.Properties().tab(SimplyCoins.COINS_TAB).rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> COIN_4 = ITEMS.register("coin_4", () ->
            new Item(new Item.Properties().tab(SimplyCoins.COINS_TAB).rarity(Rarity.EPIC)));
    
    public static void init() {
        ITEMS.register();

        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
