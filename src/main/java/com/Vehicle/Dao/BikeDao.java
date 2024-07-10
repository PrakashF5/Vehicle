package com.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Vehicle.Entity.Bike;
import com.Vehicle.Repository.BikeRepository;

@Repository
public class BikeDao {
@Autowired
BikeRepository br;

public String postDetails(List<Bike> b) {
	 br.saveAll(b);
	 return "Bike details posted successfully";
}

public List<Bike> getDetails() {
	return br.findAll();
}

public List<Bike> get1(String a) {
	return br.get1(a);
}

public List<Object> get2() {
	return br.get2();
}

public List<Bike> get3(int a, int b) {
	return br.get3(a,b);
}

public List<Bike> get4(int a) {
	return br.get4(a);
}

public int get5() {
	return br.get5();
}

public int get6() {
	  return br.get6();
	}

public List<Bike> get7() {
	return br.get7();
}

public List<Bike> get8() {
	return br.get8();
}

public int get9() {
	return br.get9();
}

public List<Object> get10() {
	return br.get10();	
}	

public List<Bike> get11() {
	return br.get11();	
}	

public List<Object> get12() {
	return br.get12();
}

public List<Bike> get13(int P) {
	return br.get13(P);
}

public int get14() {
	return br.get14();
}

public int get15() {
	return br.get15();
}

public List<Bike> get16() {
	return br.get16();
}

public List<Bike> get17(String a) {
	return br.get17(a);
}

}
