package com.siddhu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import com.siddhu.dto.Product;
import com.siddhu.service.InventoryService;

@SpringBootApplication
@RestController
public class SiddhuTogglzApplication {
	// autowire FetureManager class of togglz to get the flag values set in application properties files.
    @Autowired
    private FeatureManager manager;

    //Create static varible of Feture that fetched the value of TOGGLZ_APPLIED from the property files.
    public static final Feature TOGGLZ_APPLIED = new NamedFeature("TOGGLZ_APPLIED");

    //autowire service to get the data.
    @Autowired
    private InventoryService service;


    @GetMapping("/products")
    public List<Product> showAvailableProducts() {
    	//check if TOGGLZ_APPLIED is active in property files.
        if (manager.isActive(TOGGLZ_APPLIED)) {
            return applyTogglz(service.getAllProducts());
        } else {
            return service.getAllProducts();
        }
    }

    private List<Product> applyTogglz(List<Product> availableProducts) {
        List<Product> orderListAfterDiscount = new ArrayList<>();
        // Iterating using for loop
        for (int i = 0; i < availableProducts.size(); i++) 
           
        {
        	Product objProduct = availableProducts.get(i);
        	objProduct.setPrice(objProduct.getPrice() - (objProduct.getPrice() * 5 / 100));
        	orderListAfterDiscount.add(objProduct);
        }
 
        return orderListAfterDiscount;
    }


    public static void main(String[] args) {
        SpringApplication.run(SiddhuTogglzApplication.class, args);
    }


}
