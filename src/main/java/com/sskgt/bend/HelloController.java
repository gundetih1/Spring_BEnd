package com.sskgt.bend;

import com.sskgt.bend.service;

//import java.util.Map;
import java.util.*;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;






@RestController
@RequestMapping("/api")
public class HelloController {
	
/*-----------------------------------------------Date: 02/03/25 SpringBoot API Parameters---------------------------------------*/

	// Query Parameter

	 @GetMapping("/queryParameter")
	 public String queryParam(@RequestParam(name = "name", defaultValue = "Guest") String name) {
		 return "Hello " + name;
	 }
	 
	 
	//Path Parameter (or) URI Parameter
	 
	 @GetMapping("/pathParameter/{name}")
	 public String getUserByName(@PathVariable String name) {
		 return "Hello " + name;
	 }
	 
	 //Multiple Path Parameters
	 
	 @GetMapping("/multiPathPractice/{name}/{role}/{Id}")
	 public String userDetails(@PathVariable String name, @PathVariable String role, @PathVariable int Id) {
		 return "User Details are " + name + ", " + role + ", " + Id;
	 }
	 
	 //RequestBody Parameter
	 
	 @PostMapping("/requestBodyParameter")//post by sending json
	 public String createUser(@RequestBody Map<String, String> requestBody){
		 return "Name is "+requestBody.get("name") + " and Phone number is " + requestBody.get("phone");
		 
	 }
	 
	 @PostMapping("/postUserName")
	 public String postUserName(@RequestBody String name) {
		 return name;
	 }
	 
	 //Header Parameter
	 
	 @GetMapping("/headerParameter")
	 public String getHeader(@RequestHeader("User-Agent") String userAgent) {
		 return userAgent;
	 }
	 
	
	
/* ----------------------------------------------Date: 02/02/25 SpringBoot Fundamentals--------------------------------------------
  	
  	
  	
  	private final service servicelayer;
 
	
	
	public HelloController(service servicelayer) {
		this.servicelayer = servicelayer;
		
	}
	
	private service serviceauto;
	
	@Autowired
	public void setservice(service serviceauto) {
		this.serviceauto = serviceauto;
	}
	
	@GetMapping("/serviceauto")
	public String sayhelloauto() {
		return serviceauto.sayhello();
	}
	
	
	
	@GetMapping("/helloj")
	public Map<String, String> sayhello(@RequestParam(name = "name", defaultValue = "Guest")String name){
		Map<String, String> response = new HashMap();
		response.put("message", "Hello " +  name);
		return response;
	}
	
	@GetMapping("/hellon")
	public String reqpam(@RequestParam(name = "name", defaultValue = "Guest") String name) {
		return "Hello " + name;
	}
	
	
	@GetMapping("/hello")
	public String sayhello() {
		return servicelayer.sayhello();
	}
	
	@GetMapping("/m")
	public String M2() {
		return "How are you doing today?";
	}
	
	@GetMapping("/h")
	public String how() {
		return "How are you?";
	}*/
}
