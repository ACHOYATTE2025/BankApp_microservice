package com.microBank.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "costumer")
public class Customer extends BaseEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long costumerId;
  private String name;
  private String email;
  private String mobileNumber;
  
  
    
}