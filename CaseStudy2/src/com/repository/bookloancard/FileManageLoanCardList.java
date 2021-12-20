package com.repository.bookloancard;

import com.model.BookLoanCard;
import com.repository.IFileRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManageLoanCardList implements IFileRepository<BookLoanCard>, Serializable {
    private static FileManageLoanCardList fileManageLoanCard;

    private FileManageLoanCardList(){};

    public static FileManageLoanCardList getInstance(){
        if (fileManageLoanCard == null){
            fileManageLoanCard= new FileManageLoanCardList();
        }
        return fileManageLoanCard;
    }

    @Override
    public List readFile() throws IOException {
        List<BookLoanCard> bookLoanCardList= new ArrayList<>();
        File file= new File("loan_card_list.txt");

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
            bookLoanCardList= (List<BookLoanCard>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookLoanCardList;
    }

    @Override
    public void writeFile(List<BookLoanCard> bookLoanCardList) throws IOException, ClassNotFoundException {
        try {
            File file= new File("loan_card_list.txt");
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(bookLoanCardList);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
