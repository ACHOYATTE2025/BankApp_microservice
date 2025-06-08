package com.microBank.accounts.dto;

import com.microBank.accounts.entity.Accounts;

import lombok.Data;

@Data
public class CustomerDto {

  private String name;
  private String email;
  private String mobileNumber;
  private Accounts accounts;
    
}