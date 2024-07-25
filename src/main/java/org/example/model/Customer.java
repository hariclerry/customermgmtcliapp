package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private Integer   customerId;
    private String    customerName;
    private LocalDate customerBirthDate;
}
