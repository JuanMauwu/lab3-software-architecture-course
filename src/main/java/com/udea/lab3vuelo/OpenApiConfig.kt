package com.udea.lab3vuelo;

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class OpenApiConfig {
    @Bean
    open fun openAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info()
                    .title("API de gestión de vuelos")
                    .version("1.0")
                    .description("Documentación de la API de vuelos")

            )
    }
}