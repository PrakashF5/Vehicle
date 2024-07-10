package com.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
@GetMapping("/getDate/{dateString}")
  
public String dateString(@PathVariable String dateString) {
	String[] parts = dateString.split(",");
	String day = parts[0];
	String month = parts[1];
	String year = parts[2];
	
	String formattedDate = String.format("%s/%s/%s",day,month,year);
	System.out.println("Formatted Date: "+formattedDate);
	
	return formattedDate;
}

}
