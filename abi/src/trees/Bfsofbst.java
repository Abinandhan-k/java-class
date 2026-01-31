package trees;
import java.util.*;
public class Bfsofbst {
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}
	static void levelorder(TreeNode node) {
		if(node==null) return;
		Queue<TreeNode>q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			TreeNode cur=q.poll();
			System.out.print(cur.data);
			if(cur.left!=null) q.add(cur.left);
			if(cur.right!=null) q.add(cur.right);
		}
	}
	static void levelbylevelorder(TreeNode node) {
		if(node==null) return;
		Queue<TreeNode>q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int s=q.size();
			for(int i=0;i<s;i++) {
			TreeNode cur=q.poll();
			System.out.print(cur.data);
			if(cur.left!=null) q.add(cur.left);
			if(cur.right!=null) q.add(cur.right);
		}
			System.out.println();
		}
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
     levelorder(t1);
	 System.out.println(" \nlvl");
	 levelbylevelorder(t1);
 }
}
