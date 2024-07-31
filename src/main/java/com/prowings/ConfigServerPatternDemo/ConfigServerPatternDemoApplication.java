package com.prowings.ConfigServerPatternDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerPatternDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPatternDemoApplication.class, args);
	}

}
