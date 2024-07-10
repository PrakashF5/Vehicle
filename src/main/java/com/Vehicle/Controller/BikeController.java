package com.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Entity.Bike;
import com.Vehicle.Exception.BrandNotFoundException;
import com.Vehicle.Service.BikeService;

@RestController
public class BikeController {
@Autowired
BikeService bs;

@PostMapping(value="/postAllDetails")
public String postAllDetails(@RequestBody List<Bike> a) {
	return bs.postAllDetails(a);
}

@GetMapping(value="/getDetails")
public List<Bike> getDetails() {
	return bs.getDetails();
}

@GetMapping(value="/get1/{a}")
public List<Bike> get1(@PathVariable String a) {
	return bs.get1(a);
}

@GetMapping(value="/get2")
public List<Object> get2() {
	return bs.get2();
}

@GetMapping(value="/get3/{a}/{b}")
public List<Bike> get3(@PathVariable int a, @PathVariable int b) {
	return bs.get3(a,b);
}

@GetMapping(value="/get4/{a}") 
public List<Bike> get4(@PathVariable int a) {
	return bs.get4(a);
}

@GetMapping(value="/get5")
public int get5() {
	return bs.get5();
}

@GetMapping(value="/get6")
public int get6() {
  return bs.get6();
}

@GetMapping(value="get7")
public List<Bike> get7() {
	return bs.get7();
}

@GetMapping(value="get8")
public List<Bike> get8() {
	return bs.get8();
}
 
@GetMapping(value="/get9")
public int get9() {
	return bs.get9();
}

@GetMapping(value="/get10")
public List<Object> get10() {
	return bs.get10();	
}	

@GetMapping(value="/get11")
public List<Bike> get11() {
	return bs.get11();	
}

@GetMapping(value="/get12")
public List<Object> get12() {
	return bs.get12();
}

@GetMapping(value="/get13/{P}")
public List<Bike> get13(@PathVariable int P) {
	return bs.get13(P);
}

@GetMapping(value="/get14")
public int get14() {
	return bs.get14();
}

@GetMapping(value="/get15")
public int get15() {
	return bs.get15();
}

@GetMapping(value="/get16")
public List<Bike> get16() {
	return bs.get16();
}

@GetMapping(value="/get17/{a}")
public List<Bike> get17(@PathVariable String a) throws BrandNotFoundException  {
	return bs.get17(a);
}

@GetMapping(value="/get18")
public List<String> get18() {
	return bs.get18();
}


}
