package com.main.studentapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.studentapi.entity.Student;
import com.main.studentapi.service.StudentService;

///student/create-student
@RestController
@RequestMapping("/student")
public class Controller {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/get-student/{Id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long Id) {
		
		Student findId = studentService.getStudent(Id);
		
		return new ResponseEntity<Student>(findId, HttpStatus.OK);
	}
	
	@PostMapping("/create-student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		
		
		Student createStudent = studentService.createStudent(student);
		
		return new ResponseEntity<Student>(createStudent, HttpStatus.CREATED);
	}
	
	@PutMapping("/update-student")
	public ResponseEntity<?> update(@RequestBody Student student){
		
		studentService.update(student);
		
		return new ResponseEntity<String>("Updated Succesfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-student/{Id}")
	public ResponseEntity<String> delete(@PathVariable Long Id){
		
		String delete = studentService.delete(Id);
		
		return new ResponseEntity<String>(delete,HttpStatus.NO_CONTENT);
	}
}
