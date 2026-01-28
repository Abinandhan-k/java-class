package pack1;

import java.util.HashMap;
import java.util.Scanner;

public class Interchangeablerectangles {
public static int gcd(int a,int b) {
	if(b==0) {
	 return a;
	}
	return gcd(b,a%b);
	
}
public static int interchange(int arr[][]) {
  	
 
	 int count=0;
	 HashMap<String,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int w=arr[i][0];
			 int h=arr[i][0];
			 int e= gcd(w,h);
			 w=w/e;
			 h=h/e;
			 String key=w+"/"+h;
			count+=mp.getOrDefault(key, 0);
			if(mp.containsKey(key)){
			   mp.put(key,mp.get(key)+1);
			}else {
			mp.put(key, 1);
			}
 }
 return count;
}
/*public static int changeablecount(int arr[][]) {
		int count=0;
		HashMap<Double,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			double key = (double)arr[i][0]/arr[i][1];
			count+=mp.getOrDefault(key, 0);
			if(mp.containsKey(key)){
			   mp.put(key,mp.getOrDefault(key, 0)+1);
			}else {
			mp.put(key, 1);
			}
		}
		return count;
	}*/
 public static void main(String[] args) {
	 Scanner ah=new Scanner(System.in);
	 int r=ah.nextInt();
	 int arr[][]=new int[r][2];
	 for(int i=0;i<r;i++) {
		 for(int j=0;j<2;j++) {
			 arr[i][j]=ah.nextInt();
		 }
	 }
	// System.out.print(changeablecount(arr));
	 System.out.print(interchange(arr));
	 
 }
}
