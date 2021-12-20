package com.view;

import java.util.Scanner;

public class StudentMenu {
    public static void openMenu(){
        System.out.println("Welcome to student menu");


        while (true){
            System.out.println("1. View account");
            System.out.println("2. View book list");
            System.out.println("3. View book loan card");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("0. Exit");
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    MainFunctions.viewLoggingAccount();
                    break;
                case 2:
                    MainFunctions.viewBookList();
                    break;
                case 3:
                    MainFunctions.viewBookLoanCard();
                    break;
                case 4:
                    MainFunctions.borrowBook();
                    break;
                case 5:
                    MainFunctions.returnBook();
                    break;
                case 0:
                    System.exit(0);

            }
        }



    }


}
