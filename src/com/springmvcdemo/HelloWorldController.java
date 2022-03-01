package com.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Controller to get details from student and then redirect and display the same to next page
@Controller
@RequestMapping("/hello")
public class HelloWorldController 
{
	
	//Need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	
	//Need a controller method to process the form
	@RequestMapping("/processForm")
	public String procesForm()
	{
		return  "welcome-page";
		
	}
	
	//New Controller method to read form data and add data to the model
	@RequestMapping("/processFormVersion2")
	public  String sayHello(HttpServletRequest request,Model m)
	{
		String name,result=null;
		
		//read the data from html form using request parameter
		String sName=request.getParameter("studentName");
		
		//converting the data into upper case
		sName=sName.toUpperCase();
		
		//create a message
		String message="Hey!,How are you?"+sName;
		
		//adding data to the model
		m.addAttribute("key",message);
		
		return "welcome-page";
		
	}
	
	
		  //Bind data using @RequestParam
		@RequestMapping("/processFormVersion3")
		public  String sayHello2(@RequestParam("studentName") String sName,Model m)
		{
		
		
			//converting the data into upper case
			sName=sName.toUpperCase();
			
			//create a message
			String message="Hey!,How are you using @Request Param?"+sName;
			
			//adding data to the model
			m.addAttribute("key",message);
			
			return "welcome-page";
			
		}
		
	

}
