package com.service.bookloancard;

import com.model.BookLoanCard;
import com.repository.bookloancard.FileManageLoanCardList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoanCardService implements ILoanCardService {
    List<BookLoanCard> bookLoanCardList= new ArrayList<>();
    private FileManageLoanCardList fileManageLoanCardList;

    public List<BookLoanCard> getBookLoanCardList() {
        return bookLoanCardList;
    }

    public void setBookLoanCardList(List<BookLoanCard> bookLoanCardList) {
        this.bookLoanCardList = bookLoanCardList;
    }

    public FileManageLoanCardList getFileManageLoanCardList() {
        return fileManageLoanCardList;
    }

    public void setFileManageLoanCardList(FileManageLoanCardList fileManageLoanCardList) {
        this.fileManageLoanCardList = fileManageLoanCardList;
    }

    @Override
    public List<BookLoanCard> findAll() {
        return bookLoanCardList;
    }

    @Override
    public BookLoanCard findById(int id) {
        BookLoanCard bookLoanCard= null;
        for (BookLoanCard b: bookLoanCardList) {
            if (b.getId() == id){
                bookLoanCard= b;
            }
        }
        return bookLoanCard;
    }

    @Override
    public void add(BookLoanCard bookLoanCard) {
        bookLoanCardList.add(bookLoanCard);
        try {
            fileManageLoanCardList.writeFile(bookLoanCardList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(BookLoanCard bookLoanCard) {
        int index=0;

        for (BookLoanCard b: bookLoanCardList) {
            if (b.getId() == bookLoanCard.getId()){
                bookLoanCardList.set(index, bookLoanCard);
            }
            index++;
        }
        try {
            fileManageLoanCardList.writeFile(bookLoanCardList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(BookLoanCard bookLoanCard) {
        bookLoanCardList.remove(bookLoanCard);
        try {
            fileManageLoanCardList.writeFile(bookLoanCardList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addAll(List<BookLoanCard> bookLoanCardsFromFile) {
        bookLoanCardList.removeAll(bookLoanCardList);
        bookLoanCardList.addAll(bookLoanCardsFromFile);

    }
}
