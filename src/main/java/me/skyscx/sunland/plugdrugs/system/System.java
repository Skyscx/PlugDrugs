package me.skyscx.sunland.plugdrugs.system;

import me.skyscx.sunland.plugdrugs.PlugDrugs;
import org.bukkit.entity.Player;

public class System {
    public static void SM(Player player, String message){player.sendMessage(message);}
    public static void SC(String message){java.lang.System.out.println(message);}
    public boolean STATUS = PlugDrugs.getPlugin().getConfig().getBoolean("STATUS_ALL_USE_DRUGS");
    public boolean getSTATUS(){return STATUS;}

}
