package com.authentication.model.factory;

import com.authentication.model.Account;
import com.authentication.model.LibrarianAccount;
import com.authentication.model.StudentAccount;
import com.authentication.model.roles.Role;

public class AccountFactory {
    public static Account getAccount(int id, String username, String password, Role role, String fullName){
        switch (role){
            case STUDENT:
                return new StudentAccount(id,username,password,role,fullName);
            case LIBRARIAN:
                return new LibrarianAccount(id,username,password,role,fullName);
            default:
                throw new IllegalArgumentException("Can not find this role!");
        }
    }
}
