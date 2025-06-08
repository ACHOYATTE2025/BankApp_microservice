package com.microBank.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microBank.accounts.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    
}