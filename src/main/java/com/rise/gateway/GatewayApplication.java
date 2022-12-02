package com.rise.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 张牧之
 * @date 2022年12月02日 11:17 PM
 * @Email zhanglichang99@gmail.com
 */

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
        System.out.println("GatewayApplication start success.");
    }
}
