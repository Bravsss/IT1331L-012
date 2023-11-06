package com.uap.it1311l.passwordencryptorapi.models;

public class UapEncryptionRequest {
    private String password;

    public UapEncryptionRequest() {
    }

    public UapEncryptionRequest(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
