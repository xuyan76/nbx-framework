package com.sysftech.nbx.business.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NbxOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NbxOrderApplication.class, args);
    }
}
