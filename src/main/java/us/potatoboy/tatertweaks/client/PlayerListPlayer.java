package us.potatoboy.tatertweaks.client;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerModelPart;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Environment(EnvType.CLIENT)
public class PlayerListPlayer extends OtherClientPlayerEntity {
    public PlayerListPlayer(ClientWorld world, GameProfile profile) {
        super(world, profile);
    }

    @Override
    public boolean isPartVisible(PlayerModelPart modelPart) {
        return true;
    }
}
