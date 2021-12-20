package com.repository;

import com.authentication.controller.AccountController;
import com.authentication.model.Account;
import com.authentication.model.roles.Role;
import com.controller.BookController;
import com.controller.BookLoanCardController;
import com.controller.LibrarianController;
import com.controller.StudentController;
import com.model.Book;
import com.model.BookLoanCard;
import com.model.Librarian;
import com.model.Student;
import com.repository.account.FileManageAccount;
import com.repository.book.FileManageBook;
import com.repository.bookloancard.FileManageLoanCardList;
import com.repository.librarian.FileManageLibrarian;
import com.repository.student.FileManageStudent;

import java.io.IOException;
import java.util.List;

public class LoadingFile {
    public static List<Account> accountList= null;
    public static List<Book> bookList= null;
    public static List<BookLoanCard> bookLoanCardList= null;
    public static List<Librarian> librarianList= null;
    public static List<Student> studentList= null;

    public static AccountController accountController= null;
    public static BookController bookController= null;
    public static BookLoanCardController bookLoanCardController= null;
    public static LibrarianController librarianController= null;
    public static StudentController studentController= null;

    public static FileManageAccount fileManageAccount= FileManageAccount.getInstance();
    public static FileManageBook fileManageBook= FileManageBook.getInstance();
    public static FileManageLoanCardList fileManageLoanCardList= FileManageLoanCardList.getInstance();
    public static FileManageLibrarian fileManageLibrarian= FileManageLibrarian.getInstance();
    public static FileManageStudent fileManageStudent= FileManageStudent.getInstance();


    public static Account loggingAccount= null;

    public static void loadManageFile(){
        try {
            accountList= fileManageAccount.readFile();
            bookList= fileManageBook.readFile();
            bookLoanCardList= fileManageLoanCardList.readFile();
            librarianList= fileManageLibrarian.readFile();
            studentList= fileManageStudent.readFile();

            Account account= new Account(1,"tuananh","123", Role.LIBRARIAN,"tuananhtran");
            LoadingFile.accountList.add(account);


        } catch (IOException e) {
            e.printStackTrace();
        }


        accountController= new AccountController();
        bookController= new BookController();
        bookLoanCardController= new BookLoanCardController();
        librarianController= new LibrarianController();
        studentController= new StudentController();

    }














}
