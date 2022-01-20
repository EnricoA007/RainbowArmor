package rainbowarmor.util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import rainbowarmor.items.RainbowItems;
import rainbowarmor.main.RainbowArmor;

public class RainbowUtil {

    public static int size = 0;

    public static Color[] colors={
        Color.fromRGB(255, 0, 0),
        Color.fromRGB(255, 128, 0),
        Color.fromRGB(255,255,0),
        Color.fromRGB(0,255,0),
        Color.fromRGB(0, 0, 255),
        Color.fromRGB(255,0,255),
        Color.fromRGB(255,0,128)
    };

    public static void startScheduler(RainbowArmor plugin) {

        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

            @Override
            public void run() {

                for (Player p : Bukkit.getOnlinePlayers()) {
                    EntityEquipment e = p.getEquipment();

                    ItemStack helm = e.getHelmet();
                    ItemStack chest = e.getChestplate();
                    ItemStack legs = e.getLeggings();
                    ItemStack boot = e.getBoots();

                    Color c = generateColor();

                    try{
                        if (helm.getItemMeta().getDisplayName().equals(RainbowItems.HELMET_NAME)) {
                            LeatherArmorMeta meta = (LeatherArmorMeta) helm.getItemMeta();
                            meta.setColor(c);
                            helm.setItemMeta(meta);
                            e.setHelmet(helm);
                        }
                    }catch(Exception ef){}

                    try{
                        if (chest.getItemMeta().getDisplayName().equals(RainbowItems.CHEST_NAME)) {
                            LeatherArmorMeta meta = (LeatherArmorMeta) chest.getItemMeta();
                            meta.setColor(c);
                            chest.setItemMeta(meta);
                            e.setChestplate(chest);
                        }
                    }catch(Exception ef){}

                    try{
                        if (legs.getItemMeta().getDisplayName().equals(RainbowItems.LEGS_NAME)) {
                            LeatherArmorMeta meta = (LeatherArmorMeta) legs.getItemMeta();
                            meta.setColor(c);
                            legs.setItemMeta(meta);
                            e.setLeggings(legs);
                        }
                    }catch(Exception ef){}

                    try{
                        if (boot.getItemMeta().getDisplayName().equals(RainbowItems.BOOTS_NAME)) {
                            LeatherArmorMeta meta = (LeatherArmorMeta) boot.getItemMeta();
                            meta.setColor(c);
                            boot.setItemMeta(meta);
                            e.setBoots(boot);
                        }
                    }catch(Exception ef){}


                }
            }
        }, 2L, 2L);
    }

    public static Color generateColor(){
        Color c = colors[size];
        size++;

        if(size==colors.length)size=0;

        return c;
    }

}
