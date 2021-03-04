package com.demo;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import com.demo.service.StudentService;
import com.demo.service.impl.StudentServiceImpl;

@ExtendWith(MockitoExtension.class)
class ApplicationTests {

	private StudentService studentService;
	
	@Mock private StudentRepository studentRepository;
	  
	@Mock private Student student;
	
	@Mock private Iterable<Student> itrStudents;
	
	@BeforeEach
	public void onSetUp() {
		studentService = new StudentServiceImpl(studentRepository);
	}
	
	@Test
	public void testGetAllStudents() {
		when( studentRepository.findAll() ).thenReturn( itrStudents );
		assertNotNull(studentService.getAllStudents());
		verify(studentRepository).findAll();
	}
	
	@Test
	public void testAddNewEntry() {
		when( studentRepository.save(student) ).thenReturn(student);
		assertNotNull(studentService.addNewEntry(student));
		verify(studentRepository).save(student);
	}

}
