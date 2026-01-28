
package pack1;
import java.util.*;
import java.io.*;

public class First {
	//used for sorting
    public static int[] selection(int arr[]) {
    int n= arr.length;
    
	for(int i=0;i<n-1;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[min]>arr[j])
			{
				min=j;
				
			}
			
		}
		System.out.println(arr[min]+"selected");
			if(arr[i]!=arr[min]) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}	
		
	}
	return arr;
    }
	public static void main(String[] args) {
    Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=ah.nextInt();
    }
    System.out.println(Arrays.toString(selection(arr)));    
}
}
// time complexity o(n^2)
