package pack1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
public class Fruitbasket {
	public static int ret_maxfruits(int[] arr) {
		int n=arr.length;
		int maxfruits=0;
		int l=0,r=0;
		HashMap<Integer,Integer>hs=new HashMap<>();
		for(r=0;r<n;r++) {
			hs.put(arr[r],hs.getOrDefault(arr[r],0)+1);
			while(hs.size()>2) {
				hs.put(arr[l],hs.get(arr[l])-1);
				if(hs.get(arr[l])==0) {
					hs.remove(arr[l]);
				}
				l++;
			}
			maxfruits=Math.max(maxfruits, r-l+1);
		}
		return maxfruits;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print(ret_maxfruits(arr));
	}
}
