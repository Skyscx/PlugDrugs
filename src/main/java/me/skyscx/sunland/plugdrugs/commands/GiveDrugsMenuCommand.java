package me.skyscx.sunland.plugdrugs.commands;

import me.skyscx.sunland.plugdrugs.Inventory.GiveDrugsMenu;
import me.skyscx.sunland.plugdrugs.system.System;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.skyscx.sunland.plugdrugs.assets.Messages.*;
import static me.skyscx.sunland.plugdrugs.system.System.*;

public class GiveDrugsMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        System system = new System();
        Boolean STATUS = system.getSTATUS();
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            if (STATUS){
                if (player.isOp() || player.hasPermission("plugdrugs.admin")){
                    java.lang.System.out.println("COMMAND GIVEMENUDRUGS TRUE");
                    GiveDrugsMenu.GDM(player);
                    return true;
                }
            }else {
                SM(player,P_001);
                return true;
            }
        }else{
            SC(C_002);
            return true;
        }
        return false;
    }
}
