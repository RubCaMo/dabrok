package com.example.dabrok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class }) //Exlude para evitar el uso del token de seguridad.
@EnableConfigurationProperties
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.example.dabrok.services", "com.example.dabrok.controller"})
public class DabrokApplication implements WebMvcConfigurer {

	static Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);
	public static void main(String[] args) {
		logger.debug("[MAIN] Running DABROK");
		SpringApplication.run(DabrokApplication.class, args);
	}

}
