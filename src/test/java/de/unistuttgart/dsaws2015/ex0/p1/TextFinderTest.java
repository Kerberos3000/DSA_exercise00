package de.unistuttgart.dsaws2015.ex0.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextFinderTest {

	@Test
	public void test() {
		//TextFinder.findText(new Product("Sweatshirt", 0, null), null);
		//TextFinder.findText(null, "hello");
//		TextFinder.findText(new Product(null, 0, null), "hello");

		Manufacturer manufacturer = new Manufacturer();
		System.out.println(TextFinder.findText(new Product("Sweatshirt", 15, manufacturer),"DefaultCity"));
		System.out.println(TextFinder.findText(new Product("Sweatshirt", 15, manufacturer),"Sweatshirt"));
		
		assertTrue(true);
	}

}
