package com.yusys.bank.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yusys.bank")
public class BankAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAuthApplication.class, args);
    }

}
