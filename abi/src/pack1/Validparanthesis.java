package pack1;
import java.util.*;
public class Validparanthesis {
	public static boolean valid(String s) {
		Stack<Character> st=new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch=='(') {
				st.push(')');
			}
			else if(ch=='{'){
				st.push('}');
				
			}
			else if(ch=='[') {
				st.push(']');
			}
			else if(st.isEmpty()||st.pop()!=ch) {
				return false;
			}
		}
		return st.isEmpty();
	}
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	String s=ah.next();
	System.out.print(valid(s));
}
}
