package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class GstService {
	@Autowired
	GstDao gDao;
	public String postAllDetails(List<Gst> li) {
		return gDao.postAllDetails(li);
	}
	public int getByHsn(int a) {
		return gDao.getByHsn(a);
	}

}
