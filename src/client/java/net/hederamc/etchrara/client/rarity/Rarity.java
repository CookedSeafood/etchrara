package net.hederamc.etchrara.client.rarity;

import java.awt.Color;
import net.hederamc.fishbonetrehalose.api.Text;
import org.jspecify.annotations.Nullable;

public enum Rarity {
    COMMON("common",        Color.WHITE,             new Color(0x3f3f3f)),
    UNCOMMON("uncommon",    new Color(0xffff55), new Color(0x3f3f15)),
    RARE("rare",            new Color(0x55ffff), new Color(0x153f3f)),
    EPIC("epic",            new Color(0xff55ff), new Color(0x3f153f)),
    LEGENDARY("legendary",  new Color(0xffaa00), new Color(0x3f2a00)),
    MYTHIC("mythic",        new Color(0xcc55ff), new Color(0x33153f)),
    DIVINE("divine",        new Color(0x55ffcc), new Color(0x153f33)),
    ETERNAL("eternal",      new Color(0x555555), new Color(0x151515)),
    SPECIAL("special",      new Color(0xff5555), new Color(0x3f1515)),
    ADMIN("admin",          new Color(0xaa0000), new Color(0x2a0000));

    private final String name;
    private Color color;
    private Color shadowColor;

    private Rarity(String name, Color color, Color shadowColor) {
        this.name = name;
        this.color = color;
        this.shadowColor = shadowColor;
    }

    public Text colorize(Text text) {
        return text.withStyle(style -> style.withColor(this.color.getRGB()).withShadowColor(this.shadowColor.getRGB()));
    }

    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getShadowColor() {
        return this.shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public static Rarity byNameOrCommon(String name) {
        return byNameOrDefault(name, COMMON);
    }

    public static Rarity byNameOrDefault(String name, Rarity fallback) {
        Rarity rarity = byName(name);
        return rarity != null ? rarity : fallback;
    }

    @Nullable
    public static Rarity byName(String name) {
        for (Rarity rarity : values()) {
            if (rarity.name.equals(name)) {
                return rarity;
            }
        }

        return null;
    }
}
