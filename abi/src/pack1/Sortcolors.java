package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Sortcolors {
	public static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int[] ret_sort(int[] arr) {
		int l=0,m=0,h=arr.length-1;
		while(m<=h) {
			if(arr[m]==0) {
				swap(arr,m,l);
				l++;m++;
			}
			else if(arr[m]==1) {
				m++;
			}
			else {
				swap(arr,m,h);
				h--;
			}
		}
		return arr;
	}
	public static void    main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print(Arrays.toString(ret_sort(arr)));
	}
}
