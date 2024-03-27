package com.agenziaviaggi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.agenziaviaggi.uploader.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Prj07AgenziaViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj07AgenziaViaggiApplication.class, args);
	}

}
