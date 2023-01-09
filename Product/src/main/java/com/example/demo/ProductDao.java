package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;
	public String printAll(List<Product> pro){
		 proRepo.saveAll(pro);
		 return"Success";
	}
	public List<Product> getAllDetails() {
		return proRepo.findAll();
	}


}
