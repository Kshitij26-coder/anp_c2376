package org.example.view;
import org.example.service.ProductService;
import org.example.model.Product;
public class ProductView {
    public static void main (String[] args) {
    	
    	// Product pObj = new Product(10,"DairyMilk", 100);   	
    	ProductService prosObj= new ProductService();
        prosObj.increasePrice(10,"DairyMilk",100);
    	//prosObj.increasePrice();
    	
    	
    	
    }
}
