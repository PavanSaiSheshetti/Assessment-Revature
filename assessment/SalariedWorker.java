package assessment;

public class SalariedWorker extends Worker{
	int perHourPay=100;
	int salary;
	String type="Weekly paid";
	public void pay(String name) {
		salary=40*perHourPay;
		System.out.println("Name:"+name+" Salary: "+salary+" type: "+type);
	}
}
