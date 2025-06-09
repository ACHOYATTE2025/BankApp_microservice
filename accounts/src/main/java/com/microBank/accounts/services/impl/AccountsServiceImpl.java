package com.microBank.accounts.services.impl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.microBank.accounts.dto.CustomerDto;
import com.microBank.accounts.entity.Accounts;
import com.microBank.accounts.entity.Customer;
import com.microBank.accounts.exception.CustomerAlreadyExistsException;
import com.microBank.accounts.mapper.CustomerMapper;
import com.microBank.accounts.repository.AccountsRepository;
import com.microBank.accounts.repository.CostumerRepository;
import com.microBank.accounts.services.IAccountService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountService {
  private AccountsRepository accountsRepository;
  private CostumerRepository costumerRepository;




  //account creation details
  @Override
  public void createAccount(CustomerDto customerDto) {
    Customer costumer = CustomerMapper.mapToCustomer(customerDto ,new Customer()) ;

    Optional<Customer > optionalCustomer= costumerRepository.findByEmail(costumer.getEmail());
    if(optionalCustomer.isPresent()){
      throw new CustomerAlreadyExistsException("Customer exist already with given email  "+customerDto.getEmail());
    }
    costumer.setCreatedAt(LocalDateTime.now());
    costumer.setCreatedBy(costumer.getName());
    
    Customer savedCustomer= costumerRepository.save(costumer);
    accountsRepository.save(createNewAccount(savedCustomer));
    
  }

  //return the new account details
  private Accounts createNewAccount(Customer customer){
    Accounts newAccount = new Accounts();
    newAccount.setCostumerId(customer.getCostumerId());
    long randomAccNumber = 1000000000L + new Random().nextInt(900000000);
    newAccount.setAccountNumber(randomAccNumber);
    newAccount.setAccounType("SAVINGS");
    newAccount.setBranchAdress("BOUAFLE");
    newAccount.setCreatedAt(LocalDateTime.now());
    newAccount.setCreatedBy(customer.getName());
    return newAccount;
    
  }
    
}