package net.hederamc.etchrara.client.mixin;

import net.hederamc.etchrara.client.rarity.Rarity;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Gui.class)
public abstract class GuiMixin {
    @Shadow private ItemStack lastToolHighlight;

    @Redirect(
        method = "renderSelectedItemName(Lnet/minecraft/client/gui/GuiGraphics;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/chat/MutableComponent;withStyle(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;"
        )
    )
    private MutableComponent withRarityColor(MutableComponent hoverName, ChatFormatting formatting) {
        Rarity rarity = Rarity.byNameOrCommon(this.lastToolHighlight.getCustomRarityOrRarity());
        return (MutableComponent) rarity.colorize(hoverName);
    }
}
