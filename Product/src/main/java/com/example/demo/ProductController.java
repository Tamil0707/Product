package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class ProductController {
	@Autowired
	ProductService proSer;
	
	@PostMapping(value="/addDetails")
	public String printAll(@RequestBody List<Product> pro){
		return proSer.printAll(pro);
	}
	@GetMapping(value="/getAllDetails")
	public List<Product> getAllDetails() {
		return proSer.getAllDetails();
	}
}
