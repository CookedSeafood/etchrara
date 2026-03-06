package net.hederamc.etchrara.client.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.ColorControllerBuilder;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import java.awt.Color;
import net.hederamc.etchrara.EtchraraClient;
import net.hederamc.fishbonetrehalose.api.Text;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parentScreen -> YetAnotherConfigLib.createBuilder()
            .title(Text.literal("Etchrara"))
            .category(ConfigCategory.createBuilder()
                .name(Text.literal("Rarity Color"))
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Common"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Common Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityCommonColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityCommonColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityCommonColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Common Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityCommonShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityCommonShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityCommonShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Uncommon"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Uncommon Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityUncommonColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityUncommonColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityUncommonColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Uncommon Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityUncommonShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityUncommonShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityUncommonShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Rare"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Rare Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityRareColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityRareColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityRareColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Rare Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityRareShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityRareShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityRareShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Epic"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Epic Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityEpicColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityEpicColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityEpicColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Epic Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityEpicShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityEpicShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityEpicShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Legendary"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Legendary Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityLegendaryColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityLegendaryColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityLegendaryColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Legendary Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityLegendaryShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityLegendaryShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityLegendaryShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Mythic"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Mythic Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityMythicColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityMythicColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityMythicColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Mythic Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityMythicShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityMythicShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityMythicShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Divine"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Divine Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityDivineColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityDivineColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityDivineColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Divine Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityDivineShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityDivineShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityDivineShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Eternal"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Eternal Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityEternalColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityEternalColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityEternalColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Eternal Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityEternalShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityEternalShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityEternalShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Special"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Special Color"))
                        .binding(EtchraraClient.DEFAULTS.raritySpecialColor,
                            () -> {
                                return EtchraraClient.CONFIG.raritySpecialColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.raritySpecialColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Special Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.raritySpecialShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.raritySpecialShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.raritySpecialShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Admin"))
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Admin Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityAdminColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityAdminColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityAdminColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .option(Option.<Color>createBuilder()
                        .name(Text.literal("Admin Shadow Color"))
                        .binding(EtchraraClient.DEFAULTS.rarityAdminShadowColor,
                            () -> {
                                return EtchraraClient.CONFIG.rarityAdminShadowColor;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.rarityAdminShadowColor = newVal;
                            })
                        .controller(ColorControllerBuilder::create)
                        .build())
                    .build())
                .build())
            .category(ConfigCategory.createBuilder()
                .name(Text.literal("Rarity Display"))
                .group(OptionGroup.createBuilder()
                    .name(Text.literal("Location"))
                    .option(Option.<Boolean>createBuilder()
                        .name(Text.literal("Display in Tooltip"))
                        .description(OptionDescription.of(Text.literal("In capitalized, bolded letters.")))
                        .binding(EtchraraClient.DEFAULTS.displayRarityInTooltip,
                            () -> {
                                return EtchraraClient.CONFIG.displayRarityInTooltip;
                            },
                            newVal -> {
                                EtchraraClient.CONFIG.displayRarityInTooltip = newVal;
                            })
                        .controller(TickBoxControllerBuilder::create)
                        .build())
                    .build())
                .build())
            .build()
            .generateScreen(parentScreen);
    }
}
