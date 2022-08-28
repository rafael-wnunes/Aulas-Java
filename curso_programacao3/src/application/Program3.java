package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Salary;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		Salary salary = new Salary();		
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Gross salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.println();		
		System.out.println("Employee: " + salary);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salary.increaseSalary(percentage);
		
		System.out.println();		
		System.out.print("Update data: " + salary);
		
		sc.close();
	}
}