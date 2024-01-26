package com.main.studentapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.studentapi.entity.Student;
import com.main.studentapi.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	
	@Override
	 public Student getStudent(Long Id) {
		
//		List<Student> byId = ;
		Student student = studentDao.findById(Id).get();
		
		return student;
	}


	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentDao.save(student);
		
	}


	@Override
	public Student update(Student student) {
		
		Long id = student.getId();
		Student student2 = studentDao.findById(id).get();
		
		student2.setSAddress(student.getSAddress());
		student2.setSMobile(student.getSMobile());
		student2.setSName(student.getSName());
		// TODO Auto-generated method stub
		return student2;
	}


	@Override
	public String delete(Long Id) {
		// TODO Auto-generated method stub
		
		studentDao.deleteById(Id);
		
		return "Delete Successfully";
	}


}
