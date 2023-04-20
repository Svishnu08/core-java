package day5;

public class Benz extends Car{
	void symbol() {
        System.out.println("Symbol");
	}
    void gear() {
        System.out.println("Gear");
    }
	public static void main(String[] args) {
		Benz b = new Benz();
		b.clutch();
		b.color();
		b.speed();
		b.symbol();
		b.gear();

	}

}
