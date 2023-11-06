package com.uap.it1311l.passwordencryptorapi.config;

import com.uap.it1311l.passwordencryptorapi.webclient.EncryptionApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class EncryptionApiConfig {

    @Bean
    public EncryptionApiClient encryptionApi() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://encryption-apil.p.rapidapi.com/api/Cryptor")
                .defaultHeader("X-RapidAPI-Key", "557f8825d3msh9b087f237ca65b1p174192jsnce6f9780e710")
                .defaultHeader("X-RapidAPI-Host", "encryption-api1.p.rapidapi.com")
                .build();

        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
        		.builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(EncryptionApiClient.class);
    }
}
