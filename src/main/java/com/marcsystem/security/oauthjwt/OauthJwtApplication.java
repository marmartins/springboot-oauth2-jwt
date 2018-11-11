package com.marcsystem.security.oauthjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OauthJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthJwtApplication.class, args);
	}
}
