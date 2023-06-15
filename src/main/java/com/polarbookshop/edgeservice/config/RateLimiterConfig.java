package com.polarbookshop.edgeservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class RateLimiterConfig {

    @Bean
    public KeyResolver keyResolver() {
        return exchange -> Mono.just("anonymous");
    }
}
