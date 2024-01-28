package me.rejomy.automessage.util;

import org.bukkit.ChatColor;

public class ColorUtil {

    public static String toColor(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}
