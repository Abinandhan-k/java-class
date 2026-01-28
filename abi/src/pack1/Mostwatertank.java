package pack1;
import java.util.*;
public class Mostwatertank {
	public static int ret_max(int arr[]) {
		int max=0,l=0,r=arr.length-1;
		while(l<r) {
			int h=Math.min(arr[l],arr[r]);
			int w=r-l;
			max=Math.max(h*w,max);
			if(arr[l]<arr[r]) {
				l++;
			}
			else /*if(arr[l]>arr[r])*/ {
				r--;
			}
			//else {
			//	r--;l++;
		//	}
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
		System.out.print((ret_max(arr)));
 }
}
