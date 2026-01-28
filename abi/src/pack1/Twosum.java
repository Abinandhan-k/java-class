package pack1;
import java.util.*;

public class Twosum {
	
public static int [] twosums(int arr[],int t) {
	HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++) {
	 int r=t-arr[i];
	 if( mp.containsKey(r)){
		 return new int[] {mp.get(r),i};
	 }
	 mp.put(arr[i],i);
	 
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
