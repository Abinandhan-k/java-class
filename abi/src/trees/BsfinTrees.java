//package trees;
//import java.util.*;
//class TreeNode{
//	int data;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int data){
//		this.data=data;
//		this.left=null;
//		this.right=null;
//	}
//	void levelorder(TreeNode node) {
//		if(node==null) return;
//		Queue<TreeNode> queue=new LinkedList<>();
//		queue.add(node);
//		while(!queue.isEmpty()) {
//			TreeNode curr=queue.poll();
//			System.out.print(curr.data);
//			if(curr.left!=null) {
//				queue.add(curr.left);
//			}
//			if(curr.right!=null) {
//				queue.add(curr.right);
//			}
//		}
//	}
//}
//public class BsfinTrees {
//	
// public static void main(String[] args) {
//	/* Scanner ah=new Scanner(System.in);
//	 int n=ah.nextInt();
//	 int arr[]=new int[n];
//	 for(int i=0;i<n;i++) {
//		 arr[i]=ah.nextInt();
//	 }*/
//	 TreeNode t1=new TreeNode(1);
//	 t1.left=new TreeNode(2);
//	 t1.right=new TreeNode(3);
//	 t1.left.left=new TreeNode(4);
//	 t1.left.right=new TreeNode(5);
//	 t1.right.right=new TreeNode(6);
//	 t1.levelorder(t1);
// }
//}
