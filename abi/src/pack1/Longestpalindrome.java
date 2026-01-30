package pack1;
import java.util.*;
public class Longestpalindrome {
 public static int longestsubseq(String s1) {
	 int dp[][]=new int[s1.length()][s1.length()];
	 for(int j=0;j<dp.length;j++) {
		 dp[j][j]=1;
	 }
	 for(int i=dp.length-1;i>=0;i--) {
		 for(int j=i+1;j<dp.length;j++) {
		  if(s1.charAt(i)==s1.charAt(j)) {
			  dp[i][j]=dp[i+1][j-1]+2;
		  }
		  else {
			  dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
		  }
		 }
	 }
	 return dp[0][dp.length-1];
 }
	public static void main(String[] args) {
    Scanner ah=new Scanner(System.in);
    String s1=ah.next();
    System.out.print(longestsubseq(s1));
	}

}
