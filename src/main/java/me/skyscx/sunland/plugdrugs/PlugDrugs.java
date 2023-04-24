package me.skyscx.sunland.plugdrugs;

import me.skyscx.sunland.plugdrugs.Events.PlayerUseDrugs;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlugDrugs extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PlugDrugs Started!");
        //EVENTS
        Bukkit.getPluginManager().registerEvents(new PlayerUseDrugs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("PlugDrugs Stopped!!!");
    }
}
