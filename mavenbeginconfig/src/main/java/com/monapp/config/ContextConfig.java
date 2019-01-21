package com.monapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.monapp.dao")
@Import(JpaConfig.class)
public class ContextConfig {

}
