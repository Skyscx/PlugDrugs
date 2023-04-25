package me.skyscx.sunland.plugdrugs;

import me.skyscx.sunland.plugdrugs.assets.drugs.Drugs_Items;
import me.skyscx.sunland.plugdrugs.commands.ChangerPermissionToUseDrugs;
import me.skyscx.sunland.plugdrugs.events.PlayerUseDrugs;
import me.skyscx.sunland.plugdrugs.items.CreateDrugs;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlugDrugs extends JavaPlugin {
    private static FileConfiguration configuration;
    private static PlugDrugs plugin;
    @Override
    public void onEnable() {
        plugin = this;
        configuration = getConfig();
        PlugDrugs.getPlugin().saveConfig();
        saveDefaultConfig();
        System.out.println("PlugDrugs Started!");
        //ITEMS
        Drugs_Items.init();
        //RECIPE
        CreateDrugs.init();
        //COMMANDS
        getCommand("ChangeUseDrugs").setExecutor(new ChangerPermissionToUseDrugs());
        //EVENTS
        Bukkit.getPluginManager().registerEvents(new PlayerUseDrugs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
        System.out.println("PlugDrugs Stopped!!!");
    }

    public static FileConfiguration getConfiguration(){
        return configuration;
    }
    public static PlugDrugs getPlugin(){return plugin;}
}
