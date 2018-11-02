/**
 * 
 */
package com.testspringhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testspringhibernate.service.DatadetailsOperationService;

/**
 * @author Dell
 *
 */
@Controller
@RequestMapping("/a")
public class TestController {
	
	@Autowired
	DatadetailsOperationService datadetailservice;
	
	 @RequestMapping(value = "/test", method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
		 	System.out.println("Called");
		 	model.addAttribute("detaillist", datadetailservice.listDeatails());
	        return "welcome";
	    }
}
