package assessment;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Worker {
	public String name;
	public int days;
	public char type;
	
	public Worker(){
		
	}
	
	public Worker(String name, int salary, char type) {
		super();
		this.name = name;
		this.days = salary;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	public static void main(String[] args) {
		
		Worker worker1=new Worker("sathish",5,'w');
		Worker worker2=new Worker("kamal",5,'d');
		Worker worker3=new Worker("vijay",7,'w');
		Worker worker4=new Worker("kiran",6,'d');
		
		DailyWorker dw=new DailyWorker();
		SalariedWorker sw=new SalariedWorker();
		dw.pay(worker2.getName(),worker2.getDays());
		sw.pay(worker1.getName());
		dw.pay(worker4.getName(),worker4.getDays());
		sw.pay(worker3.getName());
	}
}
//	Create a class called Worker. Write classes DailyWorker and 
//SalariedWorker that inherit from Worker. Every worker has a name and a 
//salary. Write method pay() to compute the week pay of every worker.  
//A Daily worker is paid on the basis of the number of days she/he works. 
//The salaried worker gets paid the wage for 40 hours a week no matter what
//the actual worked hours are.  Create a few different types of workers and
//print all the details of  the workers(name, salary and D/W (indicating 
//		the type of worker)) in sorted order of the salary.