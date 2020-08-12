package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {
	
	@GetMapping(path="/getBestUser")
	  public @ResponseBody User getBestUser() {
		return new User("arnab","arnabp");
	  }
	
	@GetMapping(path="/getAllUsers")
	  public @ResponseBody User[] getAllUsers() {
		User[] obj = new User[2];
		obj[0] = new User("arnab","arnabp");
		obj[1] = new User("arnab2","arnabp");
		return obj;
	  }

}
