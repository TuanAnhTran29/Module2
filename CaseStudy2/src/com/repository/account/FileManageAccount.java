package com.repository.account;

import com.authentication.model.Account;
import com.repository.IFileRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManageAccount implements IFileRepository<Account>, Serializable {
    private static FileManageAccount fileManageAccount;

    private FileManageAccount() {
    }

    public static FileManageAccount getInstance(){
        if (fileManageAccount == null){
            fileManageAccount= new FileManageAccount();
        }
        return fileManageAccount;

    }

    @Override
    public List<Account> readFile() throws IOException {
        List<Account> accountList= new ArrayList<>();

        File file= new File("account_list.txt");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (file.length() == 0){
            return new ArrayList<>();
        }

        try {
            InputStream inputStream= new FileInputStream(file);
            ObjectInputStream objectInputStream= new ObjectInputStream(inputStream);
            accountList= (List<Account>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return accountList;

    }

    @Override
    public void writeFile(List<Account> accountList) throws IOException, ClassNotFoundException {
        if (accountList == null){
            accountList= new ArrayList<>();
        }
        File file= new File("account_list.txt");
        try {
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(accountList);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
