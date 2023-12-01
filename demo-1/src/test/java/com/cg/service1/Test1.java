package com.cg.service1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.entity.Product;
import com.cg.repository.ProductRepository;
import com.cg.service.ProductService;

@ExtendWith(MockitoExtension.class)
public class Test1   {

	
	
	@Mock
	ProductRepository prepository;
	
	@InjectMocks
	ProductService pservice;
	
	@Test
	public void testAddProducts() {
		
		Product product = new Product();
		product.setId(120);
		product.setProductName("laptop");
		product.setStock(124);
		product.setPrice(20.0);
		
		when(prepository.save(product)).thenReturn(product);
		
		String message=pservice.addProduct(product);
		assertNotNull(message);
		assertEquals("Product Added Successfully", message);
		
		
}
}