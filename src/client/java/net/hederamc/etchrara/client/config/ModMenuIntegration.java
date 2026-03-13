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
                        .name(Text.fromTranslatable("config.category.rarity_color"))
                        .group(OptionGroup.createBuilder()
                                .name(Text.fromTranslatable("config.group.common"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.common_color"))
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
                                        .name(Text.fromTranslatable("config.option.common_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.uncommon"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.uncommon_color"))
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
                                        .name(Text.fromTranslatable("config.option.uncommon_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.rare"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.rare_color"))
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
                                        .name(Text.fromTranslatable("config.option.rare_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.epic"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.epic_color"))
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
                                        .name(Text.fromTranslatable("config.option.epic_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.legendary"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.legendary_color"))
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
                                        .name(Text.fromTranslatable("config.option.legendary_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.mythic"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.mythic_color"))
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
                                        .name(Text.fromTranslatable("config.option.mythic_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.divine"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.divine_color"))
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
                                        .name(Text.fromTranslatable("config.option.divine_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.eternal"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.eternal_color"))
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
                                        .name(Text.fromTranslatable("config.option.eternal_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.special"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.special_color"))
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
                                        .name(Text.fromTranslatable("config.option.special_shadow_color"))
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
                                .name(Text.fromTranslatable("config.group.admin"))
                                .option(Option.<Color>createBuilder()
                                        .name(Text.fromTranslatable("config.option.admin_color"))
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
                                        .name(Text.fromTranslatable("config.option.admin_shadow_color"))
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
                        .name(Text.fromTranslatable("config.category.display"))
                        .group(OptionGroup.createBuilder()
                                .name(Text.fromTranslatable("config.group.location"))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.fromTranslatable("config.option.display_rarity_name_in_tooltip"))
                                        .description(OptionDescription.of(Text.fromTranslatable("config.description.display_rarity_name_in_tooltip")))
                                        .binding(EtchraraClient.DEFAULTS.displayRarityNameInTooltip,
                                                () -> {
                                                    return EtchraraClient.CONFIG.displayRarityNameInTooltip;
                                                },
                                                newVal -> {
                                                    EtchraraClient.CONFIG.displayRarityNameInTooltip = newVal;
                                                })
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .build())
                        .build())
                .build()
                .generateScreen(parentScreen);
    }
}
