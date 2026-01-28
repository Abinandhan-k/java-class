package pack1;
import java.util.*;
class StackArray{
	int arr[];
	int size;
	int top;
	public StackArray(int size) {
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	public void push(int a) {
		System.out.println("before changes"+Arrays.toString(arr));
		if(top<size-1) {
			top++;
			arr[top]=a;
		}
		else {
			System.out.println("stack over flow");
		}
		System.out.println("after changes"+Arrays.toString(arr));
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack under flow");
		}
		else {
			System.out.println("value poped "+arr[top]);
			arr[top]=0;
			top--;
		}
	}
	public void peek() {
		if(top==-1) {
			System.out.println("stack is empty");
		
		}else {
			System.out.println("top value is "+arr[top]);	
		}
		 
	}
}

public class STACKIMPLEMENT {
public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	System.out.println(" enter the size value");
	int size=ah.nextInt();
	StackArray st=new StackArray(size);
	
	while (true) {
		System.out.println(" enter the choice 1.push 2.pop 3.peek 4.exit");
		int ch=ah.nextInt();
		if(ch==4) {
			break;
		}
		
	switch(ch) {
	case 1:
	{
		System.out.println(" enter the value");
		int val=ah.nextInt();
		st.push(val);
		break;
	}
	case 2:{
		st.pop();
		break;
	}
	case 3:{
		st.peek();
		break;
	}
	default:{
		System.out.println(" enter the valid choice value");
        break;
	}
	}
	}
	System.out.println(Arrays.toString(st.arr));	

}
}
