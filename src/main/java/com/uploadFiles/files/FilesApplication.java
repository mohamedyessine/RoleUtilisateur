package com.uploadFiles.files;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication(exclude = {SecurityFilterAutoConfiguration.class})
public class FilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesApplication.class, args);
	}

}
