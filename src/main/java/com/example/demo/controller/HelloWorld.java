package com.example.demo.controller;


import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	 @GetMapping("/app")
	 public String GetMsg() {
		 return "Hello World";
	 }
	 
	 
}
