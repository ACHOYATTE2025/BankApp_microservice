package com.microBank.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microBank.accounts.entity.Customer;


@Repository
public interface CostumerRepository extends JpaRepository<Customer,Long>{


  Optional<Customer>  findByEmail(String mobileNumber);
    
}