package Foundations;
import java.util.Scanner;

public class StringPalindrome {
	
	static boolean isPalindrome(String s,int i,int j) {
		if(i==j)
			return true;
		if(s.charAt(i)!=s.charAt(j))
			return false;
		if(i<j)
			return isPalindrome(s,i+1,j-1);
		return true;
	}
	
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		s=sc.next();
		boolean check=isPalindrome(s,0,s.length()-1);
		if(check)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");		
	}
}
