package pack1;
//lc 739 daily temp
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Temp {
	public static int[] ret_days(int[] arr) {
		int arr1[]=new int[arr.length];
		int count=0;
		int n=arr.length;
		/*for(int i=0;i<arr.length;i++) {
			arr1[i]=0;
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				count++;
				if(arr[i]<arr[j]) {
					arr1[i]=count;
					
					 break;
				}
				
			}
		}
		*/
		Arrays.fill(arr1,0);
		Stack<Integer> st= new Stack<>();
		for(int i=0;i<n;i++) {
			int ind=0;
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				ind=st.pop();
				arr1[ind]=i-ind;
			}
				st.push(i);
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
		System.out.print(Arrays.toString(ret_days(arr)));
	}
}
