package dev.pbone.simplycoins.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemWithDescription extends Item {
    public @Nullable String DescriptionKey;

    public ItemWithDescription(Properties properties, @Nullable String descriptionKey) {
        super(properties);
        DescriptionKey = descriptionKey;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        if (DescriptionKey != null) {
            list.add(new TranslatableComponent(DescriptionKey)
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
    }
}
