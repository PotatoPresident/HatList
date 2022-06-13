package us.potatoboy.hatlist.client;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerModelPart;
import net.minecraft.client.world.ClientWorld;

@Environment(EnvType.CLIENT)
public class PlayerListPlayer extends OtherClientPlayerEntity {
    public PlayerListPlayer(ClientWorld world, GameProfile profile) {
        super(world, profile, null);
    }

    @Override
    public boolean isPartVisible(PlayerModelPart modelPart) {
        return true;
    }
}
