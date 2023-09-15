package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {    //Function tem duas saídas, nesse exemplo: Product e String

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
