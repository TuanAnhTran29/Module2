package com.service.librarian;

import com.model.Librarian;
import com.repository.librarian.FileManageLibrarian;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibrarianService implements ILibrarianService {
    List<Librarian> librarianList= new ArrayList<>();
    private FileManageLibrarian fileManageLibrarian;

    public List<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void setLibrarianList(List<Librarian> librarianList) {
        this.librarianList = librarianList;
    }

    public FileManageLibrarian getFileManageLibrarian() {
        return fileManageLibrarian;
    }

    public void setFileManageLibrarian(FileManageLibrarian fileManageLibrarian) {
        this.fileManageLibrarian = fileManageLibrarian;
    }

    @Override
    public List<Librarian> findAll() {
        return librarianList;
    }

    @Override
    public Librarian findById(int id) {
        Librarian librarian= null;
        for (Librarian l: librarianList) {
            if (l.getId() == id){
                librarian= l;
            }
        }
        return librarian;
    }

    @Override
    public void add(Librarian librarian) {
        librarianList.add(librarian);
        try {
            fileManageLibrarian.writeFile(librarianList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Librarian librarian) {
        int index=0;
        for (Librarian l: librarianList) {
            if (l.getId() == librarian.getId()){
                librarianList.set(index,librarian);
            }
            index++;
        }
        try {
            fileManageLibrarian.writeFile(librarianList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Librarian librarian) {
        librarianList.remove(librarian);
        try {
            fileManageLibrarian.writeFile(librarianList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addAll(List<Librarian> librarianListFromFile) {
        librarianList.removeAll(librarianList);
        librarianList.addAll(librarianListFromFile);
    }
}
