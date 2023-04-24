package me.skyscx.sunland.plugdrugs.Commands;

import me.skyscx.sunland.plugdrugs.Assets.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.skyscx.sunland.plugdrugs.Assets.Messages.*;
import static me.skyscx.sunland.plugdrugs.System.System.SC;


public class ChangerPermissionToUseDrugs implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String MessageInfoUseCommandLog;
        String NameUser;
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            NameUser = player.getName();
            if (player.isOp() || player.hasPermission("plugdrugs.admin")){

            }
            else{

            }
        }else{
            NameUser = "CONSOLE";
        }


        return false;
    }
}
