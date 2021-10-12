package com.ultradev.createcustomer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  
  @Repository
public interface CreateCustomerRepository extends CrudRepository<CreateCustomerEntity, Integer>  
{  
}  