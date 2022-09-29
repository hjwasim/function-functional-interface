package functions;

import java.util.function.Function;

public class Demo3 {
	public static void main(String[] args) {
		// Example 1:
		// Here, first i want to square a number and add 10 with it and subtract by 10 using Fucntion Interface.
		 
		Function<Double, Double> f = i -> Math.pow(i, 2);
		Function<Double, Double> f1 = i -> i+10;
		Function<Double, Double> f2 = i -> i-2;
		
		// first apply method pass 2 to f and it return 4, and andthen pass 4 to f1, it return 4+10 = 14
		// and again andthen method pass to f2, here its subtract 14 by,finally we get 12.
		// Outer to Inner
		System.out.println(f.andThen(f1.andThen(f2)).apply(2.0)); // 12.0
		
		// In compose method,  first apply method pass 2.0 to f1 and it return 10+2 = 12, and compose method pass the 12 to f1, 
		// its square up and return 144.0
		// its exact opposite of andThen()
		// Inner to Outer
		System.out.println(f.compose(f1).apply(2.0)); // 144.0
	}
}
