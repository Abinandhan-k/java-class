package trees;
import java.util.*;
public class Boundryelements {
	static void addleaf(TreeNode node,List<Integer> res) {
		if(node==null) return;
		if(isLeaf(node)) res.add(node.data);
		addleaf(node.left,res);
		addleaf(node.right,res);
	}
	static void addleftbound(TreeNode node,List<Integer> res) {
		   TreeNode cur=node.left;
		   while(cur!=null) {
			   if(!isLeaf(cur)) res.add(cur.data);
			   cur=(cur.left!=null)?cur.left:cur.right;
		   }
	}
      static void addrightbound(TreeNode node,List<Integer> res) {
		TreeNode cur=node.right;
		Stack<Integer> st=new Stack<>();
		while(cur!=null) {
			if(!isLeaf(cur)) st.push(cur.data);
			cur=(cur.right!=null)?cur.right:cur.left;
		}
		while(!st.isEmpty()) {
			res.add(st.pop());
		}
	}
	static boolean isLeaf(TreeNode node) {
		return node.left==null && node.right==null;
	}
	 static List<Integer>boundary(TreeNode node){
		List<Integer> res=new ArrayList<>();
		if(node==null)return res;
		if(!isLeaf(node)) res.add(node.data);
		addleftbound(node,res);
		addleaf(node,res);
		addrightbound(node,res);
		return res;
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
     	System.out.print(boundary(t1));
		 
	 }
}
