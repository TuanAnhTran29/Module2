package com.model;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private int numberOfBook;
    private String name;
    private String author;


    public Book(int id, String bookName, String author) {
        this.id= id;
        this.name= bookName;
        this.author= author;
    }

    public Book(int id, int numberOfBook, String bookName, String author) {
        this.id = id;
        this.numberOfBook= numberOfBook;
        this.name = bookName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", numberOfBook=" + numberOfBook +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
