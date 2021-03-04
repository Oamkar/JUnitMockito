package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentlist")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/addNew")
	public Student addNewEntry(@RequestBody Student student) {
		return studentService.addNewEntry(student);
	}
}
