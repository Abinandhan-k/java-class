package pack1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Cirnge {
	
	/*public static int[] returngreat(int arr[]) {
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=-1;
			for(int j=1;j<arr.length;j++) {
				if(arr[((i+j)%arr.length)]>arr[i]) {
					arr1[i]=arr[((i+j)%arr.length)];
					break;
				}
			}
		}
		return arr1;
	}*/
	public static int[] returngreat(int arr[]) {
		int n=arr.length;
		int[] ans=new int[n];
		Arrays.fill(ans,-1);
		Stack<Integer> st= new Stack<>();
		for(int i=0;i<2*n;i++) {
			int ind=i%n;
			while(!st.isEmpty() && arr[st.peek()]<arr[ind]) {
				ans[st.pop()]=arr[ind];
			}
			if(i<n) {
				st.push(ind);
			}
			
		}
		return ans;
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


