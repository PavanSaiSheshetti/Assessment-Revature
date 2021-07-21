package assessment;

public class DailyWorker extends Worker{
	int perDayPay=500;
	int salary;
	String type="Daily paid";
	public void pay(String name,int days) {
		salary=days*perDayPay;
		System.out.println("Name:"+name+" Salary: "+salary+" type: "+type);
	
	}
}
