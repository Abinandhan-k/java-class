package trees;

public class Countnoofnodes {
	static int noofnodes(TreeNode node) {
		if(node==null) return 0;
		return 1+noofnodes(node.left)+noofnodes(node.right);
	}
	static int nooflfnodes(TreeNode node) {
		if(node==null) return 0;
		if(node.right==null & node.left==null) return 1;
		return nooflfnodes(node.left)+nooflfnodes(node.right);
	}
	static int noofnonlfnodes(TreeNode node) {
		if (node==null) return 0;
		if(node.left==null &node.right== null) return 0;
		return 1+noofnonlfnodes(node.left)+noofnonlfnodes(node.right);	
	}
	public static void main(String[] args) {
		/* Scanner ah=new Scanner(System.in);
		 int n=ah.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=ah.nextInt();
		 }*/
		 TreeNode t1=new TreeNode(1);
		 t1.left=new TreeNode(2);
		 t1.right=new TreeNode(3);
		 t1.left.left=new TreeNode(4);
		 t1.left.right=new TreeNode(5);
		 t1.right.right=new TreeNode(6);
		 System.out.println(noofnodes(t1));
		 System.out.println(nooflfnodes(t1));
		 System.out.println(noofnonlfnodes(t1));
	 }
	}