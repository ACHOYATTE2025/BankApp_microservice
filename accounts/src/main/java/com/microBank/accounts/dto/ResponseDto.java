package com.microBank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor

public class ResponseDto {


  private int statusCode;

  private String statusMsg;


    
}