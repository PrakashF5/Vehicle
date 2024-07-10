package com.Vehicle.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Vehicle.Dao.BikeDao;
import com.Vehicle.Entity.Bike;
import com.Vehicle.Exception.BrandNotFoundException;

@Service
public class BikeService {
@Autowired
BikeDao bd;

public String postDetails(List<Bike> b) {
	return bd.postDetails(b);
}

public List<Bike> getDetails() {
	return bd.getDetails();
}

public List<Bike> get1(String a) {
	return bd.get1(a);
}

public List<Object> get2() {
	return bd.get2();
}

public List<Bike> get3(int a, int b) {
	return bd.get3(a,b);
}

public List<Bike> get4(int a) {
	return bd.get4(a);
}

public int get5() {
	return bd.get5();
}

public int get6() {
	  return bd.get6();
	}

public List<Bike> get7() {
	return bd.get7();
}

public List<Bike> get8() {
	return bd.get8();
}

public int get9() {
	return bd.get9();
}

public List<Object> get10() {
	return bd.get10();	
}	

public List<Bike> get11() {
	return bd.get11();	
}

public List<Object> get12() {
	return bd.get12();
}

public List<Bike> get13(int P) {
	return bd.get13(P);
}

public int get14() {
	return bd.get14();
}

public int get15() {
	return bd.get15();
} 

public List<Bike> get16() {
	return bd.get16();
}

public List<Bike> get17(String a) throws BrandNotFoundException {
	
if(bd.get17(a).isEmpty()) {
	throw new BrandNotFoundException ("This brand is not found in db");
}
else {
	return bd.get17(a);
   }
 }

public List<String> get18() {
	List<Bike> b = bd.getDetails();
	List<String> c = b.stream().map(x->x.getBrand()+" "+x.getPrice()).collect(Collectors.toList());
	return c;

}


}
