package org.example;

import org.example.model.Customer;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var customer = new Customer[]{
                new Customer(1, "Harriet Ayugi", LocalDate.of(1998, 05, 12)),
                new Customer(2, "Clerry Aber", LocalDate.of(1992, 05, 22))
        } ;
        System.out.println(Arrays.toString(customer));
    }
}