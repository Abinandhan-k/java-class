package pack1;
import java.util.*;
public class Anagram {
	/*public static boolean valid(String s1,String s2) {
		char []C1=(s1.toCharArray());
		char []C2=(s2.toCharArray());		
		Arrays.sort(C2);
		Arrays.sort(C1);
		return Arrays.equals(C1,C2);
	}*/
	
	public static boolean valid(String s1,String s2) {
		char []C1=(s1.toCharArray());
		char []C2=(s2.toCharArray());
		int[] fre=new int[26];
		for(char ch:C1) {
			fre[ch-'a']++;
		}
		for(char ch:C2) {
			fre[ch-'a']--;
		}
	
		for(int x:fre) {
			if(x!=0) {
				return false;
			}
		}
		return true;
		
	}
	
 public static void main(String[] args) {
	 
	 Scanner ah=new Scanner(System.in);
	 String a=ah.next();
	 String b=ah.next();
	 System.out.print(valid(a,b));
 }
}
