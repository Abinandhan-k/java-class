package pack1;
import java.util.*;
public class StackARRRAYS {
 public static void main(String[] args) {
	 Scanner ah=new Scanner(System.in);
	 Stack<Character> at=new Stack<>();
	 String string=ah.next();
	 StringBuffer sb=new StringBuffer();
	 for(char ch:string.toCharArray()) {
		 at.push(ch);
	 }
	 while(!at.isEmpty()) {
		 sb.append(at.pop());
	 }
	 System.out.print(sb);
	 
 }
}
