package day8.second;

import day8.Base;

public class Executor {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodPublic();
		
		b.varPublic=22;
		b.methodPublic();

	}

}
