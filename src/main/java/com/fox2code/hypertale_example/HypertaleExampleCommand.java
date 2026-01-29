package com.fox2code.hypertale_example;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HypertaleExampleCommand extends AbstractCommand {
	protected HypertaleExampleCommand() {
		super("hypertale_example", "Hypertale Example mod command");
	}

	@Override
	protected @Nullable CompletableFuture<Void> execute(@NonNull CommandContext commandContext) {
		commandContext.sendMessage(Message.raw("Hypertale Example mod"));
		return null;
	}
}
