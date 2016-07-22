package org.asamk.signal;

import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

class ExampleTrustStore implements TrustStore {

    @Override
    public InputStream getKeyStoreInputStream() {
    	return ExampleTrustStore.class.getResourceAsStream("/whisper.store");
    }

    @Override
    public String getKeyStorePassword() {
        return "whisper";
    }
}
