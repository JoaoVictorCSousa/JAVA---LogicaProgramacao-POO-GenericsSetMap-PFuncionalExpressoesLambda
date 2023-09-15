/*
 * PROGRAMAÇÃO FUNCIONAL
 * 
 * package application;

import java.util.Arrays;

public class Program {
	
	public static int globalValue = 3;
	
	public static void main(String[]args) {
		
		int [] vect = new int [] {3,4,5};
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}
	
	public static void changeOddValues(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0 ) {
				numbers[i] += globalValue;
			}
		}
	}

}*/


/* INTERFACE FUNCIONAL ---> PREDICATE
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {
	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(new ProductPredicate());
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

} */


/*PREDICATE --> MÉTODO ESTÁTICO
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {
	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(Product :: staticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
*/


// MÉTODO NÃO ESTÁTICO
package application;

import java.util.ArrayList;
/*import java.util.List;

import entities.Product;

public class Program {
	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(Product :: nonStaticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
*/
import java.util.List;

/*EXPRESSÃO LAMBDA DECLARADA

import entities.Product;
import java.util.List;
import java.util.function.Predicate;

public class Program {
	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		//Lambda Declarada
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
*/

//Expressão LAMBDA INLINE

import entities.Product;

public class Program {
	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}


