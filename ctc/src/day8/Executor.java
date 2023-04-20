package day8;

public class Executor {

	public static void main(String[] args) {
		Base obj = new Base();
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		
		obj.varDefault = 61;
		obj.methodDefault();
		
		obj.varProtected = 101;
		obj.methodProtected();
		
		obj.varPublic = 41;
		obj.methodPublic();

	}

}
