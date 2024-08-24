package com.makersharks.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class AdityaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdityaApplication.class, args);
		try {
			Connection obj= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","aditya");
			System.out.println(obj);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
