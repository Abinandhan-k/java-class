package pack1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class Longeststringsize {
	public static int longest(String s) {
		int l=0,r=0,max=0;
		HashSet<Character> hs=new HashSet<>();
		for(r=0;r<s.length();r++) {
			
			while(hs.contains(s.charAt(r))) {
				hs.remove(s.charAt(l));
				l++;
			}
			hs.add(s.charAt(r));
			max=Math.max(max,r-l+1);
		}
		return max;
	}
	public static void    main(String[] args) {
		Scanner ah=new Scanner(System.in) ;
		String s=ah.next();
		System.out.print(longest(s));
	}
}
