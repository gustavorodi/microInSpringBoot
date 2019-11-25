package com.projeto.microservicojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicojavaApplication {
	static DataConfig data = new DataConfig();

	public static void main(String[] args) {

		SpringApplication.run(MicroservicojavaApplication.class, args);
	}

}

