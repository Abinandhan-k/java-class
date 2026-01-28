package pack1;
import java.util.*;
public class Shortestpathinarray_right_down {
  static int ways(int n,int m) {
	  int[][]dp=new int[n][m];
		dp[0][0]=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0||j==0) {
					dp[i][j]=1;	
			}
			else {
		dp[i][j]=dp[i-1][j]+dp[i][j-1];
	}
}
}
		return dp[n-1][m-1];
	  }
	public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int r=ah.nextInt();
	int c=ah.nextInt();
	System.out.print(ways(r,c));
}
}
