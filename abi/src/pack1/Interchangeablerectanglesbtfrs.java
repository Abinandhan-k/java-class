package pack1;
import java.util.*;
public class Interchangeablerectanglesbtfrs {
	public static int changeablecount(int arr[][]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][0]*arr[j][1] == arr[i][1]*arr[j][0]) { //if( (double)arr[i][0]/arr[i][1] == ()arr[j][0]/arr[j][1])
					count++;
				}
			}
		}
		return count;
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
	 System.out.print(changeablecount(arr));
	 
 }
}
