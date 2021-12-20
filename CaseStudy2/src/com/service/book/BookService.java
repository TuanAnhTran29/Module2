package com.service.book;

import com.model.Book;
import com.repository.book.FileManageBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService {
    List<Book> bookList= new ArrayList<>();
    private FileManageBook fileManageBook;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public FileManageBook getFileManageBook() {
        return fileManageBook;
    }

    public void setFileManageBook(FileManageBook fileManageBook) {
        this.fileManageBook = fileManageBook;
    }

    @Override
    public List<Book> findAll() {
        return bookList;
    }

    @Override
    public Book findById(int id) {
        Book book= null;
        for (Book b: bookList) {
            if (b.getId() == id){
                book= b;
            }
        }
        return book;
    }

    @Override
    public void add(Book book) {
        bookList.add(book);
        try {
            fileManageBook.writeFile(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Book book) {
        int index= 0;

        for (Book b: bookList) {
            if (b.getId() == book.getId()){
                bookList.set(index,book);
            }
            index++;
        }
        try {
            fileManageBook.writeFile(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Book book) {
        bookList.remove(book);
        try {
            fileManageBook.writeFile(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addAll(List<Book> bookListFromFile) {
        bookList.removeAll(bookList);
        bookList.addAll(bookListFromFile);
    }
}
