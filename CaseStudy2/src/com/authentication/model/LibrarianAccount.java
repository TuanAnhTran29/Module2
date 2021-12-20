package com.authentication.model;

import com.authentication.model.roles.Role;

public class LibrarianAccount extends Account {
    public LibrarianAccount(int id, String username, String password, Role role, String fullName) {
        super(id, username, password, role, fullName);
    }
}
