package com.uap.it1311l.passwordencryptorapi.controller;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passwordencryptorapi.models.UapEncryptionRequest;
import com.uap.it1311l.passwordencryptorapi.service.EncryptDecryptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptorController {

    private final EncryptDecryptService encryptDecryptService;

    @Autowired
    public EncryptorController(EncryptDecryptService encryptDecryptService) {
        this.encryptDecryptService = encryptDecryptService;
    }

    @GetMapping("/api/encryption")
    public EncryptionResponse encryptString(@RequestBody UapEncryptionRequest request) {
        return encryptDecryptService.encrypt(request.getPassword());
    }
}
