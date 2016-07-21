package org.asamk.signal;

import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

class SinesyTrustStore implements TrustStore {

    @Override
    public InputStream getKeyStoreInputStream() {
        return SinesyTrustStore.class.getResourceAsStream("sinesy.store");
    }

    @Override
    public String getKeyStorePassword() {
        return "whisper";
    }
}
