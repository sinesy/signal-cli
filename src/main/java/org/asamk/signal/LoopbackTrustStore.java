package org.asamk.signal;

import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

class LoopbackTrustStore implements TrustStore {

    @Override
    public InputStream getKeyStoreInputStream() {
        return LoopbackTrustStore.class.getResourceAsStream("loopback.store");
    }

    @Override
    public String getKeyStorePassword() {
        return "whisper";
    }
}
