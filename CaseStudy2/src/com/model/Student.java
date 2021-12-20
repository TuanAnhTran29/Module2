package com.model;

import com.authentication.model.Account;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private String className;
    private Account account;

    public Student() {
    }

    public Student(String name, int id, String className) {
        this.name = name;
        this.id = id;
        this.className = className;
    }

    public Student(String name, int id, String className, Account account) {
        this.name = name;
        this.id = id;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", account=" + account +
                '}';
    }
}
