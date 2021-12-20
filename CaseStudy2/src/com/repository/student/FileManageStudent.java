package com.repository.student;

import com.model.Student;
import com.repository.IFileRepository;
import com.repository.book.FileManageBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManageStudent implements IFileRepository<Student>, Serializable {
    private static FileManageStudent fileManageStudent;

    private FileManageStudent(){}

    public static FileManageStudent getInstance(){
        if (fileManageStudent == null){
            fileManageStudent= new FileManageStudent();
        }
        return fileManageStudent;
    }


    @Override
    public List<Student> readFile() throws IOException {
        List<Student> studentList= new ArrayList<>();
        File file= new File("student_list.txt");

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
            studentList= (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public void writeFile(List<Student> studentList) throws IOException, ClassNotFoundException {
        try {
            File file= new File("student_list.txt");
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
