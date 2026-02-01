package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LCAinbst {
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
	static TreeNode lca(TreeNode node,TreeNode p,TreeNode q) {
		if(node==null) return null;
		if(node.data<p.data && node.data<q.data) return lca(node.right,p,q);
		if(node.data>p.data && node.data>q.data) return lca(node.left,p,q);
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
	int p=ah.nextInt();
	int q=ah.nextInt();
    System.out.pritn(lca(t1,p,q).data);
 }
}
