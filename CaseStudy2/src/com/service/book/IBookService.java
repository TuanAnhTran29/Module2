package com.service.book;

import com.model.Book;
import com.service.IGeneralService;

import java.util.List;

public interface IBookService extends IGeneralService<Book> {
    void addAll(List<Book> bookListFromFile);

}
