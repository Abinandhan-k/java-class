package trees;

import java.util.*;

public class Symmentrictree {
	static boolean isSymmentric(TreeNode node) {
		if(node==null) return true;
		Queue<TreeNode>q=new LinkedList<>();
		q.add(node.left);q.add(node.right);//base condition since we dont need to add root node
		while(!q.isEmpty()) {
			TreeNode t1=q.poll();
			TreeNode t2=q.poll();
			if(t1==null && t2==null) continue;
			if(t1==null || t2==null) return false;
			if(t1.data!=t2.data) return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);			
		}
		return true;
	}
	public static void main(String[] args) {
		 TreeNode t1=new TreeNode(1);
		 t1.left=new TreeNode(2);
		 t1.right=new TreeNode(2);
		 t1.left.left=new TreeNode(3);
		 t1.left.right=new TreeNode(4);
		 t1.right.left=new TreeNode(4);
		 t1.right.right=new TreeNode(3);
		 //t1.right.right.right=new TreeNode(10);
		 //t1.right.left.left=new TreeNode(8);
		 //t1.right.left.right=new TreeNode(9);

		System.out.print((isSymmentric(t1)));
		 
	 }
}
