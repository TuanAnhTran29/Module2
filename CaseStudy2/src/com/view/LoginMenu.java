package com.view;

import com.authentication.controller.AccountController;
import com.authentication.model.Account;
import com.authentication.model.roles.Role;
import com.repository.LoadingFile;

import java.util.Scanner;

public class LoginMenu {
    public static void openMenu(){
        while (true){
            System.out.print("Username: ");
            Scanner scanner1= new Scanner(System.in);
            String username= scanner1.nextLine();
            System.out.print("Password: ");
            Scanner scanner2= new Scanner(System.in);
            String password= scanner2.nextLine();

            Account account= LoadingFile.accountController.findByUsername(username);
            if (account != null){
                if (account.getPassword().equals(password)){
                    if (account.getRole().equals(Role.STUDENT)){
                        LoadingFile.loggingAccount= account;
                        StudentMenu.openMenu();
                    }else {
                        LoadingFile.loggingAccount= account;
                        LibrarianMenu.openMenu();
                    }
                }
            }
        }


    }
}
