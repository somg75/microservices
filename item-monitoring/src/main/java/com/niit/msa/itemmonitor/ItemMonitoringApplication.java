package com.niit.msa.itemmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrixDashboard
public class ItemMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemMonitoringApplication.class, args);
	}
}
