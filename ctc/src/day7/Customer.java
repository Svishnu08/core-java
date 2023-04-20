//constructor
package day7;

public class Customer {
	Customer(){
		System.out.println("First class");
	}
	void two() {
		System.out.println("Second class");
	}

	public static void main(String[] args) {
		Customer obj = new Customer();
		System.out.println("Third class");
		obj.two();

	}

}
