package us.potatoboy.hatlist.client;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import java.util.UUID;

@Environment(EnvType.CLIENT)
public class HatListClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }
}
