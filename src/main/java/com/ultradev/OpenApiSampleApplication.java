package com.ultradev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.ultradev.createcustomer.CreateCustomerHandler;
import com.ultradev.createcustomer.CreateCustomerRequest;
import com.ultradev.model.Customer;

@SpringBootApplication
public class OpenApiSampleApplication implements CommandLineRunner{

	//@Autowired
	//CreateCustomerHandler createCustomerHandler;
	public static void main(String[] args) {
		SpringApplication.run(OpenApiSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * CreateCustomerRequest createCustomerRequest= new CreateCustomerRequest(new
		 * Gson().fromJson("{\n" + "  \"customerId\": 1,\n" +
		 * "  \"name\": \"string\",\n" + "  \"location\": \"string\",\n" +
		 * "  \"email\": \"user@example.com\",\n" + "  \"address\": \"string\",\n" +
		 * "  \"status\": false\n" + "}", Customer.class));
		 * 
		 * createCustomerHandler.requestHandler(createCustomerRequest);
		 */
	}

}
