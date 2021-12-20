package com.authentication.service;

import com.authentication.model.Account;
import com.repository.account.FileManageAccount;

import java.util.List;

public interface IAccountService {
    void save(Account account);
    void update(Account account);
    void delete(Account account);
    List<Account> findAll();
    Account findById(int id);
    public void setAccountList(List<Account> accountList);
    public List<Account> getAccountList();
    public FileManageAccount getFileManageAccount();
    public void setFileManageAccount(FileManageAccount fileManageAccount);
}
