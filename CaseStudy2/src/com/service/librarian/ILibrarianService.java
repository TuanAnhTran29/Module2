package com.service.librarian;

import com.model.Librarian;
import com.service.IGeneralService;

import java.util.List;

public interface ILibrarianService extends IGeneralService<Librarian> {
    void addAll(List<Librarian> librarianListFromFile);
}
