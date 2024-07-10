package com.WebApp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/watch")
@RestController
public class WatchController {
@GetMapping(value="/getWatch") 
public Watch getWatch(@RequestBody Watch w) {
	return w;
}

@GetMapping(value="/getBrand") 
public String getWatchBrand(@RequestBody Watch wa) {
	return wa.getBrand();
}

@GetMapping(value="/getBrandPrice")
public String getBrandPrice(@RequestBody Watch wt) {
	return wt.getBrand()+" = "+wt.getPrice();
}

@GetMapping(value="/getWatches")
public List<Watch> getWatches(@RequestBody List<Watch> w) {
	return w;
}

@GetMapping(value="/getSeparateDet")
public String getSeparate(@RequestBody List<Watch> w) {
	return w.get(0).getBrand();
}



}
