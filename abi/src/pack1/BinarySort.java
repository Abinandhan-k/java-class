package pack1;

import java.util.*;
public class BinarySort {
	public static int binsrch(int[] arr,int n,int t) {
	   int l=0,h=n-1;
	   while(l<=h) {
		   int m=l+(h-l)/2;
		   if(arr[m]==t) {
			   return m;
			   
		   }
		   else if(arr[m]<t) {
			   l=m+1;
		   }
		   else if(arr[m]>t) {
			   h=m-1;
		   }
	   }
		return -1;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		int t=ah.nextInt();
		
		
		System.out.print(binsrch(arr,n,t));
	}
}
