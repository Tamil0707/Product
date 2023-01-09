package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GstRepository extends JpaRepository <Gst,Integer>{
	@Query(value="Select percentage from gst_info where hsn=:a",nativeQuery=true)
	public int setByHsn(@Param("a")int a);

}
