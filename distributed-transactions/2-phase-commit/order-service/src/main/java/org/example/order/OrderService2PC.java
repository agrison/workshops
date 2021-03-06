package org.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class OrderService2PC {
    public static void main(String[] args) {
        SpringApplication.run(OrderService2PC.class, args);
    }
}
