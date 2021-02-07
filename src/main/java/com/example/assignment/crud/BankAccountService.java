package com.example.assignment.crud;

import javax.persistence.*;


public class BankAccountService {
    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

}
