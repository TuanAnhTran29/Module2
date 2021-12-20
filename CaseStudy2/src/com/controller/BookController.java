package com.controller;

import com.model.Book;
import com.repository.LoadingFile;
import com.service.book.BookService;

import java.util.List;

public class BookController {
    static BookService bookService= new BookService();

    public BookController(){
        bookService.setBookList(LoadingFile.bookList);
        bookService.setFileManageBook(LoadingFile.fileManageBook);
    }

    public List<Book> findAll(){
        return bookService.findAll();
    }

    public Book findById(int id){
        Book book = null;
        for (Book b: bookService.findAll()){
            if (b.getId() == id){
                book= b;
                break;
            }
        }
        return book;
    }

    public void saveBook(Book book){
        bookService.add(book);
    }
    public void updateBook(Book book){
        bookService.update(book);
    }
    public void deleteBook(Book book){
        bookService.delete(book);
    }


}
