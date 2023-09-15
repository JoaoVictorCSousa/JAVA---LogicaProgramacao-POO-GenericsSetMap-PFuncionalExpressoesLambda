package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {
	
	public static void main(String []args) {
		
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case",80.90));
		
		//double aumento = 1.1;
		
		//Expressão lambda declarada
		//Consumer<Product> cons = p -> {
			//p.setPrice(p.getPrice()* aumento);
		//};
		
		//list.forEach(cons);
		
		//Expressão lambda inline
		//list.forEach(p -> p.setPrice(p.getPrice()* aumento));
		
		// list.forEach(new PriceUpdate());
		
		//Método estático
		//list.forEach(Product::staticPriceUpdate);
		
		//Método não estático
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//list.forEach(System.out::println);
		
		
		
		
		//QUESTÃO: FAZER UM PROGRAMA QUE, A PARTIR DE UMA LISTA DE PRODUTOS, CALCULE A SOMA DOS PREÇOS
		//SOMENTE DOS PRODUTOS CUJO NOMES COMEÇAM COM "T".
		
		ProductService ps = new ProductService();
		
		//double sum = ps.filteredSum(list);
		
		//Aprimorado código
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T' );
		
		System.out.println("Sum = " + String.format("%.2f", sum));
				
}

	}
