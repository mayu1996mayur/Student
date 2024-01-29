package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
List<Student>getAllStudents();
Student getStudentById(long id);
Student createStudent(Student student);
Student updateStudent(long id,Student updatedStudent);
void deleteStudent(long id);

}
