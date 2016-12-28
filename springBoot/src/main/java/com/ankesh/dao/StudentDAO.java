package com.ankesh.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ankesh.entity.Student;
@Repository
public class StudentDAO {
	
	private static Map<Integer, Student> students;
	
	static {
		students=new HashMap<Integer,Student>(){
			{
				put(1,new Student(1, "sourabh", "computers"));
				put(2,new Student(2, "rohit", "it"));
				put(3,new Student(3, "sohit", "it"));
				put(4,new Student(4, "vijay", "computers"));
				put(5,new Student(5, "talwinder", "computers"));
				
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	public Student getStudentbyId(Integer id){
		return students.get(id);
	}

	public Student deleteStudentbyId(Integer id) {
		// TODO Auto-generated method stub
		return students.remove(id);
	}
	
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student s=students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		students.put(s.getId(), student);
		return s;
	}

	public Student insertStudent(Student student) {
		// TODO Auto-generated method stub
		return students.put(student.getId(), student);
	}

}
