package trees;

public class Sumup {
 static int sumnodes(TreeNode node) {
	 if(node==null) return 0;
	 return node.data+sumnodes(node.left)+sumnodes(node.right);
 }
 static int sumleaf(TreeNode node) {
	 if(node==null) return 0;
	 if(node.left==null && node.right==null) return node.data;
	 return sumleaf(node.left)+sumleaf(node.right);
 }
 static int sumnonleaf(TreeNode node) {
	 if(node==null) return 0;
	 if(node.left==null & node.right==null) return 0;
	 return node.data+sumnonleaf(node.left)+sumnonleaf(node.right);
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
			 t1.left.left.left=new TreeNode(11);

			// System.out.println(noofnodes(t1));
			// System.out.println(nooflfnodes(t1));
			 System.out.println(sumnodes(t1));
			 System.out.println(sumleaf(t1));
			 System.out.println(sumnonleaf(t1));

	}

}
