package com.damddos.sentinelweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.damddos")
@SpringBootApplication
public class SentinelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelWebApplication.class, args);
	}

}
