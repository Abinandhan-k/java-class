package trees;
import java.util.*;
public class TreeRightView {
	static int level=0;
	static List<Integer> levelorder(TreeNode node) {
	    List<Integer> list=new ArrayList<>(); 
		if(node==null) return list ;
		Queue<TreeNode> queue=new LinkedList<>();	
		queue.add(node);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				TreeNode cur=queue.poll();
				if(i==size-1) list.add(cur.data);
				if(cur.left!=null) queue.add(cur.left);
				if(cur.right!=null) queue.add(cur.right);
			}}
		return list;
		}
	/*
	 * public static List<Integer> RightView(TreeNode node) {
	    List<Integer> lst = new ArrayList<>();
	    if (node == null) return lst;
	    Queue<TreeNode> q = new LinkedList<>();
	    q.add(node);
	    while (!q.isEmpty()) {
	        int size = q.size();
	        for (int i = 0; i < size; i++) {
	            TreeNode curr = q.poll();
	            if (i == size - 1) {
	                lst.add(curr.data);
	            }
	            if (curr.left != null) q.add(curr.left);
	            if (curr.right != null) q.add(curr.right);
	        }
	    }
	    return lst;*/
	 
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

	System.out.print(levelorder(t1));
	 
 }
}
