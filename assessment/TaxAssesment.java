package assessment;

import java.util.Scanner;

public class TaxAssesment {
	public void taxCalci(long income, String gender) {
		// TODO Auto-generated method stub
		if(gender.equals(gender)) {//for general
			if(income>=0 && income<=180000) {
				System.out.println("no tax and income is"+income);
			}
			else if(income>=180001 && income<=500000) {
				System.out.println("10% tax is Applicable and income is"+income*90/100);
			}
			else if(income>=500001 && income<=800000) {
				System.out.println("20% tax is applicable and income is"+income*80/100);
			}
			else if(income>800000) {
				System.out.println("305 tax is applicable and tax is "+income*70/100);
			}
			else {
				System.out.println("Invalid income");
			}
		}
		else if(gender.equals(gender)){//for female
			if(income>=0 && income<=190000) {
				System.out.println("no tax and income is"+income);
			}
			else if(income>=190001 && income<=500000) {
				System.out.println("10% tax is Applicable and income is"+income*90/100);
			}
			else if(income>=500001 && income<=800000) {
				System.out.println("20% tax is applicable and income is"+income*80/100);
			}
			else if(income>800000) {
				System.out.println("30% tax is applicable and tax is "+income*70/100);
			}
			else {
				System.out.println("Invalid income");
			}
		}
		else {
			System.out.println("Invalid Gender");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your income");
		long income=sc.nextLong();
		System.out.println("enter your gender Male or Female");
		String gender=sc.next();
		TaxAssesment ta=new TaxAssesment();
		ta.taxCalci(income,gender);
	}
}

//1.	WAP to calculate the tax slabs. Input income and gender and calculate the tax accordingly.
//
//
//Tax slabs for general 
//0 to 180000              No tax
//180001 to 500000  10%
//500001 to 800000  20%
//Above 800000         30%
//
//
//Income tax slabs 2011-2012 for Women
//0 to 190000               No tax
//190001 to 500000   10%
//500001 to 800000   20%
//Above 800000          30%
//
//Write if statements to achieve this.
//Make sure that you indent the code well so that it is readable. 


