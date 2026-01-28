package pack1;

import java.util.Scanner;

public class Staircasein2d {
	public static boolean st(int[][] arr,int t) {
		int nr=arr.length;
		int nc=arr[0].length;
		int r=0;
		int c=nc-1;
		while(r<nr && c>=0){
			if(arr[r][c]==t) {
				return true;
			}
			else if(arr[r][c]<t) {
				r++;
			}
			else if(arr[r][c]>t) {
				c--;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	System.out.println("get the size");
	int r=ah.nextInt();int c=ah.nextInt();
	System.out.println("get the t");
	int t=ah.nextInt();
	int[][] arr=new int [r][c];
	System.out.println("get the input values");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
		arr[i][j]=ah.nextInt();
	}
	}
	System.out.println(st(arr,t));
}
}
