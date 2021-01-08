package us.potatoboy.tatertweaks.mixin.client;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import us.potatoboy.tatertweaks.Tatertweaks;
import us.potatoboy.tatertweaks.client.PlayerListPlayer;

import java.util.UUID;

@Environment(EnvType.CLIENT)
@Mixin(PlayerListHud.class)
public abstract class PlayerListHudMixin {
    @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/world/ClientWorld;getPlayerByUuid(Ljava/util/UUID;)Lnet/minecraft/entity/player/PlayerEntity;"))
    private PlayerEntity renderPlayerIconInject(ClientWorld clientWorld, UUID uuid) {
        if (Tatertweaks.config.alwaysShowHatOnList) {
            return new PlayerListPlayer(clientWorld, new GameProfile(uuid, "Tater"));
        }

        return clientWorld.getPlayerByUuid(uuid);
    }
}
