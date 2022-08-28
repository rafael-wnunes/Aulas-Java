package application;

import java.util.Locale;
import java.util.Scanner;
import entities.calculo_nota;

public class program4 {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	calculo_nota calculo = new calculo_nota();
	calculo.name = sc.nextLine();
	calculo.n1 = sc.nextDouble();
	calculo.n2 = sc.nextDouble();
	calculo.n3 = sc.nextDouble();
	
	System.out.printf("FINAL GRADE = %.2f%n", calculo.finalGrade());
	
	if (calculo.finalGrade() < 60) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", calculo.missingPoints());
	}
	else {
		System.out.println("PASS");
	}
	
	sc.close();
	}
}