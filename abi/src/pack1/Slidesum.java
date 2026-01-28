package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Slidesum {
	public static int ret_maxsum(int[] arr,int k) {
		int max=0;
		int n=arr.length;
		for(int i=0;i<k;i++) {
			max+=arr[i];
		}
		for(int i=k;i<n;i++) {
			max=Math.max(max,max-arr[i-k]+arr[i]);
		}
		return max;
	}
	public static void    main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print("window size");
		int k=ah.nextInt();
		System.out.print(ret_maxsum(arr,k));
	}
}
