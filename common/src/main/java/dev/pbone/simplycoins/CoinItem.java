package dev.pbone.simplycoins;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CoinItem extends Item {
    public int Value;
    public boolean IsNetherite;

    public CoinItem(Properties properties, int value) {
        super(properties);
        Value = value;
        IsNetherite = false;
    }

    public CoinItem(Properties properties, int value, boolean isNetherite) {
        super(properties);
        Value = value;
        IsNetherite = isNetherite;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(new TextComponent("$" + Value)
            .withStyle(ChatFormatting.GOLD));

        if (IsNetherite) {
            list.add(new TranslatableComponent("item.simplycoins.coin_4.description")
                .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
    }
}
