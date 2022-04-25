package com.ls.oPCloudGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OpCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpCloudGatewayApplication.class, args);
	}

}
