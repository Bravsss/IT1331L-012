package com.uap.it1311l.passwordencryptorapi.webclient;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.bind.annotation.RequestParam;

public interface EncryptionApiClient {

    @GetExchange("/encryptstring?secretKey={secretKey}&plainText={plainText}&cryptAlgorithm={cryptAlgorithm}")
    EncryptionResponse encrypt(
            @RequestParam("secretKey") String secretKey,
            @RequestParam("plainText") String plainText,
            @RequestParam("cryptAlgorithm") String cryptAlgorithm
    );
}
