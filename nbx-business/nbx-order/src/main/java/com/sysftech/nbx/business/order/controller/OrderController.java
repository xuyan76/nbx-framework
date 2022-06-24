package com.sysftech.nbx.business.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/order")
    public String getDiscoveryClient() {
        List<ServiceInstance> list = discoveryClient.getInstances("consumer");
        if(list != null && list.size() > 0 ) {
            ServiceInstance serviceInstance = list.get(0);
            System.out.println(serviceInstance);
        }
        return "Hello World：";
    }
}
