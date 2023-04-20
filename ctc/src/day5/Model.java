package day5;

public class Model extends Benz{
	void price() {
		System.out.println("Price");
	}
    void mileage() {
    	System.out.println("Mileage");
    }
    void number() {
    	System.out.println("Number");
    }
	public static void main(String[] args) {
		Model m = new Model();
		//grandparent class
		m.clutch();
		m.color();
		m.speed();
		//parent class
		m.mileage();
		m.number();
		m.price();
		//child class
		m.gear();
		m.symbol();
		
	}

}
