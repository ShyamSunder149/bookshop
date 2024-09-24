package com.example.bookShop.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Payment {

    @Id
    private int paymentId;

    private double amount;

    private Date date;

    private Order order;
}
