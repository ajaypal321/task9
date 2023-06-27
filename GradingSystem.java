package com.task.nine;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter your number");
		int num =sc.nextInt();
		
		if(num>100) {
			System.out.println("Invalid input");
		} else if (num==100){
			System.out.println("Grade is: S");
		} else if (num>=90){
			System.out.println("Grade is: A");
		} else if (num>=80){
			System.out.println("Grade is: B");
		} else if (num>=70){
			System.out.println("Grade is: C");
		} else if (num>=60){
			System.out.println("Grade is: D");
		} else if (num>=50){
			System.out.println("Grade is: E");
		} else {
			System.out.println("Fail");
		}
	}

}
