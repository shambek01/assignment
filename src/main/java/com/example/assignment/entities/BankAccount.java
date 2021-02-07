package com.example.assignment.entities;

import javax.persistence.*;

@Entity
public class BankAccount {
    @Id
    private int cardNumber;
    private float USD;
    private float EUR;
    private float KZT;

    @ManyToOne
    @JoinColumn
    private User getUser(){

    }
    private User user;

}
