package de.Christos;

import de.Christos.commands.LibCommand;
import de.Christos.utils.PluginUtil;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class EarthLib extends JavaPlugin {

    public static EarthLib instance;
    public static final Logger log = Logger.getLogger("EarthLib");

    public static EarthLib getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getCommand("earthlib").setExecutor(new LibCommand());
    }

    @Override
    public void onDisable() {

    }
}
