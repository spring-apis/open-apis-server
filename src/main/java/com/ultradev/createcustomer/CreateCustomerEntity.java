package com.ultradev.createcustomer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table(name = "customer")
@Data
public class CreateCustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	private Long customerId;
	private String name;

	private String location;

	private String email;

	private String address;

	private Boolean status = false;

}
