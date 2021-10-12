package com.ultradev.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ultradev.api.CustomersApiDelegate;
import com.ultradev.createcustomer.CreateCustomerHandler;
import com.ultradev.createcustomer.CreateCustomerRequest;
import com.ultradev.model.CreateCustomerResponse;
import com.ultradev.model.Customer;

@Component
public class CustomersApiDelegateImpl implements CustomersApiDelegate{

	/**
	 * POST /customers : Add a new customer
	 *
	 * @param customer Customer Info Object (required)
	 * @return created (status code 201) or Invalid input (status code 405)
	 * @see CustomerrsApi#createCustomer
	 */
	@Autowired
	CreateCustomerHandler createCustomerHandler;

	@Override
	public ResponseEntity<CreateCustomerResponse> createCustomer(Customer customer) {
		;
		return new ResponseEntity<>(createCustomerHandler.requestHandler(new CreateCustomerRequest(customer)),HttpStatus.CREATED);
	}

}
