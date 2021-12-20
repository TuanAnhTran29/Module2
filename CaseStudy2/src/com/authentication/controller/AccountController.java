package com.authentication.controller;

import com.authentication.model.Account;
import com.authentication.service.AccountService;
import com.authentication.service.IAccountService;
import com.model.Book;
import com.repository.LoadingFile;

import java.util.List;

public class AccountController {
    IAccountService accountService= new AccountService();

    public AccountController() {
        accountService.setAccountList(LoadingFile.accountList);
        accountService.setFileManageAccount(LoadingFile.fileManageAccount);
    }

    public Account findByUsername(String username){
        Account account= null;
        for (Account a: accountService.findAll()) {
            if (a.getUsername().equals(username)){
                account= a;
                break;
            }
        }
        return account;
    }

    public Account viewAccount(){
        return accountService.findById(LoadingFile.loggingAccount.getId());
    }

    public Account findById(int id){
        Account account= null;
        for (Account a: accountService.findAll()) {
            if (a.getId() == id){
                account= a;
                break;
            }
        }
        return account;
    }
    public List<Account> findAll(){
        return accountService.findAll();
    }

    public void saveAccount(Account account){
        accountService.save(account);
    }

    public void updateAccount(Account account){
        accountService.update(account);
    }

    public void deleteAccount(Account account){
        accountService.delete(account);
    }
}
