package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.pojo.MyObj;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String getHome(Model model) {
		
		String name = "Guybrush";
		MyObj myObj = new MyObj(1, "external text");
		List<MyObj> myObjs = new ArrayList<>();
		myObjs.add(new MyObj(2, "external LIST text 1"));
		myObjs.add(new MyObj(3, "external LIST text 2"));
		myObjs.add(new MyObj(4, "external LIST text 3"));
		
		model.addAttribute("name", name);
		model.addAttribute("myObj", myObj);
		model.addAttribute("myObjs", myObjs);
		
		return "home"; 
	}
	
	@ResponseBody
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") int id) {
		
		
		
		return "user: " + id;
	}
}









