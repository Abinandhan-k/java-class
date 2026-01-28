package pack1;
import java.util.*;
public class Heighestrect {
	public static int greatarea(int[] arr) {
		Stack<Integer> st=new Stack<>();
	           	int n=arr.length;
		int maxarea=0,l=0,r=0,h=0,w=0,ch=0,area=0; //l-left,r-right,h-height,w-width,ch-current  height
		for(int i=0;i<=n;i++) {
			ch=(i==n)?0:arr[i];
			while(!st.isEmpty() && arr[st.peek()]>ch) {
				h=arr[st.pop()];
				r=i;
				l=st.isEmpty()?-1:st.peek();
				w=r-l-1;
				area=w*h;
				maxarea=Math.max(area, maxarea);
			}
			st.push(i);
		}
		return maxarea;
	}
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int n=ah.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=ah.nextInt();
	}
	System.out.print(greatarea(arr));
}
}
