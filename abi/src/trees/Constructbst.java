package trees;
import java.util.*;
//************dfs traversal note it;// **********
public class Constructbst {
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}
		static void levelbylevelorder(TreeNode node) {
			if(node==null) return;
			Queue<TreeNode> queue=new LinkedList<>();
			queue.add(node);
			
			while(!queue.isEmpty()) {
				int count=queue.size();
				for(int i=0;i<count;i++) {
				TreeNode curr=queue.poll();
				System.out.print(curr.data);
				if(curr.left!=null) {
					queue.add(curr.left);
				}
				if(curr.right!=null) {
					queue.add(curr.right);
				}
				}
				System.out.println();
			}
		}
		static void inorder(TreeNode node) {
		 if(node == null) return;
		 inorder(node.left);
		 System.out.print(node.data);
		 inorder(node.right);
		}
		static void pre(TreeNode node) {
			 if(node == null) return;
			 System.out.print(node.data);
			 pre(node.left);
			 pre(node.right);
			
			}
		static void post(TreeNode node) {
			 if(node == null) return;
			 post(node.left);
			 post(node.right);
			 System.out.print(node.data);
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
	 System.out.println(" in\n");
	 inorder(t1);
	 System.out.println("\n pre\n");
	 pre(t1);
	 System.out.println("\n post\n");
	 post(t1);
	 //System.out.println(" \nlvl");
	 //levelbylevelorder(t1);
	 
 }
}
