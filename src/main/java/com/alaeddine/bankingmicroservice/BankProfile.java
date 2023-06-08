package com.alaeddine.bankingmicroservice;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
class BankProfile {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String accountNumber;
}
