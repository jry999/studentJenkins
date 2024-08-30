package com.wipro.student.service;
import java.util.List;

import com.wipro.student.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Integer id);
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Integer id);
}
