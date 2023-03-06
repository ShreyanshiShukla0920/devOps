package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsApplication {

	public static void main(String[] args) {
		System.out.println("This is DevOps");
		SpringApplication.run(DevOpsApplication.class, args);
		
	}

}
