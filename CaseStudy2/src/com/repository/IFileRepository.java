package com.repository;

import java.io.IOException;
import java.util.List;

public interface IFileRepository<T> {
    public List<T> readFile() throws IOException;
    public void writeFile(List<T> t) throws IOException,ClassNotFoundException;

}
