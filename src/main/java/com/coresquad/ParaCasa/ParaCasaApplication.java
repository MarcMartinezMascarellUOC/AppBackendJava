package com.coresquad.ParaCasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParaCasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParaCasaApplication.class, args);
		HelloWorldController test = new HelloWorldController();

		System.out.print(test.welcome());
	}

}
