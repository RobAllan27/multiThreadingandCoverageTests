package coverageAssessment;

public class FibonacciTermGenerator {

	// Method 1 
	
	public int getNthFibonacciNumber(int numberOfLoops) {
		int tempn = 123;
		int a, b, sum = 0, n;
		a = b = 1;
		for (n = 1; n <= numberOfLoops; n++) {
			//System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}
	
	// Method 2
	
	public int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci; // Fibonacci number
	}
	
	// Method 3  - using recursion
	public int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
 
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
	}
	
	// Method 4 - return stringType
	public boolean CheckStringType(String inString) {
	     switch (inString) {
	         case "case 1":
	             System.out.println("We got Case 1");
	             return true;
	         case "case 2":
	         case "case 3":
	         case "case 4":
	        	 System.out.println("We got Case 2/3/4");
	             return true;
	         default:
	        	 System.out.println("Some other Case");
	        	 return true;
	        	 }
	}
}
