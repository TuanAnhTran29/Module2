package com.authentication.service;

import com.authentication.model.Account;
import com.authentication.model.roles.Role;
import com.repository.account.FileManageAccount;

import java.io.IOException;
import java.util.List;

public class AccountService implements IAccountService {
    List<Account> accountList;
    private FileManageAccount fileManageAccount;




    public AccountService() {
    }
    @Override
    public List<Account> getAccountList() {
        return accountList;
    }
    @Override
    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
    @Override
    public FileManageAccount getFileManageAccount() {
        return fileManageAccount;
    }

    @Override
    public void setFileManageAccount(FileManageAccount fileManageAccount) {
        this.fileManageAccount = fileManageAccount;
    }



    @Override
    public void save(Account account) {
        accountList.add(account);
        try {
            fileManageAccount.writeFile(accountList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Account account) {
        int index= 0;
        for (Account a: accountList) {
            if (a.getId() == account.getId()){
                accountList.set(index,account);
            }
            index++;
        }
        try {
            fileManageAccount.writeFile(accountList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Account account) {
        accountList.remove(account);
        try {
            fileManageAccount.writeFile(accountList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Account> findAll() {
        return accountList;
    }

    @Override
    public Account findById(int id) {
        Account account= null;
        for (Account a: accountList) {
            if (a.getId() == id){
                account= a;
            }
        }
        return account;
    }

}
