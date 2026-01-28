package pack1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Btfrtwosum {
	
public static int [] twosums(int arr[],int t) {
	
	for(int i=0;i<arr.length-1;i++) {
	  for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]+arr[j]==t) {
					  return new int [] {i,j};
				  }
				  
		}
	 }
	return new int [] {-1,-1};
	
 }
  public static void main(String[] args) {
	  Scanner ah=new Scanner(System.in);
	  int n=ah.nextInt();
	  int [] arr=new int[n];
	  
	  for(int i=0;i<n;i++) {
		  arr[i]=ah.nextInt();
	  }
	  int t=ah.nextInt();
	  System.out.print(Arrays.toString(twosums(arr,t)));
  }
}
