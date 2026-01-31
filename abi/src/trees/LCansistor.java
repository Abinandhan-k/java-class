package trees;

public class LCansistor {
	static TreeNode lca(TreeNode node,TreeNode p,TreeNode q) {
		if(node==null) return null;
		if(node==p || node== q) return node;
		TreeNode l=lca(node.left,p,q);
		TreeNode r=lca(node.right,p,q);
		if(l!=null && r!=null)return node;
		return (l!=null)?l:r;
	}
	public static void main(String[] args) {
		 TreeNode t1=new TreeNode(3);
		 t1.left=new TreeNode(5);
		 t1.right=new TreeNode(1);
		 t1.left.left=new TreeNode(6);
		 t1.left.right=new TreeNode(2);
		 t1.right.left=new TreeNode(0);
		 t1.right.right=new TreeNode(8);
		 t1.left.right.left=new TreeNode(7);
		 t1.left.right.right=new TreeNode(4);
		 //t1.right.left.right=new TreeNode(9);
       TreeNode p=t1.left;
       TreeNode q= t1.left.right.right;
		System.out.print(lca(t1,p,q).data);
		 
	 }
}
