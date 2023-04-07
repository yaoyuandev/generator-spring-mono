package com.example.demo.api;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.demo.api")
@ComponentScan(basePackages = "com.example.demo.api")
public class DemoApiConfiguration {
}
