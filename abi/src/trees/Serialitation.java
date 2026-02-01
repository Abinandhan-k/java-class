package trees;

import java.util.*;

public class Serialitation {
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}
	static TreeNode buildtree(Queue<Integer> q,int min,int max) {
		if(q.isEmpty()) return null;
		int data=q.peek();
		if(data<min|| data>max) return null;
		q.poll();
		TreeNode cur= new TreeNode(data);
		cur.left=buildtree(q,min,data);
		cur.right=buildtree(q,data,max);
		return cur;
	}
	public static String serialise(TreeNode node) {
		StringBuffer sb =new StringBuffer();
		preorder(node,sb);
	    return sb.toString();
	}static void pre(TreeNode node) {
		 if(node == null) return;
		 System.out.print(node.data);
		 pre(node.left);
		 pre(node.right);
		
		}
	static void preorder(TreeNode node,StringBuffer sb) {
		if(node==null) return;
		sb.append(node.data);
		sb.append(",");
		preorder(node.left,sb);
		preorder(node.right,sb);
	}
	static TreeNode deserialize(String s) {
		if(s.isEmpty()) return null;
		Queue<Integer> q=new LinkedList<>();
		for(String i:s.split(",")) {
			q.add(Integer.parseInt(i));
		}
		 return buildtree(q,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
public static void main(String[] args) {
  Scanner ah=new Scanner(System.in);
   int n=ah.nextInt();
   int arr[]=new int[n];
   for(char i=0;i<arr.length;i++) {
        arr[i]=ah.nextInt();
    }
    TreeNode t1=null;
    for(int i:arr) {
      t1=insert(i,t1);
    }
    String a=serialise(t1);
    TreeNode t2=deserialize(a);
    System.out.print(a);
    pre(t2);
}
}
