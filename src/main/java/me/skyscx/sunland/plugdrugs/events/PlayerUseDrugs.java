package me.skyscx.sunland.plugdrugs.events;

import me.skyscx.sunland.plugdrugs.system.System;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import static me.skyscx.sunland.plugdrugs.assets.Messages.*;
import static me.skyscx.sunland.plugdrugs.assets.drugs.Drugs_Items.*;
import static me.skyscx.sunland.plugdrugs.system.System.SM;

public class PlayerUseDrugs implements Listener {
    @EventHandler
    public void OnUseDrugs(PlayerInteractEvent event){
        System system = new System();
        boolean status = system.getSTATUS();
        Player player = event.getPlayer();
            if (player.getItemInHand().getType() == Material.WHITE_DYE){
                if (status){
                    ItemStack item = player.getItemInHand();
                    if (drugs_cocaine == item){
                        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){
                            /*Проверка на определенный тип наркоты.*/
                            SM(player, "ITEM USE");
                        }
                    }
                }else{
                    SM(player, P_001);
                }
        }
    }
}
