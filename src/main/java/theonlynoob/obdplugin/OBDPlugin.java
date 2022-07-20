package theonlynoob.obdplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class OBDPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("OBD Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("OBD Plugin has stopped!");
    }
}
