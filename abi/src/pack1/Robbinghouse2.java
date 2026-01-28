package pack1;

import java.util.Scanner;

public class Robbinghouse2 {
	static int robed(int[] arr,int s,int e) {
		 int[] dp=new int[arr.length-1];
		 if(arr.length==1) {
			 return arr[0];
		 }
		 dp[0]=arr[s];
		 dp[1]=Math.max(arr[s+1],dp[0]);
		 for(int i=2;i<e;i++) {
			 s++;
			 dp[i]=Math.max(dp[i-1],dp[i-2]+arr[s]);
		 }
		return dp[dp.length-1]; 
	 }
	public static void main(String[] args) {
		Scanner ah=new Scanner (System.in);
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		int b=Math.max(robed(arr,0,n-2),robed(arr,1,n-1));
		System.out.print(b);
	}

}
