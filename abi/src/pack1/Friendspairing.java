package pack1;
import java.util.*;
public class Friendspairing {
 static int validpairs(int n) {
	 int pairs=0;
	 if(n==1) {
		 return n;
	 }
	 int dp[]=new int[n+1];
	 dp[0]=0;
	 dp[1]=1;
	 dp[2]=2;
	 for(int i=3;i<dp.length;i++) {
		 dp[i]=dp[i-1]+(i-1)*dp[i-2];
	 }
	 return dp[dp.length-1];
 }
	public static void main(String[] args) {
	 Scanner ah=new Scanner(System.in);
	 int n=ah.nextInt();
	 System.out.print(validpairs(n));

	}

}
