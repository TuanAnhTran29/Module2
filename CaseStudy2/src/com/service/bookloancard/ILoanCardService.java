package com.service.bookloancard;

import com.model.BookLoanCard;
import com.service.IGeneralService;

import java.util.List;

public interface ILoanCardService extends IGeneralService<BookLoanCard> {
    void addAll(List<BookLoanCard> bookLoanCardsFromFile);
}
