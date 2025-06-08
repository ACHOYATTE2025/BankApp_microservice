package com.microBank.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microBank.accounts.dto.CustomerDto;
import com.microBank.accounts.dto.ResponseDto;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class AccountsController {
  @PostMapping(path="/createAccount")
  public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){

    return ResponseEntity
          .status(HttpStatus.CREATED)
          .body(new  ResponseDto(201, "Request processed successfully"));

  }
    
}