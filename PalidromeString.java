package com.task.nine;
import java.util.Scanner;
public class PalidromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		
if (s.equals(rev)) {
	System.out.println("Palindrome String");
}else {
	System.out.println("Not Palindrome String");
}
	}

}
