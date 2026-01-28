package pack1;

import java.util.Arrays;
import java.util.*;

public class Bsin2d {
	public static boolean bs(int[][] arr,int t) {
		int c=arr[0].length;
		int r=arr.length;
		int s=r*c;
		int l=0;
		int h=s-1;
		while(l<=h) {
			int m=l+(h-l)/2;
			if(arr[m/c][m%c]==t) {
				return true;
			}
			else if(arr[m/c][m%c]<t) {
				l=m+1;
			}
			else if(arr[m/c][m%c]>t) {
				h=m-1;
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
		System.out.println(bs(arr,t));
	}
	/*1 3 5 7 
	10 11 16 20
	23 30 34 60*/
}
