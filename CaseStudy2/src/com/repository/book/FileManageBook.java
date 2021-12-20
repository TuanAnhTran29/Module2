package com.repository.book;

import com.model.Book;
import com.repository.IFileRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManageBook implements IFileRepository<Book>, Serializable {
    private static FileManageBook fileManageBook;

    private FileManageBook() {
    }

    public static FileManageBook getInstance(){
        if (fileManageBook== null){
            fileManageBook= new FileManageBook();
        }
        return fileManageBook;
    }


    @Override
    public List<Book> readFile() throws IOException {
        List<Book> bookList= new ArrayList<>();
        File file= new File("book_list.txt");

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
            bookList= (List<Book>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public void writeFile(List<Book> bookList) throws IOException, ClassNotFoundException {
        try {
            File file= new File("book_list.txt");
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(bookList);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
