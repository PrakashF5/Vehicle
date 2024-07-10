package com.WebApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/PhoneDetails")
@RestController
public class PhoneController {
	@GetMapping(value="/getPhonePrice")
	public String getPhonePrice(@RequestBody List<Phone> p) {
		String a ="";
		int b=0;
       for(Phone i : p) {
    	   if(i.getPrice()>2500) {
    		   a=i.getBrand();
    		   b=i.getPrice();
    	   }
       }
       return a;
} 
	
@GetMapping(value="/getColorMy")	
	public String getColorMy(@RequestBody List<Phone> p) {
	String a="";
	int b=0;
	for(Phone s : p) {
		if(s.getBrand().startsWith("S")) {
			a=s.getColor();
			b=s.getModelYear();
	}
  }
	return a+" "+b;
	
}

@GetMapping(value="/getDeta")
public Phone getDeta(@RequestBody List<Phone> p) {
	Phone q = p.get(0);
	for(int i=0; i<p.size(); i++) {
		if(p.get(i).getColor().equals("Black")) {
        q=p.get(i);
		}
	}
	return q;
}
		
@GetMapping(value="/getBbrand")
public List<String> getBbrand(@RequestBody List<Phone> p) {
List<String> s = p.stream().filter(x->x.getModelYear()<2020 && x.getModelYear()>2015).map(y->y.getBrand()).collect(Collectors.toList());
return s;
    }

int max=0;
@GetMapping(value="/getMax")
public int getMax(@RequestBody List<Phone> p) {
	for(Phone x: p) {
		if(x.getPrice()>max) {
			max=x.getPrice();
		}
	}
	return max;
}


}
