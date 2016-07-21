package org.asamk.signal;

import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

class TenOneFourTwohundredfiftyfourTrustStore implements TrustStore {

    @Override
    public InputStream getKeyStoreInputStream() {
        return TenOneFourTwohundredfiftyfourTrustStore.class.getResourceAsStream("10.1.4.252.store");
    }

    @Override
    public String getKeyStorePassword() {
        return "whisper";
    }
}
