package com.rise.gateway.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 张牧之
 * @date 2022-12-03 19:28:28
 * @Email zhanglichang99@gmail.com
 */

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
        System.out.println("=================================GatewayApplication start success.=================================");
    }
}
