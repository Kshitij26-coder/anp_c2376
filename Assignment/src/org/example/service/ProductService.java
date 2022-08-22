package org.example.service;

import org.example.model.Product;

public class ProductService {
	public void increasePrice(int id, String name, double price){
		
		System.out.println("id:"+id);
		System.out.println("price:"+price);
		System.out.println("name:"+name);
		double newPrice= price+100;
		System.out.println("newprice:"+newPrice);
		
	}
	public static void main(String[] args) {
		System.out.println();
	}
		/*public void increasePrice(Product productType) {
			Product p1 = productType;
			Product proObj= new Product(10,"Himalaya", 20 );
			System.out.println(p1);
			int a= proObj.getId();
			String b= proObj.getName();
			double c= proObj.getPrice();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			double newPrice=c+100;
			System.out.println("newprice:"+newPrice);
		}
		*/
		
	
	

}	     
	   
   
    	
    	
    
	
       
	


