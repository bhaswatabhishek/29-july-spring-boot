package com.te.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EMSApplication {

	public static void main(String[] args) {

		System.out.println("EMSApplication");
		SpringApplication.run(EMSApplication.class, args);
        System.out.println("helllo  world");
        System.out.println("hi");
        System.out.println("hellocls" +
                "");
	}

	@Bean
	 public CommandLineRunner commandLineRunner(){
		return  args ->{
			System.out.println("commandLineRunner() method executed!");

		 };
	 }



	}

