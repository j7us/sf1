package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Выносим для переиспользования url обращения к серверу адресов.
 */
@ConfigurationProperties(prefix = "address-client")
@Configuration
public class AddressClientProperties {
    private String url;

    public AddressClientProperties() {
    }

    public AddressClientProperties(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
