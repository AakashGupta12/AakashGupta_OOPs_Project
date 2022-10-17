package Foundations;
import java.util.Scanner;

public class TwoSum {
	
	static int[] findNum(int arr[],int target) {
		int i=0,j=arr.length-1;
		while(i!=j){
			if(arr[i]+arr[j]==target)
				return new int[]{i,j};
			else if(arr[i]+arr[j]<target)
				i++;
			else
				j--;
		}
		return new int[]{ };
	}
	
	public static void main(String[] args) {
		int arr[]= {1,5,8,10,13};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a target: ");
		int target=sc.nextInt();
		int ans[]=findNum(arr,target);
		if(ans.length==0)
			System.out.println("No numbers found");
		else
			System.out.println("Numbers found at indices "+ans[0]+" and "+ans[1]);
	}
}
