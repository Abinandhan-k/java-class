package pack1;

import java.util.*;
class product{
	int weight;
	int value;
	double ratio;
	product(int weight,int value){
		this.weight=weight;
		this.value=value;
		this.ratio=(double)value/weight;
	}	
}
public class Fractionalknapsack {
	static double profitable(int[] weight,int[] value,int kw) {
		double profit=0;
		int n=weight.length;
		product products[]=new product[n];
		for(int i=0;i<n;i++) {
			products[i]=new product(weight[i],value[i]);
		}
		Arrays.sort(products,(a,b)->Double.compare(b.ratio,a.ratio));
		for(product prod:products) {
			if(kw>=prod.weight) {
				profit+=prod.value;
				kw-=prod.weight;
			}
			else {
				profit+=kw*prod.ratio;
				break;
			}
		}
		return profit;
	}
	 public static void main(String[] args) {
		 Scanner ah=new Scanner(System.in);
		 int n=ah.nextInt();
		 int weight[]=new int[n];
		 int value[]=new int[n];
		 for(int i=0;i<n;i++) {
				 weight[i]=ah.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 value[i]=ah.nextInt();
	 }
		 int w=ah.nextInt();
		 System.out.print(profitable(weight,value,w));
		 
	 }
}
