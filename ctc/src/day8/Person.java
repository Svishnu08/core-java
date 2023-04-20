package day8;

public class Person {
	public Person () {
		System.out.print("Default constructor");
	}
     private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + "]";
	}
     public Person (int number) {
    	 this.number = number;
     }
}