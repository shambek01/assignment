package com.example.assignment.entities;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String username;
    @Column
    private String password;

    @OneToMany
    private Collection<BankAccount> bankAccount;
    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }



}
