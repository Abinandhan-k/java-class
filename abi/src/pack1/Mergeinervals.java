package pack1;

import java.util.*;

public class Mergeinervals {
	static int[][] merge(int[][] arr) {
		if(arr.length==0) {
			return new int[0][0]; 
		}
		Arrays.sort(arr,new Comparator<int[]>(){
			public int compare(int a[],int b[]) {
				return a[0]-b[0];
			}
		});
		List<int[]> list=new ArrayList<>();
		list.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
		 int cs=arr[i][0];
		 int ce=arr[i][1];
		 int[] lm =list.get(list.size()-1);
		 if(lm[1]>=cs) {
		 	lm[1]=Math.max(lm[1],ce);
		 }
	    	else {
		 list.add(arr[i]);
		 }
		 }
		return list.toArray(new int[list.size()][]);
	}
	 public static void main(String[] args) {
		 Scanner ah=new Scanner(System.in);
		 int r=ah.nextInt();
		 int arr[][]=new int[r][2];
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<2;j++) {
				 arr[i][j]=ah.nextInt();
			 }
		 }
		 int res[][]=merge(arr);
		 for(int e[]:res) {
			 System.out.print(Arrays.toString(e));
		 }
		// System.out.print();
		 
	 }
}
