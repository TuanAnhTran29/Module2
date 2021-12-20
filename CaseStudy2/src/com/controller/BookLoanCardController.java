package com.controller;

import com.model.BookLoanCard;
import com.repository.LoadingFile;
import com.service.bookloancard.LoanCardService;

import java.util.ArrayList;
import java.util.List;

public class BookLoanCardController {
    private LoanCardService loanCardService= new LoanCardService();

    public BookLoanCardController() {
        loanCardService.setBookLoanCardList(LoadingFile.bookLoanCardList);
        loanCardService.setFileManageLoanCardList(LoadingFile.fileManageLoanCardList);
    }

    public List<BookLoanCard> findAll(){
        return loanCardService.findAll();
    }
    public List<BookLoanCard> findByStudentId(int studentId){
        List<BookLoanCard> bookLoanCardList= new ArrayList<>();
        for (BookLoanCard b: loanCardService.findAll()) {
            if (b.getStudent().getId() == studentId){
                bookLoanCardList.add(b);
            }
        }
        return bookLoanCardList;
    }

    public BookLoanCard findById(int id){
        BookLoanCard bookLoanCard= null;
        for (BookLoanCard b: loanCardService.findAll()) {
            if (b.getId() == id){
                bookLoanCard= b;
                break;
            }
        }
        return bookLoanCard;
    }

    public void createBookLoanCard(BookLoanCard bookLoanCard){
        loanCardService.add(bookLoanCard);
    }

    public void deleteLoanCard(BookLoanCard bookLoanCard){
        loanCardService.delete(bookLoanCard);
    }
}
