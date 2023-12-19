package com.siddhu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.siddhu.dto.Product;

@Service
public class InventoryService {

    public List<Product> getAllProducts() {
    	List<Product> objProductLst = new ArrayList<Product>();
    	Product objProduct1 = new Product();
    	Product objProduct2 = new Product();
    	Product objProduct3 = new Product();
    	
    	objProduct1.setId(1);
    	objProduct1.setName("Product1");
    	objProduct1.setPrice(1000);
    	
     	objProduct2.setId(2);
    	objProduct2.setName("Product2");
    	objProduct2.setPrice(2000);
    	
     	objProduct3.setId(3);
    	objProduct3.setName("Product3");
    	objProduct3.setPrice(3000);
    	
    	
    	objProductLst.add(objProduct1);
    	objProductLst.add(objProduct2);
    	objProductLst.add(objProduct3);
    	
    	return objProductLst;
        
    }
}
