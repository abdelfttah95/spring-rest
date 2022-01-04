package com.blabla.springrest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author abdel
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.blabla.springrest")
public class AppConfig {
    
}
