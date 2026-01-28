package pack1;

import java.util.Scanner;

public class Buyandsellmaxprofitbtfrs {
   public static int maxprofit(int[] arr) {
	  int max=0;
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
		 max=Math.max(arr[j]-arr[i], max);
			  // if((arr[j]-arr[i])>max) {
				//  max=arr[j]-arr[i];
			  //}
		  }
	  }
	  return max;
   }
	
	public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=ah.nextInt();
    }
    System.out.print(maxprofit(arr));
}
}
