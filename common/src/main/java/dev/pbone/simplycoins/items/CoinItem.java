package dev.pbone.simplycoins.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CoinItem extends ItemWithDescription {
    public int Value;

    public CoinItem(Properties properties, int value) {
        super(properties, null);
        Value = value;
    }

    public CoinItem(Properties properties, int value, String descriptionKey) {
        super(properties, descriptionKey);
        Value = value;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(new TextComponent("$" + Value)
                .withStyle(ChatFormatting.GOLD));

        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }
}
