package pack1;
import java.util.*;
public class Claiminssatirs {

	//memoritation methor - it uses hash map and recursion only first calculation of n will take high amount of time but next itreation will be lower
	/*static 	 HashMap<Integer,Integer>hs=new HashMap<>();
 static int  fib(int n) {
	 if(n<=1) {
		 return n;
	 }
	 if(hs.containsKey(n)) {
		 return hs.get(n);
	 }
	 int res=fib(n-1)+fib(n-2);
	 hs.put(n,res);
	 return res;
 }*/
	//tabulation method
	public static int findnoofways(int n) {  //here n is no of stairs0
		int dp[]=new int[n+2];
		int ways=0;
		if(n==0) {
			return 0;
		}
		dp[0]=0;dp[1]=1;//base case 0 ,1
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n+1];
	}
	public static void main(String[] args) {
         Scanner ah=new Scanner(System.in);
         System.out.println(findnoofways(ah.nextInt()));
        // System.out.println(findnoofways(ah.nextInt()));
         //System.out.println(findnoofways(ah.nextInt()));
        // for(int i=0;i<n;i++) {
        	 
        // }
	}

}
