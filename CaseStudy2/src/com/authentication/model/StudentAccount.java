package com.authentication.model;

import com.authentication.model.roles.Role;

public class StudentAccount extends Account {

    public StudentAccount(int id, String username, String password, Role role, String fullName) {
        super(id, username, password, role, fullName);
    }
}
