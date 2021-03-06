package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		// Print even numbers in the given list by using "Structured" and "Functional" programming
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		printEvensInListByStructured(list);
		System.out.println();
		printEvensInListByFunctional02(list);
		System.out.println();
		printEvensInListByFunctional03(list);
	}
	
	//"Structured" programming 
	public static void printEvensInListByStructured(List<Integer> list) {		
		for(int w: list) {
			if(w%2==0) {
			    System.out.print(w + " ");
			}
		}
	}
	
	// Type 1:
	public static void printElementsInListByFunctional01(List<Integer> list) {		
			list.stream() // stream() method converts horizontal to vertical [12, 9, 5] ==> 12
			              //                                                                 9
			              //                                                                 5
			    .forEach(t->System.out.print(t + " "));
	}
	
	// Type 2: Method Reference ==> I used the method I created and Java created
	// Method Reference is the simplified form of Lambda Expression
	private static boolean isEven(int number) {
		return number%2==0;
	}
	public static void printEvensInListByFunctional02(List<Integer> list) {		
			list.stream()                                                              
			    .filter(Lambda02::isEven)// To filter elements use filter(). here filter() allows just evens
			    .forEach(System.out::print); 
	}
	// Type 3: Method Reference
	public static void printEvensInListByFunctional03(List<Integer> list) {		
			list.stream() 
			    .filter(t->t%2==0) // Lambda expression: "->" is a special symbol in Lambda Expression
			                       // "t->t%2==0" and "public boolean isEven(int x){ return x%2==0; }" are same
			                       // If inside the parenthesis returns true, it navigate to the next step; otherwise,
			                       // it will use the next list element
			    .forEach(System.out::print);
	}

}
