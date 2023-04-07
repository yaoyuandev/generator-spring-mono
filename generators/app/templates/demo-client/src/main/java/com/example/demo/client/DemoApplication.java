package com.example.demo.client;

import com.example.demo.api.DemoApi;
import com.example.demo.api.DemoApiConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
@Import(DemoApiConfiguration.class)
public class DemoApplication implements CommandLineRunner {

    final DemoApi demoApi;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{}", demoApi.a());
    }
}
