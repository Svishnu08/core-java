package day7;

public class Bicycle {
	private String bicycleName;
	private int bicycleNo;
	private String bicycleCompany;
	public Bicycle () {
		System.out.println("Bicycle Symbol");
	}
	public Bicycle(String bicycleName, int bicycleNo, String bicycleCompany) {
		System.out.println("Parameterized constructor");
		this.bicycleCompany = bicycleCompany;
		this.bicycleName = bicycleName;
		this.bicycleNo = bicycleNo;
	}
	public String getBicycleName() {
		return bicycleName;
	}
	public void setBicycleName(String bicycleName) {
		this.bicycleName = bicycleName;
	}
	public int getBicycleNo() {
		return bicycleNo;
	}
	public void setBicycleNo(int bicycleNo) {
		this.bicycleNo = bicycleNo;
	}
	public String getBicycleCompany() {
		return bicycleCompany;
	}
	public void setBicycleCompany(String bicycleCompany) {
		this.bicycleCompany = bicycleCompany;
	}
	@Override
	public String toString() {
		return "Bicycle [bicycleName=" + bicycleName + ", bicycleNo=" + bicycleNo + ", bicycleCompany=" + bicycleCompany
				+ "]";
	}

}
 