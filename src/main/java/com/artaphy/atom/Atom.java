package com.artaphy.atom;

import com.artaphy.atom.utils.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Atom extends JavaPlugin {

    private static Atom instance;
    private Logger logger;

    @Override
    public void onEnable() {
        instance = this;
        this.logger = new Logger(this);

        logger.info("Atom has been enabled!");
    }

    @Override
    public void onDisable() {
        logger.info("Atom has been disabled!");
    }

    public static Atom getInstance() {
        return instance;
    }

    @NotNull
    @Override
    public Logger getLogger() {
        return logger;
    }
}
