package com.fox2code.hypertale_example;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.jspecify.annotations.NonNull;

public class HypertaleExample extends JavaPlugin {
	public HypertaleExample(@NonNull JavaPluginInit init) {
		super(init);
		this.hypertale().setLoggerName("HypertaleExampleMod");
		this.getLogger().atInfo().log("Hello from Hypertale example mod!");
	}
}
