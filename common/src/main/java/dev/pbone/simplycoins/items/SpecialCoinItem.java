package dev.pbone.simplycoins.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpecialCoinItem extends ItemWithDescription {
    public SpecialCoinItem(Properties properties) {
        super(properties, null);
    }

    public SpecialCoinItem(Properties properties, String descriptionKey) {
        super(properties, descriptionKey);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(new TranslatableComponent("word.simplycoins.commemorative_coin")
                .withStyle(ChatFormatting.GOLD));

        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }
}
