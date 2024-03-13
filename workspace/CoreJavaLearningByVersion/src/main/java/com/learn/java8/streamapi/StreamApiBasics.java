package com.learn.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  


public class StreamApiBasics {

	public void displayStream() {
		try {
			List<Integer> num = Arrays.asList(1,1,3,3,4,58,6,7,87);
			
			Stream<Integer> streamData = num.stream().sorted();
			streamData.forEach(i -> System.out.println(i));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void filterUsingStream() {
		List<Product> productsList = new ArrayList<>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",340000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        List<Float> productPriceList2 = productsList.stream()
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)     // fetching price
                                     
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
	}
	
	
	
	
}
