package trees;
import java.util.*;
public class SUMOFLEFTLEAF {
	static int[] sumofleftleaf(TreeNode node) {
		if(node==null)return new int[0];
		int lsum=0;
		int rsum=0;
		Queue<TreeNode> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			TreeNode cur=q.poll();
			if(cur.left!=null) {
				q.add(cur.left);
				if(cur.left.left==null && cur.left.right==null) lsum+=cur.left.data;
			}
			if(cur.right!=null) {
				q.add(cur.right);
				if(cur.right.left==null && cur.right.right==null) rsum+=cur.right.data;
			}
		}
		return new int[] {lsum,rsum};
	}
	 public static void main(String[] args) {
		 TreeNode t1=new TreeNode(1);
		 t1.left=new TreeNode(2);
		 t1.right=new TreeNode(3);
		 t1.left.left=new TreeNode(4);
		 t1.left.right=new TreeNode(5);
		 t1.right.left=new TreeNode(6);
		 t1.right.right=new TreeNode(7);
		 t1.right.right.right=new TreeNode(10);
		 t1.right.left.left=new TreeNode(8);
		 t1.right.left.right=new TreeNode(9);

		System.out.print(Arrays.toString(sumofleftleaf(t1)));
		 
	 }
}
