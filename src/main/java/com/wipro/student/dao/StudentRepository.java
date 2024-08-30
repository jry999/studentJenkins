package com.wipro.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
