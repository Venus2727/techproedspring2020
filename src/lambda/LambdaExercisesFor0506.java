package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercisesFor0506 {

	public static void main(String[] args) {
		// 1) Find the sum of the square of every number in the list
		// 2) Find the average value of all numbers
		
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
		
		System.out.println(sumOfSquares(list));
		System.out.println(averageValue(list));

	}
	
	// Explain the reason of not working of the following
	// list.stream().reduce(0, (x,y)->x*x + y*y);
	
	public static int sumOfSquares(List<Integer> list) {		
		return list.stream()
				   .map(t->t*t)
		           .reduce(0,Integer::sum);		     
    }
	
	
	public static double averageValue(List<Integer> list) {		
		       return list.stream()
						  .mapToDouble(t->t)
				          .average()
				          .orElse(0.0);		           
    }
}
