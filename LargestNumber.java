package Foundations;

import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber {
	
	static String largestInteger(int arr[]) {
		int n=arr.length;
		String[] s=new String[n];
		for(int i=0;i<n;i++) {//Converting integer array to String array
			s[i]=Integer.toString(arr[i]);
		}
		Arrays.sort(s);//sorting in lexicographically ascending order
		String result="";
		for(int i=n-1;i>=0;i--) {
			result+=s[i];
		}
		return result;
	}
	
	public static void main(String[]args) {
		int n;
		System.out.print("Enter the length of array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		String l=largestInteger(arr);
		System.out.println(l);
	}
}
