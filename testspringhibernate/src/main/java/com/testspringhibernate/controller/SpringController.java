/**
 * 
 */
package com.testspringhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testspringhibernate.model.Datadetails;
import com.testspringhibernate.service.DatadetailsOperationService;

/**
 * @author Dell
 *
 */
@Controller
@RequestMapping("/")
public class SpringController {
	
	@Autowired
	Datadetails displaydata;
	@Autowired
	DatadetailsOperationService datadetailservice;
	
	@RequestMapping("/shmtest")
	public String say(@ModelAttribute Datadetails displaydata, ModelMap model) {
		model.addAttribute("greeting", displaydata +"to Hello World from Spring MVC");
		System.out.println("Calling " + displaydata);
		datadetailservice.savedata(displaydata);
		return "welcome";
	}
	 
}
