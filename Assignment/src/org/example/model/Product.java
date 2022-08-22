package org.example.model;

public class Product {
	
	private	int id;
	private	String name;
	private	double price;
			
	 Product(){
		
	}
   public Product (int productId, String productName, double productPrice){
    	id= productId;
    	name= productName;
    	price= productPrice;
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(price);
    	//Product proObj= new Product(10,"Himalaya", 20 );
    	    }
    public int getId() {
    	return id;
    	    }
    public void setID(int productId) {
    	id=productId;
    }
    public String getName() {
    	return name;
    	    }
    public void setName(String productName) {
    	name=productName;
    }
    public double getPrice() {
    	    	return price;
    	    }
    public void setPrice(double productPrice) {
    	price= productPrice;//initializing
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
