package com.mydevapp;

import org.springframework.web.bind.annotation.GetMapping;

public class devApp {
	
	@GetMapping("/get")
	public String get(String name) {
		return "Hello I am From Devops";
	}

}
