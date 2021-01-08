package us.potatoboy.tatertweaks;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "tatertweaks")
public class TaterTweaksConfig implements ConfigData {
    @ConfigEntry.Category(value = "client")
    public boolean alwaysShowHatOnList = true;
}
