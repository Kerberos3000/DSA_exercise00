package de.unistuttgart.dsaws2015.ex0.p1;

public class TextFinder {
	
	/**
	 * This methods search for a specific string in the given class Product and it's 
	 * corresponding class Manufacturer.
	 * If the string is found, the methods returns the corresponding {@link ProductFact} enum.
	 * If the string is not present in the given classes or an invalid input parameter is given, 
	 * the function throws an {@link IllegalArgumentException}.
	 * 
	 * @param product {@link Product} which will be searched for the string.
	 * @param string {@link String} which is searched in the product.
	 * @return {@link ProductFact} The enum which indicates the type of the string.
	 * @throws IllegalArgumentException if the input values are not correct or the string is not
	 * present in the given classes.
	 */
	public static ProductFact findText(Product product, String string) { 

		// check for invalid input parameters (null)
		if (string==null) {
			throw new IllegalArgumentException("null String not allowed!");
		}
		if (product==null) {
			throw new IllegalArgumentException("null Prodcut not allowed!");
		}
		if (product.getManufacturer()==null) {
			throw new IllegalArgumentException("Product is not connected to a Manufacturer");
		}
		
		// check the strings of the class Products
		if (product.getName() == string) {
			return ProductFact.NAME;
		}
		if (product.getDescription() == string) {
			return ProductFact.DESCRIPTION;	
		}
		
		// check the strings of the class Manufacturer
		if (product.getManufacturer().getName() == string) {
			return ProductFact.MANUFACTURER_NAME;	
		}
		if (product.getManufacturer().getStreet() == string) {
			return ProductFact.MANFACTURER_STREET;	
		}
		if(product.getManufacturer().getCity() == string) {
			return ProductFact.MANUFACTURER_CITY;	
		}
		if(product.getManufacturer().getCountry() == string) {
			return ProductFact.MANUFACTURER_COUNTRY;	
		}
		throw new IllegalArgumentException("String not found!");
	}
}
