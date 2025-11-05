package org.example;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class AddressClient {
    private final RestClient restClient;
    private final AddressClientProperties properties;

    public AddressClient(RestClient restClient, AddressClientProperties properties) {
        this.restClient = restClient;
        this.properties = properties;
    }

    public String getAddressInfo(String address) {
        return restClient.get()
                .uri(URI.create(properties.getUrl()))
                .retrieve()
                .body(String.class);
    }
}
