package me.skyscx.sunland.plugdrugs.commands;

import me.skyscx.sunland.plugdrugs.PlugDrugs;
import me.skyscx.sunland.plugdrugs.system.System;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.skyscx.sunland.plugdrugs.assets.Messages.*;
import static me.skyscx.sunland.plugdrugs.system.System.*;


public class ChangerPermissionToUseDrugs implements CommandExecutor {
    System system = new System();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        boolean status = system.getSTATUS();
        String NameUser;
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            NameUser = player.getName();
            if (player.isOp() || player.hasPermission("plugdrugs.admin")){
                if (status == Boolean.TRUE){PlugDrugs.getPlugin().getConfig().set("STATUS_ALL_USE_DRUGS", false);}
                if(status == Boolean.FALSE){PlugDrugs.getPlugin().getConfig().set("STATUS_ALL_USE_DRUGS", true);}
                SM(player,P_002);
                SC(C_001 + " (" + NameUser + ")");
            }
            else{SM(player,P_003);}
        }else{
            NameUser = "CONSOLE";
            if (status == Boolean.TRUE){PlugDrugs.getPlugin().getConfig().set("STATUS_ALL_USE_DRUGS", false);}
            if(status == Boolean.FALSE){PlugDrugs.getPlugin().getConfig().set("STATUS_ALL_USE_DRUGS", true);}
            SC(C_001 + " (" + NameUser + ")");
        }
        PlugDrugs.getPlugin().saveConfig();
        PlugDrugs.getConfiguration();
        return true;
    }
}
