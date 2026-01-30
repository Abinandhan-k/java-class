package pack1;

import java.util.*;

public class Coinchange2 {
 static int totcom(int[] arr,int amt) {
	 Arrays.sort(arr);
	 int dp[]=new int[amt+1];
	 Arrays.fill(dp,amt+1);
	 dp[0]=0;
	 for(int j=1;j<dp.length;j++) {
		 for(int i:arr) {
			 if(i>j) {
				 break;
			 }
			 else {
				 dp[j]=Math.min(dp[j-i]+1,dp[j]);
		  }	 }
		 }

	 return dp[amt]>amt?-1:dp[amt];
 }
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	int amt=ah.nextInt();
	System.out.print(totcom(arr,amt));
}
}
