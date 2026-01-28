package pack1;
import java.util.*;
public class Goodpairs {
	
public static int countpairs(int arr[]) {							
 HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
 int pairs=0;
 for(int i=0;i<arr.length;i++){
  pairs+=mp.getOrDefault(arr[i],0);
 
  
  
  
  if(mp.containsKey(arr[i])) {
	  mp.put(arr[i],mp.get(arr[i])+1);
	  //System.out.print(mp.get(arr[i]));
	  }
  else {
	  mp.put(arr[i],1);
  }
}
 return pairs;
	}

public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	System.out.println(countpairs(arr));
}
}