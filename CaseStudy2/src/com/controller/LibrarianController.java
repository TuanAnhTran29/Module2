package com.controller;

import com.model.Librarian;
import com.repository.LoadingFile;
import com.service.bookloancard.LoanCardService;
import com.service.librarian.LibrarianService;

import java.util.List;

public class LibrarianController {
    private LibrarianService librarianService= new LibrarianService();

    public LibrarianController() {
        librarianService.setLibrarianList(LoadingFile.librarianList);
        librarianService.setFileManageLibrarian(LoadingFile.fileManageLibrarian);
    }

    public List<Librarian> findAll(){
        return librarianService.findAll();
    }

    public Librarian findByLibrarianId(int id){
        Librarian librarian= null;

        for (Librarian l: librarianService.findAll()) {
            if (l.getId() == id){
                librarian= l;
                break;
            }
        }
        return librarian;
    }

    public void createLibrarian(Librarian librarian){
        librarianService.add(librarian);
    }

    public void updateLibrarian(Librarian librarian){
        librarianService.update(librarian);
    }

    public void deleteLibrarian(Librarian librarian){
        librarianService.delete(librarian);
    }
}
