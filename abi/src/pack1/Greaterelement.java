package pack1;
import java.util.*;
public class Greaterelement {
	public static int[] returngreat(int[] arr) {
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr1[i]=arr[j];
					 break;
				}
				
			}
		}
		return arr1;
	}
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in) ;
	int n=ah.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	System.out.print(Arrays.toString(returngreat(arr)));
}
}
