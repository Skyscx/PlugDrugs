package me.skyscx.sunland.plugdrugs.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static me.skyscx.sunland.plugdrugs.Assets.Messages.*;

public class CreateDrugs {
    public static ItemStack drugs_cocaine;
    public static void init(){create_drugs_cocaine();}
    private static void  create_drugs_cocaine(){
        ItemStack drug_1 = new ItemStack(Material.BONE_MEAL, 1);
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

        ShapedRecipe drug1_recipe = new ShapedRecipe(NamespacedKey.minecraft("drugs_cocaine"), drug_1);
        drug1_recipe.shape("ABA","ACA","DED");
        drug1_recipe.setIngredient('A', Material.SUGAR);
        drug1_recipe.setIngredient('B', Material.DEAD_BUSH);
        drug1_recipe.setIngredient('C', Material.DIAMOND_BLOCK);
        drug1_recipe.setIngredient('D', Material.BLAZE_POWDER);
        drug1_recipe.setIngredient('E', Material.SUGAR_CANE);
        Bukkit.getServer().addRecipe(drug1_recipe);
    }
}
