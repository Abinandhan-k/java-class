package pack1;

import java.util.Arrays;
import java.util.Scanner;
//lc 53 maximum sum in a sub array
public class Maxsumofsubarr {
	public static int ret_maxsum(int[] arr) {
		int max=arr[0],cs=arr[0];
		for(int i=1;i<arr.length;i++) {
			cs=Math.max(arr[i],arr[i]+cs);
			max=Math.max(max,cs);
			
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print(ret_maxsum(arr));
	}
}
