package pack1;
import java.util.*;
public class Fibonacciseries {

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
	public static int fib(int n) {
		int dp[]=new int[n+1];
		dp[0]=0;dp[1]=1;//base case 0 ,1
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
       //  Scanner ah=new Scanner(System.in);
         
         System.out.println(fib(4));
         System.out.println(fib(3));
         System.out.println(fib(2));
        // for(int i=0;i<n;i++) {
        	 
        // }
	}

}
