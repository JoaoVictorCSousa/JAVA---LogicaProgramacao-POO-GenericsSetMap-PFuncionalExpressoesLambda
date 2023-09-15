package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//função map aplica uma função a todos os elementos de uma stream.
		// Stream --> sequência de dados
		
		//tem que converter a list para String(chamando map), depois converter a String de volta pra lista(collector)
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Método Estático----------------
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//Método não estático---------
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Expressão Lambda Declarada ---------
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		//Função Lambda Inline -------------
		//List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		//names.forEach(System.out::println);
		
		
	//}

//
	}}
	
		
		
		
		
