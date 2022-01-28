package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan()
@ComponentScan({ "com.tutorial.webservice.rest","com.springdemo"  })
@EnableJpaRepositories("com.springdemo")
@EntityScan({"com.springdemo"})
@EnableTransactionManagement

public class UniwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniwsApplication.class, args);
	}

}
