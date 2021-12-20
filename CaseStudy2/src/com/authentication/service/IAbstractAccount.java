package com.authentication.service;

import com.authentication.model.roles.Role;

public interface IAbstractAccount {
    public int getId();
    public void setId(int id);
    public String getUsername();
    public void setUsername(String username);
    public String getPassword();
    public void setPassword(String password);
    public Role getRole();
    public void setRole(Role role);
    public String getFullName();
    public void setFullName(String fullName);
}
