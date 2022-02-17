package com.example.demo.controllers;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody

@RestController // =@Controller +@ResposeBody
public class MyController {

	//@RequestMapping(path = "/hi", method = RequestMethod.GET)
	@GetMapping("/hi")
	public String sayHello() {
		return "hello";  // it will look for ViewResolver  by default to send response directly to client we can use @ResponseBody
	}
	
	
	
	@GetMapping("/greet/{type}")
	public String greet(@RequestParam String username, 
			@PathVariable("type") String typeVar,
			@RequestHeader Map<String,String> headers
			
			) {
		String msg="";
		
		if(typeVar.equals("morning"))
			msg="<h2>Good Morning "+username +"</h2>";
		else
			msg="<h2>Hello "+username+"</h2>";
				
		msg+=headers;
		return msg;
	}
	
	@PostMapping("/add")
	public String createResource(@RequestBody String  val) {
		return "Resource Created Sucessfully : received : "+val;
	}
	
	@PutMapping("/update")
	public String updateResource() {
		return "Resource Updated Sucessfully";
	}
	
	
	@DeleteMapping("/delete")
	public String deleteResource() {
		return "Resource Deleted Sucessfully";
	}
	
}
