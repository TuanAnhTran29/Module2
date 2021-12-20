package com.service.student;

import com.model.Student;
import com.service.IGeneralService;

import java.util.List;

public interface IStudentService extends IGeneralService<Student> {
    void addAll(List<Student> studentListFromFile);
}
