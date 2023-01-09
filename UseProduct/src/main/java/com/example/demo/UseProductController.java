package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProductController {
	@Autowired
	
	RestTemplate resttemp;
    @GetMapping(value="getAllWithGst")
    public List<Product>getDetailsWithGst(){
    	String url1="http://localhost:8080/getAllDetails";
    	String url2="http://localhost:8081/detailsByHsn/";
    	ResponseEntity<List<Product>>response1=resttemp.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<Product>>(){});
	     List<Product>products=response1.getBody();
	     products.forEach(x->{
	    	 int hsn=x.getHsn();
	    	 ResponseEntity<Integer>response2=resttemp.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
	    	 int percentage=response2.getBody();
	    	 x.setQuantity(x.getQuantity());
	     });
	     return products;
    }
}
