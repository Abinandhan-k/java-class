package trees;

import java.util.Scanner;

public class Isvalidbst {
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}
  static boolean valid(TreeNode node) {
	  return validate(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  static boolean validate(TreeNode node,long min,long max) {
	  if(node.data<min || node.data>max) return false;
	  return validate(node.left,min,node.data)&& validate(node.right,node.data,max);
  }
  public static void main(String[] args) {
		 Scanner ah=new Scanner(System.in);
		 int n=ah.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=ah.nextInt();
		 }
		 TreeNode t1=null;
		 for(int i:arr) {
			 t1=insert(i,t1);
		 }
		 System.out.print(valid(t1));
		
	 }
}
