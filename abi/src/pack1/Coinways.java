package pack1;
import java.util.*;
public class Coinways {
	public static int totways(int[] coins,int amt) {
		int dp[]=new int[amt+1];
		dp[0]=1;//base case
		for(int i:coins) {
			for(int j=i;j<=amt;j++) {
				dp[j]=dp[j]+dp[j-i];
			}
			//System.out.print(Arrays.toString(dp));
		}
		return dp[amt];
	}
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	int amt=ah.nextInt();
	System.out.print(totways(arr,amt));
}
}
