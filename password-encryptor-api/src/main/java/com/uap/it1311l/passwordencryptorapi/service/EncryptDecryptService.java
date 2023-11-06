package com.uap.it1311l.passwordencryptorapi.service;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passwordencryptorapi.webclient.EncryptionApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncryptDecryptService {

    private final EncryptionApiClient apiClient;

    @Autowired
    public EncryptDecryptService(EncryptionApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public EncryptionResponse encrypt(String password) {
        return apiClient.encrypt("whateverkeyyouwant", password, "AES");
    }
}
