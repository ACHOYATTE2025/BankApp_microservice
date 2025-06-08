package com.microBank.accounts.mapper;

import com.microBank.accounts.dto.CustomerDto;
import com.microBank.accounts.entity.Customer;

public class CustomerMapper {

   public static CustomerDto mapToCustomerDto(Customer costumer,CustomerDto customerDto){
    customerDto.setName(costumer.getName());
    customerDto.setEmail(costumer.getEmail());
    customerDto.setMobileNumber(costumer.getMobileNumber());
    return customerDto;
   
  }

  public static Customer  mapToCustomer(CustomerDto customerDto,Customer customer){
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;

  }



    
}