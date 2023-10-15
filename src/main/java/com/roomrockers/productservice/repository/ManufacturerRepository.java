package com.roomrockers.productservice.repository;

import com.roomrockers.productservice.entity.Manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

	
	
}
