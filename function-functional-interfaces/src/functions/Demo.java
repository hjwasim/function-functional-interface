package functions;

import java.util.Scanner;
import java.util.function.Function;

public class Demo {

	//	Function is a java-functional interface present in util.function package,
	//  which contains only one abstract methods named 'apply'. 
	//	Best uses in when we want do some operation like, which take one input, and doing some operation and 
	//	it return the output in another type or the same type, it must return something
	//	it always take one parameter in expression, which is Input type(T) and its Return type (R)
	//	it returns always based on the return type we given in the definition.
	//	use only if u want return something using function.

	public static void main(String[] args) {
		// Function - Functional Interface
		
		// Example 1- Calculate string length based using function interface.
		Function<String, Integer> f = s -> s.length();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int length = f.apply(str);
		System.out.println(length);
		
	}
}
