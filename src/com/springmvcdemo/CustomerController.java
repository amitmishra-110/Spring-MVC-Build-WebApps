package com.springmvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
	//Add an initbinder to covert trim input string remove leading and trailing
	//white space  and resolve  issue for white space  acceptance is lastname
	//Use for preprocessing
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor=new  StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model m)
	{
		Customer thecustomer=new Customer();
		m.addAttribute("customer", thecustomer);
		
		return "customer-form";	
	}

	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer theCustomer
			,BindingResult theBindingResult)
	{
		//If the Field has Errors
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
		
		
	}
}
