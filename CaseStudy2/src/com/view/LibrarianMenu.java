package com.view;

import com.repository.LoadingFile;

import java.util.Scanner;

public class LibrarianMenu {
    public static void openMenu(){
        System.out.println("Welcome to librarian menu");

        while (true){
            System.out.println("1. View account logging");
            System.out.println("2. View book list");
            System.out.println("3. View student list");
            System.out.println("4. View librarian list");
            System.out.println("5. View book loan card list");
            System.out.println("6. Create account");
            System.out.println("7. Update account");
            System.out.println("8. View account list");
            System.out.println("9. Delete account");
            System.out.println("10. Create book");
            System.out.println("11. Update book");
            System.out.println("12. Delete book");
            System.out.println("13. Create student");
            System.out.println("14. Update student");
            System.out.println("15. Delete student");
            System.out.println("16. Create librarian");
            System.out.println("17.Update librarian");
            System.out.println("18. Delete librarian");
            System.out.println("0. Exit");
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter your choice:");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    MainFunctions.viewLoggingAccount();
                    break;
                case 2:
                    MainFunctions.viewBookList();
                    break;
                case 3:
                    MainFunctions.viewStudentList();
                    break;
                case 4:
                    MainFunctions.viewLibrarianList();
                    break;
                case 5:
                    MainFunctions.viewBookLoanCardList();
                    break;
                case 6:
                    MainFunctions.createAccount();
                    break;
                case 7:
                    MainFunctions.updateAccount();
                    break;
                case 8:
                    MainFunctions.viewAccountList();
                    break;
                case 9:
                    MainFunctions.deleteAccount();
                    break;
                case 10:
                    MainFunctions.createBook();
                    break;
                case 11:
                    MainFunctions.updateBook();
                    break;
                case 12:
                    MainFunctions.deleteBook();
                    break;
                case 13:
                    MainFunctions.createStudent();
                    break;
                case 14:
                    MainFunctions.updateStudent();
                    break;
                case 15:
                    MainFunctions.deleteStudent();
                    break;
                case 16:
                    MainFunctions.createLibrarian();
                    break;
                case 17:
                    MainFunctions.updateLibrarian();
                    break;
                case 18:
                    MainFunctions.deleteLibrarian();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
