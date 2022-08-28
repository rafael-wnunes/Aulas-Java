package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Holder;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();		
		System.out.print("There is an initial deposit value (y/n)? ");
		int answer = sc.nextInt();
		
		double balance = 0;
		
		if (answer == 1) {		
		System.out.print("Enter initial deposit value: ");
		balance = sc.nextDouble();	
		}		
		
		Holder holder = new Holder(number, name, balance);		
			
		System.out.println();
		System.out.print(holder);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		holder.deposit(amount);
		
		System.out.print(holder);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		holder.withdraw(amount);		
		
		System.out.print(holder);
		
		sc.close();
	}

}