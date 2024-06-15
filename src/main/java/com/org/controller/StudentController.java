package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.binding.Student;
import com.org.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		setData(model);
		
		return "index";
	}

	private void setData(Model model) {
		Student sobj = new Student();
		model.addAttribute("student",sobj);
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings",service.getTimings());
	}
	
	@PostMapping("/save")
	public String saveStudent(Student s,Model model)
	{
		
		boolean status = service.saveStudent(s);
		
		if(status)
		{
			model.addAttribute("status","Data saved successfully...");
		}
		
		setData(model);
		
		return "index";
	}
	
}
