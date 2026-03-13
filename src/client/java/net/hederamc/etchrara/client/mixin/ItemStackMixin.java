package net.hederamc.etchrara.client.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import java.util.function.Consumer;
import net.hederamc.etchrara.EtchraraClient;
import net.hederamc.etchrara.client.rarity.Rarity;
import net.hederamc.fishbonetrehalose.api.Text;
import net.hederamc.generalcustomdata.api.CustomRarityHolder;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements CustomRarityHolder {
    @Redirect(
        method = "getStyledHoverName()Lnet/minecraft/network/chat/Component;",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/chat/MutableComponent;withStyle(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;"
        )
    )
    private MutableComponent withRarityColor(MutableComponent hoverName, ChatFormatting formatting) {
        Rarity rarity = Rarity.byNameOrCommon(this.getCustomRarityOrRarity());
        return (MutableComponent) rarity.colorize(hoverName);
    }

    @Inject(
        method = "addDetailsToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;Ljava/util/function/Consumer;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/item/ItemStack;addAttributeTooltips(Ljava/util/function/Consumer;Lnet/minecraft/world/item/component/TooltipDisplay;Lnet/minecraft/world/entity/player/Player;)V",
            shift = At.Shift.AFTER
        )
    )
    private void addRarityToTooltip(CallbackInfo ci, @Local Consumer<Component> builder) {
        if (!EtchraraClient.CONFIG.displayRarityNameInTooltip) {
            return;
        }

        Rarity rarity = Rarity.byNameOrCommon(this.getCustomRarityOrRarity());
        builder.accept((MutableComponent)
                rarity.colorize(Text.fromTranslatable("item.rarity." + rarity.getName()))
                        .withStyle(style -> style.withBold(true)));
    }
}
