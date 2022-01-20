package rainbowarmor.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RainbowItems {

    public static ItemStack HELMET = new ItemStack(Material.LEATHER_HELMET);
    public static ItemStack CHESTPLATE = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static ItemStack LEGGINGS = new ItemStack(Material.LEATHER_LEGGINGS);
    public static ItemStack BOOTS = new ItemStack(Material.LEATHER_BOOTS);

    public static String HELMET_NAME = "§4R§ca§6i§en§2b§ao§1w§8-§9H§5e§dl§4m§ce§6t";
    public static String CHEST_NAME = "§4R§ca§6i§en§2b§ao§1w§8-§9C§5h§de§4s§ct§6p§el§2a§at§1e";
    public static String LEGS_NAME = "§4R§ca§6i§en§2b§ao§1w§8-§9L§5e§dg§4g§ci§6n§eg§2s";
    public static String BOOTS_NAME = "§4R§ca§6i§en§2b§ao§1w§8-§9B§5o§do§4t§cs";

    static{
        ItemMeta helmetMeta = HELMET.getItemMeta();
        helmetMeta.setDisplayName(HELMET_NAME);
        helmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        helmetMeta.setUnbreakable(true);
        HELMET.setItemMeta(helmetMeta);

        ItemMeta chestMeta = CHESTPLATE.getItemMeta();
        chestMeta.setDisplayName(CHEST_NAME);
        chestMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        chestMeta.setUnbreakable(true);
        CHESTPLATE.setItemMeta(chestMeta);

        ItemMeta legsMeta = LEGGINGS.getItemMeta();
        legsMeta.setDisplayName(LEGS_NAME);
        legsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        legsMeta.setUnbreakable(true);
        LEGGINGS.setItemMeta(legsMeta);

        ItemMeta bootsMeta = LEGGINGS.getItemMeta();
        bootsMeta.setDisplayName(BOOTS_NAME);
        bootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        bootsMeta.setUnbreakable(true);
        BOOTS.setItemMeta(bootsMeta);
    }

}
