package net.hederamc.etchrara.client.config;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import java.awt.Color;
import net.fabricmc.loader.api.FabricLoader;
import net.hederamc.etchrara.Etchrara;
import net.hederamc.etchrara.client.rarity.Rarity;
import net.minecraft.resources.Identifier;

public final class EtchraraConfig {
    public static ConfigClassHandler<EtchraraConfig> HANDLER = ConfigClassHandler.createBuilder(EtchraraConfig.class)
            .id(Identifier.fromNamespaceAndPath(Etchrara.MOD_NAMESPACE, "client_config"))
            .serializer(
                    config -> GsonConfigSerializerBuilder.create(config)
                            .setPath(FabricLoader.getInstance().getConfigDir().resolve("etchrara.json"))
                            .build())
            .build();
    @SerialEntry public Color rarityCommonColor             = Rarity.COMMON.getColor();
    @SerialEntry public Color rarityCommonShadowColor       = Rarity.COMMON.getShadowColor();
    @SerialEntry public Color rarityUncommonColor           = Rarity.UNCOMMON.getColor();
    @SerialEntry public Color rarityUncommonShadowColor     = Rarity.UNCOMMON.getShadowColor();
    @SerialEntry public Color rarityRareColor               = Rarity.RARE.getColor();
    @SerialEntry public Color rarityRareShadowColor         = Rarity.RARE.getShadowColor();
    @SerialEntry public Color rarityEpicColor               = Rarity.EPIC.getColor();
    @SerialEntry public Color rarityEpicShadowColor         = Rarity.EPIC.getShadowColor();
    @SerialEntry public Color rarityLegendaryColor          = Rarity.LEGENDARY.getColor();
    @SerialEntry public Color rarityLegendaryShadowColor    = Rarity.LEGENDARY.getShadowColor();
    @SerialEntry public Color rarityMythicColor             = Rarity.MYTHIC.getColor();
    @SerialEntry public Color rarityMythicShadowColor       = Rarity.MYTHIC.getShadowColor();
    @SerialEntry public Color rarityDivineColor             = Rarity.DIVINE.getColor();
    @SerialEntry public Color rarityDivineShadowColor       = Rarity.DIVINE.getShadowColor();
    @SerialEntry public Color rarityEternalColor            = Rarity.ETERNAL.getColor();
    @SerialEntry public Color rarityEternalShadowColor      = Rarity.ETERNAL.getShadowColor();
    @SerialEntry public Color raritySpecialColor            = Rarity.SPECIAL.getColor();
    @SerialEntry public Color raritySpecialShadowColor      = Rarity.SPECIAL.getShadowColor();
    @SerialEntry public Color rarityAdminColor              = Rarity.ADMIN.getColor();
    @SerialEntry public Color rarityAdminShadowColor        = Rarity.ADMIN.getShadowColor();
    @SerialEntry public boolean displayRarityNameInTooltip = true;
}
