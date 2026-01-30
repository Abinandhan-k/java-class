//package trees;
//import java.util.*;
// class TreeNode{
//	 int data;
//	 TreeNode left;
//	 TreeNode right;
//	 TreeNode(int data){
//		 this.data=data;
//		 this.left=null;
//		 this.right=null;
//	 }
//	 void inorder(TreeNode node) {
//		 if(node==null) {
//			 return;
//		 }
//		 inorder(node.left);
//		 System.out.print(node.data+" ");
//		 inorder(node.right);
//		 
//		 
//		 
//	 }
//	 void preorder(TreeNode node) {
//		 if(node==null) {
//			 return;
//		 }
//		 System.out.print(node.data+" ");
//		 preorder(node.left);
//		 preorder(node.right);
//	 }void postorder(TreeNode node) {
//		 if(node==null) {
//			 return;
//		 }
//		 postorder(node.left);
//		 postorder(node.right);
//		 System.out.print(node.data+" ");
//	 }
//	 static int ind=0;
//	 static TreeNode buildtree(int arr[]) {
//		 if(arr.length<=ind || arr[ind]==-1) { ind ++;return null;}
//		 TreeNode currnode=new TreeNode(arr[ind++]);
//		 currnode.left=buildtree(arr);
//		 currnode.right=buildtree(arr);
//		 return currnode;
//	 }
// }
//public class Treeesinitialiataion {
//  public static void main(String[] args){
//	 Scanner ah=new Scanner(System.in);
//	  /*TreeNode t1=new TreeNode(10);
//	  t1.left=new TreeNode(20);
//	  t1.right=new TreeNode(30);
//	  t1.left.left=new TreeNode(40);
//	  t1.left.right=new TreeNode(50);
//	  t1.right.left=new TreeNode(60);
//	  System.out.println("inorder");
//	  t1.inorder(t1);
//	  System.out.println("\npreorder");
//	  t1.preorder(t1);
//	  System.out.println("\npostorder");
//	  t1.postorder(t1);*/
//	  int n=ah.nextInt();
//	  int arr[]=new int[n];
//	  for(int i=0;i<n;i++) {
//		  arr[i]=ah.nextInt();
//		  }
//	  TreeNode t2=TreeNode.buildtree(arr);
//	  t2.inorder(t2);
//  }
//}
