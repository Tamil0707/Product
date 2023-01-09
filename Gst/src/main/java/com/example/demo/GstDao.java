package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class GstDao {
	@Autowired
	GstRepository gRepository;
	public String postAllDetails(List<Gst>li) {
		gRepository.saveAll(li);
		return "Success";
	}
	public int getByHsn(int a) {
	   return gRepository.setByHsn(a);
	}

}
