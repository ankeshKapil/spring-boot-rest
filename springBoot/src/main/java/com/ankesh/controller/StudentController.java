package com.ankesh.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.entity.Student;
import com.ankesh.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getStudentbyId(@PathVariable("id") Integer id){
		return studentService.getStudentbyId(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public Student deleteStudentbyId(@PathVariable("id") Integer id){
		return studentService.deleteStudentbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student){
		return studentService.updateStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Student insertStudent(@RequestBody Student student){
		return studentService.insertStudent(student);
	}

}
