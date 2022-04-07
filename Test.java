package Excep;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age: ");
		int age = sc.nextInt();

	

		VotingApp vp = new VotingApp();
		
				try {
					vp.ageValidation(age);
				} catch (InvalidAgeException e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid age ");
				}
		
	}
}
