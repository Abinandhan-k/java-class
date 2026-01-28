package pack1;
import java.util.*;
public class Gasstation {
	static int day_to_start(int[] gas,int[] cost){
		int n=gas.length;
		int cur=0,start=-1,bal=0,overall=0;
		for(int i=0;i<n;i++) {
		     bal=gas[i]-cost[i];
			 overall+=bal;
			 cur+=bal;
			 if(cur<0) {
				 start=i+1;
				 cur=0;
			 }
			 
		}
		return overall>=0?start:-1;
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int gas[]=new int[n];
		int cost[]=new int[n];
		for(int i=0;i<n;i++) {
			gas[i]=ah.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			cost[i]=ah.nextInt();
		}
		System.out.print(day_to_start(gas,cost));
	}
}
