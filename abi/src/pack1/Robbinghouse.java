package pack1;
import java.util.*;
public class Robbinghouse {
 static int robed(int[] arr) {
	 int[] dp=new int[arr.length];
	 if(arr.length==1) {
		 return arr[0];
	 }
	 dp[0]=arr[0];
	 dp[1]=Math.max(arr[1],dp[0]);
	 for(int i=2;i<arr.length;i++) {
		 dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
	 }
	 return dp[arr.length-1];
 }
	public static void main(String[] args) {
		Scanner ah=new Scanner (System.in);
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print(robed(arr));
	}

}
