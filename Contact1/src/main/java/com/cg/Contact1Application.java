package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Contact1Application {

	public static void main(String[] args) {
		SpringApplication.run(Contact1Application.class, args);
	}

}
