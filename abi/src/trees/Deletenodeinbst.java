package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Deletenodeinbst {
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
	
		static 	TreeNode delete(int key, TreeNode node) {
			if(node ==null)return null;
			if(key<node.data) node.left=delete(key,node.left);
			else if(key>node.data) node.right=delete(key,node.right);
			else {//key==node.data
				if(node.left==null) return node.right;//for one child
				if(node.right==null) return node.left;//for one child
			    TreeNode min=findmin(node.right);//for 2 or more child
		        node.data=min.data;//for 2 or more child
		        node.right=delete(min.data,node.right);//for 2 or more child
		    }
			return node;
		}
		static TreeNode findmin(TreeNode node) {
			while(node.left!=null) {
				node=node.left;
			}
			return node;
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
	int key=ah.nextInt();
     inorder(t1);
     TreeNode delete=delete(key,t1);
	 System.out.println("\n");
	 inorder(t1);
 }
}
