package trees;
import java.util.*;
public class Zigzagtravelsainlevelorder {
	static List<List<Integer>> ziglvl(TreeNode node){
		List<List<Integer>> list=new ArrayList<>();
		if(node==null)return list;
		Queue<TreeNode> q=new LinkedList<>();
	    q.add(node);
	    boolean ltor=true;
	    while(!q.isEmpty()) {
	    	int s=q.size();
	    	List<Integer> l1=new ArrayList<>();
	    	for(int i=0;i<s;i++) {
	    		TreeNode cur=q.poll();
	    		l1.add(cur.data);
	    		if(cur.left!=null) q.add(cur.left);
	    		if(cur.right!=null) q.add(cur.right);
	    	}
	    	if(!ltor) {
	    	Collections.reverse(l1);
	    	}
	    	list.add(l1);
	    	ltor=!ltor;
	    }
	    return list;
	}
	public static void main(String[] args) {
		 TreeNode t1=new TreeNode(1);
		 t1.left=new TreeNode(2);
		 t1.right=new TreeNode(3);
		 t1.left.left=new TreeNode(4);
		 t1.left.right=new TreeNode(5);
		 t1.right.left=new TreeNode(6);
		 t1.right.right=new TreeNode(7);
		 t1.left.right.left=new TreeNode(8);
		 t1.left.right.right=new TreeNode(9);
		 //t1.right.left.right=new TreeNode(9);
      	System.out.print(ziglvl(t1));
}
}
