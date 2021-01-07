
package com.testproject.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectFirstAppApplication.class, args);
		
		System.out.println("------This is my first Spring boot test-----");
	}

}
