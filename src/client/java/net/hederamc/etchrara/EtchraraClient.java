package net.hederamc.etchrara;

import net.fabricmc.api.ClientModInitializer;
import net.hederamc.etchrara.client.config.EtchraraConfig;

public class EtchraraClient implements ClientModInitializer {
    public static final EtchraraConfig CONFIG = EtchraraConfig.HANDLER.instance();
    public static final EtchraraConfig DEFAULTS = EtchraraConfig.HANDLER.defaults();

    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
