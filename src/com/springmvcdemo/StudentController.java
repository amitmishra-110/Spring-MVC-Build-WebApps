package com.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Demo of JSTL Form elements
@Controller
@RequestMapping("/student")
public class StudentController 
{
	@RequestMapping("/showForm")
	public String showForm(Model m)
	{
		//create new student object which is empty 
		Student theStudent=new Student();
		
		
		//add student object to the model
		m.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("The Student" +theStudent.getFirstName() + " "+theStudent.getLastName());
		return "student-confirmation";
		
	}

}
