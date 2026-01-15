package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.entities.Student;
import com.test.service.ShopService;

@Controller
@RequestMapping("/students")
public class ShopController {
	@Autowired
	ShopService service;
	@GetMapping("/pass")
	@ResponseBody
	Student get() {
		return service.getStudent();
	}
	@GetMapping("/passname")
	@ResponseBody
	String getName() {
		return "<h1>thite</h1>";
	}

}
