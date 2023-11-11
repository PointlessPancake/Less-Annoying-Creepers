package dev.snas.lessannoyingcreepers;

import org.bukkit.plugin.java.JavaPlugin;

public final class LessAnnoyingCreepers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new dev.snas.lessannoyingcreepers.EntityListener(), this);
    }
}