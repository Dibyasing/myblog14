package com.myblog.myblog14;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Myblog14Application {

	public static void main(String[] args) {
		SpringApplication.run(Myblog14Application.class, args);
	}
    @Bean
	public ModelMapper getModelmapper(){
		return new ModelMapper();
	}
}
