package com.model;

import com.authentication.model.Account;

import java.io.Serializable;

public class Librarian implements Serializable {
    private int id;
    private String name;
    private Account account;


    public Librarian(){}

    public Librarian(int id,String name,Account account) {
        this.id= id;
        this.name = name;
        this.account= account;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
