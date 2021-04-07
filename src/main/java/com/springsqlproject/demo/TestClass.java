package com.springsqlproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {
	
	@GetMapping(path="/hello-worldsss")
	public String HelloWorld() {
		return "Hello World";
	}

}
