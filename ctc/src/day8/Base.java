package day8;

public class Base {
	int varDefault = 60;
	public int varPublic = 80;
	private int varPrivate = 90;
	protected int varProtected = 120;
	
	void methodDefault() {
		System.out.print("Default acess base class");
		System.out.print("Default variable:" + varDefault);
	}
	public void methodPublic() {
		System.out.println("Public acess base class");
		System.out.println("Public variable" + varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private acess base class");
		System.out.print("Private variable "+ varPrivate);
	}
	protected void methodProtected() {
        System.out.println("Protected acess base class");
        System.out.println("Proteced variable" + varProtected);
	}
	

}
