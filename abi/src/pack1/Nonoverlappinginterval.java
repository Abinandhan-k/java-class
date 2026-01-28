package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Nonoverlappinginterval {
	static int ovrlapcount(int[][] arr) {
		int count=0;
		if(arr.length==0) {
			return count; 
		}
		Arrays.sort(arr,new Comparator<int[]>(){
			public int compare(int a[],int b[]) {
				return a[1]-b[1];
			}
		});
		int preend=arr[0][1];
		for(int i=1;i<arr.length;i++) {
		 int cs=arr[i][0];
		 int ce=arr[i][1];
		 if(preend>cs) {
		 	count++;
		 }
	    else {
	    	preend=ce;
		  }
		 }
		return count;
	}
	 public static void main(String[] args) {
		 Scanner ah=new Scanner(System.in);
		 int r=ah.nextInt();
		 int arr[][]=new int[r][2];
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<2;j++) {
				 arr[i][j]=ah.nextInt();
			 }
		 }
		System.out.print(ovrlapcount(arr));
}
}
