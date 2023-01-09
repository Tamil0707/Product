package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	public String printAll(List<Product> pro){
		return proDao.printAll(pro);
	}
	public List<Product> getAllDetails() {
		return proDao.getAllDetails();
	}
	

}
