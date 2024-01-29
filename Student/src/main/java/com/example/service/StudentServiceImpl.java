package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Optional<Student>student=studentRepository.findById(id);
		return student.orElse(null);
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(long id, Student updatedStudent) {
		// TODO Auto-generated method stub
		if(studentRepository.existsById(id)) {
			updatedStudent.setId(id);
			return studentRepository.save(updatedStudent);
		}
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);

	}

}
