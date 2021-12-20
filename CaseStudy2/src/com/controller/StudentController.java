package com.controller;

import com.authentication.model.Account;
import com.model.Student;
import com.repository.LoadingFile;
import com.service.student.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService= new StudentService();

    public StudentController() {
        studentService.setStudentList(LoadingFile.studentList);
        studentService.setFileManageStudent(LoadingFile.fileManageStudent);
    }

    public List<Student> findAll(){
        return studentService.findAll();
    }

    public Student findStudentById(int id){
        Student student= null;
        for (Student s: studentService.findAll()) {
            if (s.getId()== id){
                student= s;
            }
        }
        return student;
    }

    public void createStudent(Student student){
        studentService.add(student);
    }

    public void updateStudent(Student student){
        studentService.update(student);
    }

    public void deleteStudent(Student student){
        studentService.delete(student);
    }
}
