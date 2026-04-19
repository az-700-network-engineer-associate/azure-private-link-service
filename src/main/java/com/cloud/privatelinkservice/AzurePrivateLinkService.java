package com.cloud.privatelinkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzurePrivateLinkService {

	public static void main(String[] args) {

		SpringApplication
				.run(AzurePrivateLinkService.class, args);
	}

}
