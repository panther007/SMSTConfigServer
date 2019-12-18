package com.panther.smstconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmstConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmstConfigServerApplication.class, args);
	}

}
