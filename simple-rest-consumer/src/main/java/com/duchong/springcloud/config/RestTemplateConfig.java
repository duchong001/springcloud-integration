package com.duchong.springcloud.config;

/**
 * @author DUCHONG
 * @since 2019-03-05 22:33
 **/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRestTempate() {
        return new RestTemplate();
    }
}
