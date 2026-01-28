package pack1;

import java.util.*;

public class Kokoeatingbananas {
	public static int koko(int[ ] arr,int h) {
		/**/int tot=0,max=0;
		for(int p:arr) {
				max=Math.max(max,p);
			  tot+=p;
			}
		int l=(int)Math.ceil((double)tot/h);
		int high=max;  
		while(l<=high){
			int m=l+(high-l)/2;
			int smh=0;
			for(int p:arr) {
				smh+=(p+m-1)/m;//equal to (int)Math.ceil(double)(p/m);
				if(smh>h)break;
			}
			if(smh<=h) {
				high=m-1;
			}
			else {
				l=m+1;
			}
		}
		return l;
		/**/
		/*int tot=0,max=0;
		for(int p:arr) {
				max=Math.max(max,p);
			    tot=tot+p;
			}
		int l=(int)Math.ceil((double)tot/h);
        int high=max;
		while(l<=high){
			int m=l+(high-l)/2;
			int smh=0;
			for(int p:arr) {
				smh+=(p+m-1)/m;
				if(smh>h)break;
			}
			if(smh<=h) {
				high=m-1;
			}
			else {
				l=m+1;
			}
		}
		return l;*/
	}
	public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	System.out.println("get the size");
	int n=ah.nextInt();
	System.out.println("get the t");
	int h=ah.nextInt();
	int[] arr=new int [n];
	System.out.println("get the input values");
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	System.out.println(koko(arr,h));
}
}
