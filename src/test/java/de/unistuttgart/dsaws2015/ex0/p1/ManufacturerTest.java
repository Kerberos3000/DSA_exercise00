package de.unistuttgart.dsaws2015.ex0.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManufacturerTest {

	@Test
	public void test() {
		Manufacturer x = new Manufacturer();
		x.setName("hello");
		assertEquals("hello", x.getName());
		assertTrue(true);
	}

}
