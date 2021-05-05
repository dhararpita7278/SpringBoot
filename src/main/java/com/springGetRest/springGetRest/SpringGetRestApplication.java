package com.springGetRest.springGetRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.springGetRest.springGetRest.Controller", "com.springGetRest.springGetRest.Service" })
@EnableJpaRepositories("com.springGetRest.springGetRest.Repository")
@EntityScan("com.springGetRest.springGetRest.entity")
public class SpringGetRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGetRestApplication.class, args);

	}

}
