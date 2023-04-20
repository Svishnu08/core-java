package day7;
import java.util.Scanner;

public class BicycleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,company;
		int no;
		System.out.println("Enter Bicycle No");
		no =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bicycle Name");
		name = sc.nextLine();
		System.out.println("Enter Bicycle Company");
		company = sc.nextLine();
		
		Bicycle obj = new Bicycle();
		obj.setBicycleName(name);
		obj.setBicycleNo(no);
		obj.setBicycleCompany(company);

	}

}
