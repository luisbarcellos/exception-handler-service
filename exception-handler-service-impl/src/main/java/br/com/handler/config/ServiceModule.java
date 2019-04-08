package br.com.handler.config;

import br.com.handler.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {
    @Bean
    public Service service() {
        return new Service();
    }
}