package com.roomrockers.productservice.serviceImpl;

import com.roomrockers.productservice.entity.Product;
import com.roomrockers.productservice.repository.ProductRepository;
import com.roomrockers.productservice.service.Service;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ProductServiceImpl implements Service{
	
	@Autowired
	private ProductRepository prodRepository;

	@Override
	public void add(Object obj) {
		prodRepository.save((Product)obj);
		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
