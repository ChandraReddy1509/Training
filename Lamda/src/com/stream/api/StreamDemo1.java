package com.stream.api;
import java.lang.Package;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.stream.api.Product;

public class StreamDemo1 {
	public static void main(String[] args) {

	
		List<Product> plist=new ArrayList<>();
			
		
		plist.add(new Product(100,"tv",100,600.0));
		plist.add(new Product(102,"tv1",10,6000.0));
		plist.add(new Product(101,"tv2",101,60.0));
		
	
		//count total onj
		System.out.println("Total:" + plist.stream().count());
		//display
//		plist.stream().forEach(Product-> System.out.println(Product));
//		//display all product names in uppercase
//		plist.stream().map(product-> product.getProductName1().toUpperCase()).forEach(product->System.out.println(product));
//		System.out.println(plist.stream().map(p->p.getStock1()).collect(Collectors.summingInt(Integer::intValue)));
//		
	 System.out.println(plist.stream().map(product->product.getPrice1()).collect(Collectors.summingDouble(Double::doubleValue)));
	
		
		
		//plist.stream().map(product->product.getPrice1().Collect(Collectors.averagingInt(Integer::intValue)));
	}
}