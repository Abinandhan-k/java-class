package pack1;
import java.util.*;
public class Watertrapped {
	public static int ret_water(int[] arr) {
		int max=0,l=0,r=arr.length-1,w=0,lmax=0,rmax=0;
		while(l<r) {
			if(arr[l]<=arr[r]) {
				lmax=Math.max(lmax, arr[l]);
				max+=lmax-arr[l];
				l++;
			}
			else {
				rmax=Math.max(arr[r], rmax);
				max+=rmax-arr[r];
				r--;
			}
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
		System.out.print(ret_water(arr));
}
}
