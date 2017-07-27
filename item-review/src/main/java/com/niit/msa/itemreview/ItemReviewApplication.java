package com.niit.msa.itemreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.niit.msa.itemreview.config.ItemReviewConfig;



@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
@EnableDiscoveryClient
@EnableCircuitBreaker
@Import(value= {ItemReviewConfig.class})
public class ItemReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemReviewApplication.class, args);
	}
}
