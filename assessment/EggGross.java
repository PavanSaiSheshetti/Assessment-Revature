package assessment;

import java.util.Scanner;

public class EggGross {
	public void calciGDR(int n) {
		// TODO Auto-generated method stub
		int temp=n%144;
		int gross=n/144;
		int dozen=temp/12;
		int remaining=temp%12;
		System.out.println("Your number of eggs is "+gross+
				" gross, "+dozen+ " dozen and "+remaining);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Enter number of eggs");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		EggGross eg=new EggGross();
		eg.calciGDR(N);
		
	}


}
//Consider user has N eggs. Then display the no of eggs in gross 
//(144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) 
//and the no of eggs that is left out remaining. The total no of eggs can be 
//got as input through console. The program should display how many gross, 
//how many dozen, and how many left over eggs the user has. 
//For example, if the input is 1342 eggs, then the program should respond with 
//	  Your number of eggs is 9 gross, 3 dozen, and 10 
