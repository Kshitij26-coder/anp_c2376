package question4.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import question4.model.Product;

public class Main {
	public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<Product>();

      
        productList.add(new Product(1, "Watch", 200));
        productList.add(new Product(2, "Earphone", 300));
        productList.add(new Product(3, "Mobile", 400));
        productList.add(new Product(4, "TV", 500));
        productList.add(new Product(5, "Laptop", 600));


  
        Product maxPriceProduct = productList.stream()
                        .max((product1, product4)->
                        product1.getProductPrice() > product4.getProductPrice() ? 1: -1).get();
        System.out.println("Max price product = "+maxPriceProduct);

     
        Product minPriceProduct = productList.stream()
                .min((product2, product3)->
                product2.getProductPrice() > product3.getProductPrice() ? 1: -1).get();
        System.out.println("Min price product = "+minPriceProduct);
        
        Stream<String> stream = Stream.of(
                "Watch", "Earphone", "Mobile", "TV","Laptop");
        stream.filter(str -> str.startsWith("S"))
        .forEach(System.out::println);
            
   
     
      
    
    }
}