package com.view;

import com.authentication.model.Account;
import com.authentication.model.roles.Role;
import com.model.Book;
import com.model.BookLoanCard;
import com.model.Librarian;
import com.model.Student;
import com.repository.LoadingFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFunctions {
    public static void viewLoggingAccount(){
        System.out.println(LoadingFile.accountController.viewAccount());
    }
    public static void viewBookList(){
        for (int i=0; i< LoadingFile.bookController.findAll().size(); i++) {
            System.out.println(i + ". " + LoadingFile.bookController.findAll().get(i));
        }
    }
    // Librarian Menu
    public static void viewBookLoanCardList(){
        System.out.println(LoadingFile.bookLoanCardController.findAll());
    }
    public static void viewBookLoanCard(){
        System.out.println(LoadingFile.bookLoanCardController.findByStudentId(LoadingFile.loggingAccount.getId()));
    }
    public static void viewStudentList(){
        System.out.println(LoadingFile.studentController.findAll());
    }
    public static void viewLibrarianList(){
        System.out.println(LoadingFile.librarianController.findAll());
    }
    public static void viewAccountList(){
        System.out.println(LoadingFile.accountController.findAll());
    }
    public static void createAccount(){
        MainFunctions.viewAccountList();

        Scanner idScanner= new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id= idScanner.nextInt();

        Account account= LoadingFile.accountController.findById(id);

        while (account != null){
            System.out.print("Your id is existed");
            Scanner newIdScanner= new Scanner(System.in);
            System.out.println("Enter your id: ");
            id = newIdScanner.nextInt();
            account= LoadingFile.accountController.findById(id);
        }


        Scanner usernameScanner= new Scanner(System.in);
        System.out.print("Enter username: ");
        String username= usernameScanner.nextLine();

        Account account1= LoadingFile.accountController.findByUsername(username);

        while (account1 != null){
            System.out.print("Your username is existed");
            Scanner newUsernameScanner= new Scanner(System.in);
            System.out.print("Enter username: ");
            username= newUsernameScanner.nextLine();
            account1= LoadingFile.accountController.findByUsername(username);
        }


        Scanner passwordScanner= new Scanner(System.in);
        System.out.print("Enter password: ");
        String password= passwordScanner.nextLine();



        Scanner fullNameScanner= new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName= fullNameScanner.nextLine();

        Account newAccount= new Account(id,username,password,fullName);

        System.out.println("1. Role: Student ");
        System.out.println("2. Role: Librarian");
        Scanner roleScanner= new Scanner(System.in);
        int choice= roleScanner.nextInt();

        switch (choice){
            case 1:
                newAccount.setRole(Role.STUDENT);
                break;
            case 2:
                newAccount.setRole(Role.LIBRARIAN);
                break;
        }

        LoadingFile.accountController.saveAccount(newAccount);
        System.out.println("Created account successfully! ");

    }

    public static void updateAccount(){
        MainFunctions.viewAccountList();

        try {
            Scanner accountChoice= new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice= accountChoice.nextInt();

            Account account= LoadingFile.accountController.findAll().get(choice);


            Scanner usernameScanner= new Scanner(System.in);
            System.out.print("Enter username: ");
            String username= usernameScanner.nextLine();

            Account account1= LoadingFile.accountController.findByUsername(username);

            while (account1 != null){
                System.out.print("Your username is existed");
                Scanner newUsernameScanner= new Scanner(System.in);
                System.out.print("Enter username: ");
                username= newUsernameScanner.nextLine();
                account1= LoadingFile.accountController.findByUsername(username);
            }


            Scanner passwordScanner= new Scanner(System.in);
            System.out.print("Enter password: ");
            String password= passwordScanner.nextLine();

            System.out.println("1. Role: Student ");
            System.out.println("2. Role: Librarian");
            Scanner roleScanner= new Scanner(System.in);
            int roleChoice= roleScanner.nextInt();

            switch (roleChoice){
                case 1:
                    account.setRole(Role.STUDENT);
                    break;
                case 2:
                    account.setRole(Role.LIBRARIAN);
                    break;
            }


            Scanner fullNameScanner= new Scanner(System.in);
            System.out.print("Enter full name: ");
            String fullName= fullNameScanner.nextLine();

            account.setUsername(username);
            account.setPassword(password);
            account.setFullName(fullName);

            LoadingFile.accountController.updateAccount(account);
            System.out.println("Updated account successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            MainFunctions.updateAccount();
        }


    }

    public static void deleteAccount(){
        MainFunctions.viewAccountList();

        Scanner accountScanner= new Scanner(System.in);
        int choice= accountScanner.nextInt();

        Account account= LoadingFile.accountController.findAll().get(choice);

        LoadingFile.accountController.deleteAccount(account);
        System.out.println("Deleted account successfully!");
    }

    public static void createBook(){
        MainFunctions.viewBookList();

        Scanner idScanner= new Scanner(System.in);
        System.out.println("Enter book id: ");
        int id= idScanner.nextInt();

        Book book= LoadingFile.bookController.findById(id);

        while (book != null){
            System.out.println("Book id is existed");
            Scanner newIdScanner= new Scanner(System.in);
            System.out.println("Enter book id: ");
            id= newIdScanner.nextInt();
            book= LoadingFile.bookController.findById(id);
        }

        Scanner numOfBookSc= new Scanner(System.in);
        System.out.println("Enter number of book: ");
        int numOfBook= numOfBookSc.nextInt();

        Scanner bookNameScanner= new Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName= bookNameScanner.nextLine();

        Scanner authorScanner= new Scanner(System.in);
        System.out.println("Enter book author: ");
        String author= authorScanner.nextLine();

        LoadingFile.bookController.saveBook(new Book(id,numOfBook,bookName,author));
        System.out.println("Book is created!");
    }

    public static void updateBook(){
        MainFunctions.viewBookList();

        try {
            Scanner choiceScanner= new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice= choiceScanner.nextInt();

            Book book= LoadingFile.bookController.findAll().get(choice);

            Scanner numOfBookSc= new Scanner(System.in);
            System.out.println("Enter number of book: ");
            int numOfBook= numOfBookSc.nextInt();

            Scanner bookNameScanner= new Scanner(System.in);
            System.out.println("Enter book name: ");
            String bookName= bookNameScanner.nextLine();

            Scanner authorScanner= new Scanner(System.in);
            System.out.println("Enter book author: ");
            String author= authorScanner.nextLine();

            book.setNumberOfBook(numOfBook);
            book.setName(bookName);
            book.setAuthor(author);

            LoadingFile.bookController.updateBook(book);
            System.out.println("Updated book successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            MainFunctions.updateBook();
        }


    }

    public static void deleteBook(){
        MainFunctions.viewBookList();

        Scanner idScanner= new Scanner(System.in);
        System.out.println("Enter book index: ");
        int index= idScanner.nextInt();

        Book book= LoadingFile.bookController.findAll().get(index);

        LoadingFile.bookController.deleteBook(book);
        System.out.println("Deleted book successfully!");
    }

    public static void createStudent(){
        MainFunctions.viewStudentList();

        Scanner idScanner= new Scanner(System.in);
        System.out.println("Enter student id: ");
        int studentId= idScanner.nextInt();

        Student student = LoadingFile.studentController.findStudentById(studentId);

        while (student != null){
            System.out.println("Student id is existed");
            Scanner newIdScanner= new Scanner(System.in);
            System.out.println("Enter student id: ");
            studentId= idScanner.nextInt();
            student= LoadingFile.studentController.findStudentById(studentId);
        }

        Scanner nameScanner= new Scanner(System.in);
        System.out.println("Enter student full name: ");
        String studentName= nameScanner.nextLine();

        Scanner classNameScanner= new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className= classNameScanner.nextLine();

        Scanner usernameScanner= new Scanner(System.in);
        System.out.println("Enter student username:");
        String username= usernameScanner.nextLine();

        Account account1= LoadingFile.accountController.findByUsername(username);

        while (account1 != null){
            System.out.println("Your username is existed");
            Scanner newUsernameScanner= new Scanner(System.in);
            System.out.println("Enter username: ");
            username= newUsernameScanner.nextLine();
            account1= LoadingFile.accountController.findByUsername(username);
        }

        Scanner passwordScanner= new Scanner(System.in);
        System.out.println("Enter student password: ");
        String password= passwordScanner.nextLine();


        Student newStudent= new Student(studentName,studentId,className);
        Account account= new Account(studentId,username,password,Role.STUDENT,studentName);

        newStudent.setAccount(account);

        LoadingFile.studentController.createStudent(newStudent);
        LoadingFile.accountController.saveAccount(account);
        System.out.println("Created student successfully!");

    }

    public static void updateStudent(){
        MainFunctions.viewStudentList();

        try {
            Scanner indexScanner= new Scanner(System.in);
            System.out.println("Enter index:");
            int index= indexScanner.nextInt();

            Student student= LoadingFile.studentController.findAll().get(index);

            Scanner nameScanner= new Scanner(System.in);
            System.out.println("Enter student new name: ");
            String newName= nameScanner.nextLine();

            Scanner classNameScanner= new Scanner(System.in);
            System.out.println("Enter new class name: ");
            String newClassName= classNameScanner.nextLine();

            student.setName(newName);
            student.setClassName(newClassName);

            LoadingFile.studentController.updateStudent(student);
            System.out.println("Updated student successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            MainFunctions.updateStudent();
        }
    }

    public static void deleteStudent(){
        MainFunctions.viewStudentList();
        MainFunctions.viewAccountList();

        Scanner studentScanner= new Scanner(System.in);
        System.out.println("Enter student index: ");
        int studentIndex= studentScanner.nextInt();

        Student student= LoadingFile.studentController.findAll().get(studentIndex);

        Scanner accountScanner= new Scanner(System.in);
        System.out.println("Enter account index");
        int accountIndex= accountScanner.nextInt();

        Account account= LoadingFile.accountController.findAll().get(accountIndex);

        LoadingFile.studentController.deleteStudent(student);
        LoadingFile.accountController.deleteAccount(account);

        System.out.println("Deleted student successfully!");


    }

    public static void createLibrarian(){
        MainFunctions.viewLibrarianList();

        Scanner idScanner= new Scanner(System.in);
        System.out.println("Enter librarian id: ");
        int id= idScanner.nextInt();

        Librarian librarian= LoadingFile.librarianController.findByLibrarianId(id);

        while (librarian != null){
            System.out.println("Librarian id is existed");
            Scanner newIdScanner= new Scanner(System.in);
            System.out.println("Enter librarian id: ");
            id= idScanner.nextInt();
            librarian= LoadingFile.librarianController.findByLibrarianId(id);
        }

        Scanner librarianName= new Scanner(System.in);
        System.out.println("Enter librarian name");
        String name= librarianName.nextLine();

        Scanner usernameScanner= new Scanner(System.in);
        System.out.println("Enter librarian username:");
        String username= usernameScanner.nextLine();

        Account account= LoadingFile.accountController.findByUsername(username);

        while (account != null){
            System.out.println("Your username is existed");
            Scanner newUsernameScanner= new Scanner(System.in);
            System.out.println("Enter username: ");
            username= newUsernameScanner.nextLine();
            account= LoadingFile.accountController.findByUsername(username);
        }

        Scanner passwordScanner= new Scanner(System.in);
        System.out.println("Enter student password: ");
        String password= passwordScanner.nextLine();


        Account account1= new Account(id,username,password,Role.LIBRARIAN,name);
        Librarian newLibrarian= new Librarian(id,name,account1);


        LoadingFile.librarianController.createLibrarian(newLibrarian);
        System.out.println("Created librarian successfully!");
    }

    public static void updateLibrarian(){
        try {
            Scanner indexScanner= new Scanner(System.in);
            System.out.println("Enter index:");
            int index= indexScanner.nextInt();

            Librarian librarian= LoadingFile.librarianController.findAll().get(index);

            Scanner nameScanner= new Scanner(System.in);
            System.out.println("Enter librarian new name: ");
            String newName= nameScanner.nextLine();


            librarian.setName(newName);

            LoadingFile.librarianController.updateLibrarian(librarian);
            System.out.println("Updated student successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            MainFunctions.updateLibrarian();
        }
    }

    public static void deleteLibrarian(){
        MainFunctions.viewLibrarianList();
        MainFunctions.viewAccountList();

        Scanner librarianScanner= new Scanner(System.in);
        System.out.println("Enter librarian index: ");
        int librarianIndex= librarianScanner.nextInt();

        Librarian librarian= LoadingFile.librarianController.findAll().get(librarianIndex);

        Scanner accountScanner= new Scanner(System.in);
        System.out.println("Enter account index");
        int accountIndex= accountScanner.nextInt();

        Account account= LoadingFile.accountController.findAll().get(accountIndex);

        LoadingFile.librarianController.deleteLibrarian(librarian);
        LoadingFile.accountController.deleteAccount(account);

        System.out.println("Deleted librarian successfully!");
    }





    // Student Menu
    public static void borrowBook(){
        MainFunctions.viewBookList();

        Scanner indexScanner= new Scanner(System.in);
        System.out.println("Enter index of book: ");
        int index= indexScanner.nextInt();

        Book book= LoadingFile.bookController.findAll().get(index);
        if (book.getNumberOfBook() < 1){
            System.out.println("Run out of book");
            MainFunctions.borrowBook();
        }else {
            book.setNumberOfBook(book.getNumberOfBook()-1);
            LoadingFile.bookController.updateBook(book);

            int id= (int) Math.random() * (999 - 100) + 100;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a return book date [dd. MM. yyyy]: ");
            String str = scan.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd. MM. yyyy");
            LocalDate timeReturnBook = LocalDate.parse(str, dtf);
            LocalDate borrowBookDate= LocalDate.now();

            Student student = LoadingFile.studentController.findStudentById(LoadingFile.loggingAccount.getId());

            LoadingFile.bookLoanCardController.createBookLoanCard(new BookLoanCard(id,borrowBookDate,timeReturnBook,book,student));
            System.out.println("Created book loan card successfully!");
        }

    }

    public static void returnBook(){
        MainFunctions.viewBookLoanCardList();

        Scanner choiceScanner= new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice= choiceScanner.nextInt();

        BookLoanCard bookLoanCard= LoadingFile.bookLoanCardController.findAll().get(choice);

        Book book= bookLoanCard.getBook();

        book.setNumberOfBook(book.getNumberOfBook() + 1);

        LoadingFile.bookController.updateBook(book);

        LoadingFile.bookLoanCardController.deleteLoanCard(bookLoanCard);
        System.out.println("Returned book successfully!");



    }














}
