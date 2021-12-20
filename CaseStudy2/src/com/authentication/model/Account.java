package com.authentication.model;

import com.authentication.model.roles.Role;
import com.authentication.service.IAbstractAccount;

import java.io.Serializable;

public class Account implements IAbstractAccount, Serializable {
    private int id;
    private String username;
    private String password;
    private Role role;
    private String fullName;

    public Account(int id, String username, String password, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public Account(int id, String username, String password, Role role, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id= id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username= username;
    }

    @Override
    public String getPassword() {
        return this.password= password;
    }

    @Override
    public void setPassword(String password) {
        this.password= password;
    }

    @Override
    public Role getRole() {
        return this.role= role;
    }

    @Override
    public void setRole(Role role) {
        this.role= role;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName= fullName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
