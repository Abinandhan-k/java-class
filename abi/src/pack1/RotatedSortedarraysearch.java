package pack1;

import java.util.*;

public class RotatedSortedarraysearch {
	public static int bsinrtsa(int[] arr,int t){
		int l=0,h=arr.length-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]==t) {
				return mid;
			}
			if(arr[l]<=arr[mid]) {
				//left sorted
				if(t>=arr[l]&& t<arr[mid]) {
					h=mid-1;
				}
				else {
					l=mid+1;
				}
			}
			else {
				//right sorted
				if(t>=arr[mid]&& t<=arr[h]) {
						l=mid+1;
					}
					else {
						h=mid-1;
					}	
				}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in);
		System.out.println("get the size");
		int n=ah.nextInt();
		System.out.println("get the t");
		int t=ah.nextInt();
		int[] arr=new int [n];
		System.out.println("get the input values");
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.println(bsinrtsa(arr,t));
	}
}
