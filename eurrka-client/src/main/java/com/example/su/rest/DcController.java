package com.example.su.rest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public  String dc(){
          String service = "service:"+discoveryClient.getServices();
            log.info(service);
          return  service;
    }

}
