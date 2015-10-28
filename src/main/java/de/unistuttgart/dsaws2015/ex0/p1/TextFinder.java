package de.unistuttgart.dsaws2015.ex0.p1;

public class TextFinder {
	
	/**
	 * This methods search for a specific string in the given class Product and it's 
	 * corresponding class Manufacturer.
	 * If the string is found, the methods returns the corresponding {@link ProductFact} enumeration.
	 * If the string is not present in the given classes or an invalid input parameter is given, 
	 * the function throws an {@link IllegalArgumentException}.
	 * 
	 * @param product {@link Product} which will be searched for the string.
	 * @param string {@link String} which is searched for in the attributes of the product class and its corresponding manufacturer class.
	 * @return {@link ProductFact} The enumeration which indicates the type of the string.
	 * @throws IllegalArgumentException if the arguments are invalid or the string is not
	 * present in the given classes.
	 */
	public static ProductFact findText(Product product, String string) { 

		// check for invalid input parameters (null)
		if (string==null||product==null)
			throw new IllegalArgumentException("Invalid product or string argument");
		if (product.getManufacturer()==null) {
			throw new IllegalArgumentException("Product is not connected to a Manufacturer");
		}
		
		// check the strings of the class Products
		if (product.getName() == string)
			return ProductFact.NAME;
		else
			if (product.getDescription() == string)
				return ProductFact.DESCRIPTION;	
		    // check the strings of the class Manufacturer
			else
				if (product.getManufacturer().getName() == string)
						return ProductFact.MANUFACTURER_NAME;	
				else
					if (product.getManufacturer().getStreet() == string)
						return ProductFact.MANFACTURER_STREET;	
					else
						if(product.getManufacturer().getCity() == string)
							return ProductFact.MANUFACTURER_CITY;	
						else
							if(product.getManufacturer().getCountry() == string)
								return ProductFact.MANUFACTURER_COUNTRY;	
							else
								throw new IllegalArgumentException("String not found!"); // no string was found in Product and Manufacturer:
			}
	}
