package pack1;

import java.util.*;
//560 lc
public class Subarrayeualk {
	public static int retcout(int[] arr,int k) {
		int count=0,req=0,res=0,cs=0;
		HashMap<Integer,Integer>hs=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			cs+=arr[i];
			req=cs-k;
			if(hs.containsValue(cs)) {
				res+=hs.get(req);
			}
			hs.put(cs,hs.getOrDefault(cs, 0)+1);		}
		return cs;
	}

	public static void    main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		System.out.print("window size");
		int k=ah.nextInt();
		System.out.print(ret_maxsum(arr,k));
	
}
