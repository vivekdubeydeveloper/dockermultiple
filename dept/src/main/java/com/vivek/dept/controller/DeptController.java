package com.vivek.dept.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
	private static String URL="http://employee:8080/employee";
			
	@GetMapping("/empdept")
	public String getEmployees(){
		RestTemplate rt=new RestTemplate();
		String emp=rt.getForEntity(URL, String.class).getBody();
		System.out.println(emp);
		return emp;
	}

}
