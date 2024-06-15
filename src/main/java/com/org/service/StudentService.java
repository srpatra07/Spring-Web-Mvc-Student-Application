package com.org.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.binding.Student;
import com.org.entities.StudentEntity;
import com.org.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;

	public List<String> getCourses()
	{
		return Arrays.asList("Java","Python","DevOps");
	}
	
	public List<String> getTimings()
	{
		return Arrays.asList("Morning","Afternoon","Evening");
	}
	
	public boolean saveStudent(Student student)
	{
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		repo.save(entity);
		
		return true;
		
	}
	
}
