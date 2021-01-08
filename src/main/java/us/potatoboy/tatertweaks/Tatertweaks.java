package us.potatoboy.tatertweaks;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Tatertweaks implements ModInitializer {
    public static TaterTweaksConfig config;

    @Override
    public void onInitialize() {
        AutoConfig.register(TaterTweaksConfig.class, GsonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(TaterTweaksConfig.class).getConfig();
    }
}
