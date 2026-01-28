package org.stockify.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Slf4j
@Configuration
public class CorsConfig {
    @Value("${FRONTEND_URL}")
    private String frontendUrl;

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
        config.setAllowCredentials(true);
        // Agregamos ambas URLs por seguridad
        config.setAllowedOrigins(List.of(frontendUrl));
        config.setAllowedHeaders(List.of
            (
                "Authorization", 
                "Content-Type", 
                "Cache-Control", 
                "Last-Event-ID", 
                "X-Requested-With"
            ));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        config.setExposedHeaders(List.of("Authorization"));

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}