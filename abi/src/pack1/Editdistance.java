package pack1;
import java.util.*;
public class Editdistance {
	public static int editeddist(String s1,String s2) {
		int n=s1.length()+1;//row string 2
		int m=s2.length()+1;//col string 1 
		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			dp[i][0]=i; // setting row as 0 1 2 3 4 5..n
		}
		for(int j=0;j<m;j++) {
			dp[0][j]=j;// setting col as 0 1 2 3 4 5..n
		}
		for(int r=1;r<n;r++) {
			for(int c=1;c<m;c++) {
				if(s1.charAt(r-1)==s2.charAt(c-1)) {
					dp[r][c]=dp[r-1][c-1];
				}
				else {
					dp[r][c]=Math.min(dp[r-1][c-1],Math.min(dp[r][c-1],dp[r-1][c]))+1;
				}
			}
		}
		
		return dp[n-1][m-1];
	}
	public static void main(String[] args) {
    Scanner ah=new Scanner(System.in);
    String s1=ah.next();
    String s2=ah.next();
    System.out.print(editeddist(s1,s2));
	}

}
