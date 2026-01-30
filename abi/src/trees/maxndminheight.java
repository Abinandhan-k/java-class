package trees;

public class maxndminheight {
	static int maxheight(TreeNode node) {
		if(node==null)return 0;
		return 1+Math.max(maxheight(node.left),maxheight(node.right));
	}
    static int minheight(TreeNode node) {
    	if(node==null) return 0;
    	if(node.left==null && node.right==null) return 1;
    	if(node.left==null) return 1+minheight(node.right);
    	if(node.right==null)return 1+minheight(node.left);
    	return 1+Math.min(minheight(node.left),minheight(node.right));
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


			 System.out.println(maxheight(t1));
			 System.out.println(minheight(t1));


	}

}
