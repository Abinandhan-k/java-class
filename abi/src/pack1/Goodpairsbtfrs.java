package pack1;
import java.util.*;
public class Goodpairsbtfrs {
	public static int countpairs(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	System.out.println("get the size");
	int n=ah.nextInt();
	int [] arr=new int [n];
	System.out.println("get the input values");
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	System.out.println(countpairs(arr));
}
}
