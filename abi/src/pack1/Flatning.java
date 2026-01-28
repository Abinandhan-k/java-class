package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Flatning {
	public static int[] flatening(int[][] arr) {
		int nr=arr.length;
		int nc=arr[0].length;
		int arr1[]=new int [nr*nc];
		for(int i=0;i<nr*nc;i++) {
			arr1[i]=arr[i/nc][i%nc];
		}
		return arr1;
	}
	public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	System.out.println("get the size");
	int r=ah.nextInt();int c=ah.nextInt();
	int[][] arr=new int [r][c];
	System.out.println("get the input values");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
		arr[i][j]=ah.nextInt();
	}
	}
	System.out.println(Arrays.toString(flatening(arr)));
}
}
