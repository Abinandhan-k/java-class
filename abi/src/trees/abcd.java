package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class abcd {
	static void inorder(TreeNode node) {
		 if(node == null) return;
		 inorder(node.left);
		 System.out.print(node.data);
		 inorder(node.right);
		}
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}
	static int findmin(TreeNode node) {
	//	int min=0;
		if(node==null) return 0;
		while(node.left!=null) {
			node=node.left;
		}
		//if(node.left!=null) return Math.min()
		return node.data;
	}
	static int findmax(TreeNode node) {
		//int min=0;
		if(node==null) return 0;
		while(node.right!=null) {
			node=node.right;
		}
		//if(node.left!=null) return Math.min()
		return node.data;
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
     inorder(t1);
	 System.out.println("\n"+findmin(t1)+" \nlvl");
	 System.out.println(findmax(t1)+" \nlvl");
	// findmax(t1);
 }
}
