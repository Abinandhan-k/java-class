package pack1;

import java.util.*;

public class Longestsubseqinnums {
	public static int longestsubseq(int arr[]) {
		int dp[]=new int[arr.length];
		Arrays.fill(dp,1);//basecase
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i],dp[j]+1);
				}
			}
			//System.out.print(Arrays.toString(dp));
		}
		int max=0;
		for(int a:dp) {
			max=Math.max(a,max);
		}
		return max;
	}
	public static void main(String[] args) {
	    Scanner ah=new Scanner(System.in);
	    int  n=ah.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=ah.nextInt();
	    }
	    System.out.print(longestsubseq(arr));
		}
}
