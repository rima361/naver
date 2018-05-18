package com.audio.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "datasource.master")
public class DatabaseProperty {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String connectionTestQuery;
}
