package com.mydevapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devApp {
	
	@GetMapping("/get")
	public String get() {
		return "Hello I am From Devops";
	}

}
