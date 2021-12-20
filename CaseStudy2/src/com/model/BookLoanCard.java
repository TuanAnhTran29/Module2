package com.model;

import java.io.Serializable;
import java.time.LocalDate;

public class BookLoanCard implements Serializable {
    private int id;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Book book;
    private Student student;


    public BookLoanCard() {
    }

    public BookLoanCard(int id, LocalDate dateStart, LocalDate dateEnd,Book book,Student student) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.book= book;
        this.student= student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "BookLoanCard{" +
                "id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", book=" + book +
                ", student=" + student +
                '}';
    }
}

