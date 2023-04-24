package me.skyscx.sunland.plugdrugs.Assets.Drugs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static me.skyscx.sunland.plugdrugs.Assets.Messages.*;

public class Drugs_Items {
    public static ItemStack drugs_cocaine;
    private static void  cocaine_item() {
        ItemStack drug_1 = new ItemStack(Material.WHITE_DYE, 1);
        ItemMeta meta_drug_1 = drug_1.getItemMeta();
        meta_drug_1.setDisplayName(D_001);
        List<String> lore_drugs_1 = new ArrayList<>();
        lore_drugs_1.add(L_1_1);
        lore_drugs_1.add(L_1_2);
        meta_drug_1.setLore(lore_drugs_1);
        meta_drug_1.addEnchant(Enchantment.LUCK, 1, false);
        meta_drug_1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        drug_1.setItemMeta(meta_drug_1);
        drugs_cocaine = drug_1;
    }
}
