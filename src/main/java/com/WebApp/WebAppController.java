package com.WebApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class WebAppController {
@GetMapping(value= "/getHello")
public String getHello() {
    return "Hello World";
}

@GetMapping(value="/getName/{name}")
public String getName(@PathVariable String name) {
    return "Hello,"+name;
}

@GetMapping(value="/getModulus/{a}/{b}")
public int getModulus(@PathVariable int a,@PathVariable int b) {
	return a%b;
}

@GetMapping(value="getGreat")
public String findGreat(@RequestParam int a, @RequestParam int b) {
	if(a>b) {
    return a+" is Greater";
}
else {
	return b+" is Greater";
   }
} 

@GetMapping(value="credentials")
public String getCredentials(@RequestParam String a, @RequestParam String b) {
	if(a.equals(b)) {
   return "Logged in successfully";
	}
	else {
		return "invalid attempt";
	}
 }
	
@GetMapping(value="/abcd/{age}")
	public String checkAge(@PathVariable int age) throws AgeException {
		if(age<=18) {
			throw new AgeException("Not eligible");
		}
		else {
			return "Eligible";
		}
	}
 }

 class AgeException extends Exception {
	public AgeException(@RequestParam String msg) {
	    super(msg);
	}
	
	
 }	

 
	




