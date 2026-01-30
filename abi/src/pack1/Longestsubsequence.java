package pack1;

import java.util.*;

public class Longestsubsequence {
	public static int longestsubseq(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		 int dp[][]=new int[n+1][m+1];
		 //for(int j=0;j<dp.length;j++) {
			// dp[0][j]=0;
			// dp[j][0]=0;
		// }//base condition
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=m;j++) {
			  if(s1.charAt(i-1)==s2.charAt(j-1)) {
				  dp[i][j]=1+dp[i-1][j-1];
			  }
			  else {
				  dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
			  }
			 }
		 }
		 return dp[n][m];
	 }
		public static void main(String[] args) {
	    Scanner ah=new Scanner(System.in);
	    String s1=ah.next();
	    String s2=ah.next();
	    System.out.print(longestsubseq(s1,s2));
		}

}
