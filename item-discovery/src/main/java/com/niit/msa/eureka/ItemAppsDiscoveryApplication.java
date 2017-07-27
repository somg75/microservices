package com.niit.msa.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ItemAppsDiscoveryApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ItemAppsDiscoveryApplication.class, args);
	}
}
