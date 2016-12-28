package com.ankesh.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankesh.dao.StudentDAO;
import com.ankesh.entity.Student;
@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	public Collection<Student> getAllStudents(){
		return studentDAO.getAllStudents();
	}
	
	public Student getStudentbyId(Integer id){
		return studentDAO.getStudentbyId(id);
	}

	public Student deleteStudentbyId(Integer id) {
		// TODO Auto-generated method stub
		return studentDAO.deleteStudentbyId(id);
	}
	
	public Student updateStudent(Student student) {
	return studentDAO.updateStudent(student);
	}

	public Student insertStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.insertStudent(student);
	}
}


