package com.fox2code.hypertale_example;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.jspecify.annotations.NonNull;

public class HypertaleExample extends JavaPlugin {
	public HypertaleExample(@NonNull JavaPluginInit init) {
		super(init);
		// The "hasHypertale" field is safe to use directly when bundling is enabled
		// It is enabled by default but can be changed with hypertale.useBundling = false
		// This allows "hasHypertale" to always work even when hypertale itself is absent
		if (hasHypertale) {
			this.hypertale().setLoggerName("HypertaleExampleMod");
		}
		this.getLogger().atInfo().log("Hello from Hypertale example mod v" + BuildConfig.MOD_VERSION + "!");
		this.getLogger().atInfo().log("My property is set to " + BuildConfig.MY_PROPERTY + "!");
	}

	@Override
	protected void setup() {
		this.getCommandRegistry().registerCommand(new HypertaleExampleCommand());
	}
}
