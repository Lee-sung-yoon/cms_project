package com.example.cms.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignConfig {
    @Qualifier(value = "mailgun")
    @Bean
    public BasicAuthenticationInterceptor basicAuthenticationInterceptor() {
            return new BasicAuthenticationInterceptor("api", "c716cf2507ea3815a0f214931b3d0541-ca9eeb88-d64fd425");
    }

}
