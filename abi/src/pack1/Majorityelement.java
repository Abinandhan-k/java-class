package pack1;

import java.util.*;

public class Majorityelement {
	public static int majority(int[] arr) {
		int c=0,can=0;
		for(int i=0;i<arr.length;i++) {
			if(c==0) {
				can=arr[i];
			}
			if(can==arr[i]) {
			c+=1;
			}
			else {
				c--;
			}
		}
		return (c<=0)?can:-1;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print(majority(arr));
	}
}
