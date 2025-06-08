package com.microBank.accounts.mapper;

import com.microBank.accounts.dto.AccountsDto;
import com.microBank.accounts.entity.Accounts;

public class AccountMapper {

  public static AccountsDto mapToAccountsDto(Accounts accounts,AccountsDto accountsDto){
    accountsDto.setAccountNumber(accounts.getAccountNumber());
    accountsDto.setAccounType(accountsDto.getAccounType());
    accountsDto.setBranchAdress(accountsDto.getBranchAdress());
    return accountsDto;    
  }


  public static Accounts mapToAccount(AccountsDto accountsDto,Accounts accounts){
    accounts.setAccountNumber(accountsDto.getAccountNumber());
    accounts.setAccounType(accountsDto.getAccounType());
    accounts.setBranchAdress(accountsDto.getBranchAdress());
    return accounts;
    
  }


    
}