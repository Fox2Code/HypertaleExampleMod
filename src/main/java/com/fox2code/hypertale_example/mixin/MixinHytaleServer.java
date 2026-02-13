package com.fox2code.hypertale_example.mixin;

import com.hypixel.hytale.server.core.HytaleServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(HytaleServer.class)
public class MixinHytaleServer {
	@ModifyConstant(method = "boot", constant = @Constant(
			stringValue = "%s         Hytale Server Booted! [%s] took %s"))
	public String injectMethod(String constant) {
		return "%s         Example Server Booted! [%s] took %s (Message modified by example mod mixin)";
	}
}
