package pack1;

import java.util.*;

public class Insertionsort {
	public static int[] sortinsrt(int[] arr,int n) {
	    for(int i=1;i<n;i++) {
	    	int j=i-1;
	    	int tmp=arr[i];
	    	while(j>=0 && tmp<arr[j]) {
	    		arr[j+1]=arr[j];
	    		j--;
	    	}
	    	arr[j+1]=tmp;
	    }
		return arr;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		
		
		System.out.print(Arrays.toString(sortinsrt(arr,n)));
	}
}
