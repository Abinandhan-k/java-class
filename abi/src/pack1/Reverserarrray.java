package pack1;
import java.util.*;
public class Reverserarrray {
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		int n=ah.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ah.nextInt();
		}
		int l=0, r=n-1;
		while(l<r) {
			int t=arr[l];
			arr[l]=arr[r];
			arr[r]=t;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
