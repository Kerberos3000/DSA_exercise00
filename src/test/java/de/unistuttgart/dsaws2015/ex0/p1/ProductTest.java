package de.unistuttgart.dsaws2015.ex0.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void test() {
		
		Manufacturer HappyShopping = new Manufacturer();
		HappyShopping.setName("HappyShopping");
		Product Shorts = new Product("Short", 20, HappyShopping);
		Product Shirts = new Product("Shirt", 15, HappyShopping);

		assertEquals("Shirt",Shirts.getName());
		assertEquals("HappyShopping",Shorts.getManufacturer().getName());
		assertEquals("DefaultCountry",Shirts.getManufacturer().getCountry());
		assertTrue(true);
	}

}
