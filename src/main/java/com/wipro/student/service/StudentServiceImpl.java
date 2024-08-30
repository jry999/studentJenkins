package com.wipro.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.student.dao.StudentRepository;
import com.wipro.student.exeception.StudentException;
import com.wipro.student.model.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(()->new StudentException("Student does not exists"));
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
    	Student child=studentRepository.findById(student.getId()).orElseThrow(()->new StudentException("Student does not exists"));
        child.setName(student.getName());
        child.setRollNumber(student.getRollNumber());
    	return studentRepository.save(child);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

}
