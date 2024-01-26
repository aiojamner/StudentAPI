package com.main.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.studentapi.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{

//	public void createStudent(Student student);
}
