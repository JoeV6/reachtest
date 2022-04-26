package com.LPC1.LREACH.Injection.mixins;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(PlayerControllerMP.class)
public class MixinPlayerControllerMP {

    @Inject(method = "getBlockReachDistance", at = @At("org.spongepowered.asm.mixin.injection.points.MethodHead"), cancellable = true)
    private void getReach(final CallbackInfoReturnable<Float> returnable) {
            returnable.setReturnValue((float) 10);
    }
}
