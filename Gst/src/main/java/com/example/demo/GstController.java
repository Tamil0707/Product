package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class GstController {
	@Autowired
	GstService gService;
	@GetMapping("/getDetails")
	public String postAllDetails(@RequestBody List<Gst> li) {
		return gService.postAllDetails(li);	
		
	}
	@GetMapping("/detailsByHsn/{num}")
	public int getByHsn(@PathVariable int num) {
		return gService.getByHsn(num);
	}

}
