package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-server", url = "http://localhost:8080")
public interface DemoApi {

    @GetMapping("/a")
    A a();
}
