package com.sskgt.bend;

import com.sskgt.bend.service;

import java.util.Map;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/api")
public class HelloController {
	
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
	}
}
