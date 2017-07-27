package com.niit.msa.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.niit.msa.item.config.ItemMasterConfig;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
@EnableDiscoveryClient
@EnableCircuitBreaker
@Import(value= {ItemMasterConfig.class})
public class ItemMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemMasterApplication.class, args);
	}
}
