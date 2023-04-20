package day5;

public class Car {
	public void speed() {
		System.out.println("Speed");
	}
	public void clutch() {
		System.out.println("Clutch");
	}
    public void color() {
    	System.out.println("Color")
    }
	public static void main(String[] args) {
              Car c = new Car();
              c.clutch();
              c.color();
              c.speed();

	}

}
