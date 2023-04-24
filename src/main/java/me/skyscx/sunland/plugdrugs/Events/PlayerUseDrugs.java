package me.skyscx.sunland.plugdrugs.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerUseDrugs implements Listener {
    @EventHandler
    public void OnUseDrugs(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if (player.getItemInUse().equals(Material.DIAMOND)){
            player.sendMessage("Diamond use.");
        }else{
            player.sendMessage("Not Diamond use");
        }
    }
}
