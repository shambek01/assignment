package com.example.assignment.crud;

import javax.persistence.*;

public class UserService {
    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

}
