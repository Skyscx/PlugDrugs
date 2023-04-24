package me.skyscx.sunland.plugdrugs.Events;

import me.skyscx.sunland.plugdrugs.Assets.Drugs.Drugs_Items;
import me.skyscx.sunland.plugdrugs.System.System;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static me.skyscx.sunland.plugdrugs.Assets.Messages.*;
import static me.skyscx.sunland.plugdrugs.System.System.SM;

public class PlayerUseDrugs implements Listener {
    @EventHandler
    public void OnUseDrugs(PlayerInteractEvent event){
        System system = new System();
        Boolean status = system.getSTATUS();
        Player player = event.getPlayer();
        if (status){
            if (player.getItemInHand().getType() == Material.WHITE_DYE){
                ItemStack item = player.getItemInHand();
                ItemStack item_check = Drugs_Items.drugs_cocaine;
                if (item == item_check){
                    if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){
                        /*Проверка на определенный тип наркоты.*/
                        SM(player, "ITEM USE");
                    }
                }
            }
        }else{
            SM(player, P_001);
        }
    }
}
