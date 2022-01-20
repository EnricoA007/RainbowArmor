package rainbowarmor.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import rainbowarmor.items.RainbowItems;
import rainbowarmor.util.RainbowUtil;

public class RainbowArmor extends JavaPlugin {

    @Override
    public void onEnable() {

        ShapelessRecipe helmet = new ShapelessRecipe(RainbowItems.HELMET);
        addColorPalette(helmet);
        helmet.addIngredient(Material.LEATHER_HELMET);
        Bukkit.addRecipe(helmet);

        ShapelessRecipe chest = new ShapelessRecipe(RainbowItems.CHESTPLATE);
        addColorPalette(chest);
        chest.addIngredient(Material.LEATHER_CHESTPLATE);
        Bukkit.addRecipe(chest);

        ShapelessRecipe legs = new ShapelessRecipe(RainbowItems.LEGGINGS);
        addColorPalette(legs);
        legs.addIngredient(Material.LEATHER_LEGGINGS);
        Bukkit.addRecipe(legs);

        ShapelessRecipe boots = new ShapelessRecipe(RainbowItems.BOOTS);
        addColorPalette(boots);
        boots.addIngredient(Material.LEATHER_BOOTS);
        Bukkit.addRecipe(boots);

        RainbowUtil.startScheduler(this);

    }

    private void addColorPalette(ShapelessRecipe r){
        r.addIngredient(Material.RED_DYE);
        r.addIngredient(Material.YELLOW_DYE);
        r.addIngredient(Material.ORANGE_DYE);
        r.addIngredient(Material.LIME_DYE);
        r.addIngredient(Material.LIGHT_BLUE_DYE);
        r.addIngredient(Material.MAGENTA_DYE);
        r.addIngredient(Material.PURPLE_DYE);
        r.addIngredient(Material.DIAMOND);
    }

}
