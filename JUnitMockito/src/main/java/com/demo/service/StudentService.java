package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student addNewEntry(Student std);

}
