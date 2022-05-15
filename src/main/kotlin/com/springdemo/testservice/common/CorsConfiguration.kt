package com.springdemo.testservice.common

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@ConstructorBinding
class CorsConfiguration {

    @Value("\${api.cors.origins}")
    lateinit var allowedOrigins: String

    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry
                    .addMapping("/api/**")
                    .allowedOrigins(*allowedOrigins.split(",").toTypedArray())
                    .allowedMethods("HEAD", "OPTIONS", "POST", "PUT", "GET", "DELETE")
            }
        }
    }
}