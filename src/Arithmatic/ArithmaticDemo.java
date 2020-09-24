package Arithmatic;

public class ArithmaticDemo {
	
	public int add(int a, int b) {
		int sum =a+b;
		return sum;
	}
	public int subtract(int a, int b) {
		int subtract =a-b;
		return subtract;
	}
	
	public int divide(int a, int b) {
		int divide =a/b;
		return divide;
	}
	
	public int mod(int a, int b) {
		int mod =a%b;
		return mod;
	}
	
	
	public static void main(String[] args) {
		ArithmaticDemo a= new ArithmaticDemo();
		System.out.println("Sum of two numbers: "+ a.add(50,60));
		System.out.println("Subtraction of two numbers: "+a.subtract(15, 20));
		System.out.println("Divide of two numbers: "+ a.divide(10, 5));
		System.out.println("Remainder of two numbers: "+a.mod(24, 5));
		

	}
	

}
