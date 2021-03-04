package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import com.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository stdRepository){
		studentRepository = stdRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students :: add);
		return students;
	}

	@Override
	public Student addNewEntry(Student student) {
		return studentRepository.save(student);
	}

}
