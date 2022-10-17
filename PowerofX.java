package Foundations;
import java.util.Scanner;

public class PowerofX {
	
	static int power(int x,int n) {
		int result=1;
	    while(n>0) {
	        if(n%2!=0){ //odd
	            result*=x;
	        }
	        x=x*x;
	        n=n>>1;
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x;
		System.out.print("Enter the base: ");
		x=sc.nextInt();
		System.out.print("Enter the exponent: ");
		n=sc.nextInt();
		int result=power(x,n);
		System.out.println("Result: "+result);
	}
}
