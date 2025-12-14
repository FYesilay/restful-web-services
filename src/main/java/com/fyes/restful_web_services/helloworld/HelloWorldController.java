package com.fyes.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping( path="/hello-world")
	String helloWorld() {
		return "HelloWorld";
	}
	@GetMapping( path="/hello-world-bean")
	HelloWorldBean helloWorldBean() {
		return new HelloWorldBean ("HelloWorld");
	}
	
	@GetMapping( path="/hello-world/path-variable/{name}")
	HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean (String.format("HelloWorld, %s", name));
	}
}
