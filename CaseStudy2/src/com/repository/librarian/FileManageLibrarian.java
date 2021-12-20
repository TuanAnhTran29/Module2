package com.repository.librarian;


import com.model.Librarian;
import com.repository.IFileRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManageLibrarian implements IFileRepository<Librarian>,Serializable {
    private static FileManageLibrarian fileManageLibrarian;

    private FileManageLibrarian(){}

    public static FileManageLibrarian getInstance(){
        if (fileManageLibrarian == null){
            fileManageLibrarian= new FileManageLibrarian();
        }
        return fileManageLibrarian;
    }


    @Override
    public List<Librarian> readFile() throws IOException {
        List<Librarian> librarianList= new ArrayList<>();
        File file = new File("librarian_list.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.length() == 0) {
            return new ArrayList<>();
        }

        try {
            InputStream inputStream= new FileInputStream(file);
            ObjectInputStream objectInputStream= new ObjectInputStream(inputStream);
            librarianList= (List<Librarian>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return librarianList;
    }

    @Override
    public void writeFile(List<Librarian> librarianList) throws IOException, ClassNotFoundException {
        try {
            File file= new File("librarian_list.txt");
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(librarianList);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
