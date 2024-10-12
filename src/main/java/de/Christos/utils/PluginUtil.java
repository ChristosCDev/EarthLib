package de.Christos.utils;

import de.Christos.EarthLib;

public class PluginUtil {

    public static boolean isInstalled(String pluginName) {
        boolean b;
        if(EarthLib.getInstance().getServer().getPluginManager().getPlugin(pluginName) == null) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }
}
