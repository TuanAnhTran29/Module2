package com.service.student;

import com.authentication.model.Account;
import com.authentication.service.IAccountService;
import com.model.Student;
import com.repository.account.FileManageAccount;
import com.repository.student.FileManageStudent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    List<Student> studentList= new ArrayList<>();
    private FileManageStudent fileManageStudent;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public FileManageStudent getFileManageStudent() {
        return fileManageStudent;
    }

    public void setFileManageStudent(FileManageStudent fileManageStudent) {
        this.fileManageStudent = fileManageStudent;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student findById(int id) {
        Student student= null;
        for (Student s: studentList) {
            if (s.getId() == id){
                student= s;
            }
        }
        return student;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        try {
            fileManageStudent.writeFile(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student student) {
        int index=0;

        for (Student s: studentList) {
            if (s.getId() == student.getId()){
                studentList.set(index, student);
            }
            index++;
        }
        try {
            fileManageStudent.writeFile(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
        try {
            fileManageStudent.writeFile(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addAll(List<Student> studentListFromFile) {
        studentList.removeAll(studentList);
        studentList.addAll(studentListFromFile);
    }
}
