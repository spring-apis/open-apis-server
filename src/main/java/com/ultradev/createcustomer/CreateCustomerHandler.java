package com.ultradev.createcustomer;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ultradev.model.CreateCustomerResponse;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CreateCustomerHandler {
	@Autowired
	CreateCustomerRepository createCustomerRepository;

	public CreateCustomerResponse requestHandler(CreateCustomerRequest createCustomerRequest) {
		CreateCustomerEntity createCustomerEntity = new CreateCustomerEntity();
		
		BeanUtils.copyProperties(createCustomerRequest.getCustomer(), createCustomerEntity);
		createCustomerRepository.save(createCustomerEntity);
		
		CreateCustomerResponse createCustomerResponse=new CreateCustomerResponse();
		BeanUtils.copyProperties(createCustomerEntity, createCustomerResponse);
		log.info("Successfully saved customer with id :{} ",createCustomerResponse.getId());
		return createCustomerResponse;

	}

}
