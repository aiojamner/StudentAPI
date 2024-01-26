package com.main.studentapi.service;



import com.main.studentapi.entity.Student;


public interface StudentService {
	
	Student getStudent(Long Id);
	
	Student createStudent(Student student);
	
	Student update(Student student);
	
	String delete(Long Id);
	
	
}
