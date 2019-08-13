package assignment_3;

public class Calculator {
	private double result;
	public void add(double a, double b){
		this.result = a + b;
		System.out.println(this.result);
	}
	public void add(double a, double b, double c){
		this.result = a + b + c;
		System.out.println(this.result);
	}
	public static void main(String[] args) {
		new Calculator().add(5, 3);
		new Calculator().add(7, 3, 1);
	}
}
