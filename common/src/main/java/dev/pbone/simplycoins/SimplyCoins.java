package dev.pbone.simplycoins;

import dev.pbone.simplycoins.items.CoinItem;
import dev.pbone.simplycoins.items.ItemWithDescription;
import dev.pbone.simplycoins.items.SpecialCoinItem;
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

    // NORMAL COINS
    public static final RegistrySupplier<Item> COIN_1 = RegisterCoin("coin_1", 1, Rarity.COMMON);
    public static final RegistrySupplier<Item> COIN_2 = RegisterCoin("coin_2", 8, Rarity.UNCOMMON);
    public static final RegistrySupplier<Item> COIN_3 = RegisterCoin("coin_3", 64, Rarity.RARE);
    public static final RegistrySupplier<Item> COIN_4 = ITEMS.register("coin_4", () ->
            new CoinItem(DefProps().rarity(Rarity.EPIC).fireResistant(), 512, DescKey("coin_4")));

    // COMMEMORATIVE COINS
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_0 = RegisterSpecialCoin("special_coin_1_0");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_3 = RegisterSpecialCoin("special_coin_1_3");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_4 = RegisterSpecialCoin("special_coin_1_4");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_4_RARE = RegisterSpecialCoin("special_coin_1_4_rare");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_5 = RegisterSpecialCoin("special_coin_1_5");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_6 = RegisterSpecialCoin("special_coin_1_6");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_9 = RegisterSpecialCoin("special_coin_1_9");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_11 = RegisterSpecialCoin("special_coin_1_11");
    public static final RegistrySupplier<Item> SPECIAL_COIN_1_12 = RegisterSpecialCoin("special_coin_1_12");

    public static void init() {
        ITEMS.register();
    }

    public static String DescKey(String itemName) {
        return "item.simplycoins." + itemName + ".description";
    }
    public static Item.Properties DefProps() {
        return new Item.Properties().tab(SimplyCoins.COINS_TAB);
    }

    public static RegistrySupplier<Item> RegisterCoin(String name, int value, Rarity rarity) {
        return ITEMS.register(name, () ->
                new CoinItem(DefProps().rarity(rarity), value));
    }
    public static RegistrySupplier<Item> RegisterSpecialCoin(String name) {
        return ITEMS.register(name, () ->
                new SpecialCoinItem(DefProps().fireResistant(), DescKey(name)));
    }
}
