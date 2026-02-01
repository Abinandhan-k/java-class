package trees;
import java.util.*;
public class Printkthsmallest {
	static TreeNode build(int arr[],int l,int r) {
		if(l>r) return null;
		int mid=(l+r)/2;
		TreeNode node=new TreeNode(arr[mid]);
		node.left=build(arr,l,mid-1);
		node.right=build(arr,mid+1,r);
		return node;
	}
	static TreeNode insert(int data,TreeNode node) {
		if(node==null) return new TreeNode(data);
		if(data<node.data) node.left=insert(data,node.left);
		else {
			node.right=insert(data,node.right);
		}
		return node;
	}static int count,ans;
	static int ksmall(TreeNode node,int k) {
		count=k;
		inorder(node);
		return ans;
	}
	static void inorder(TreeNode node) {
		if(node==null) return;
		inorder(node.left);
		 count--;
		 if(count==0) {
			 ans=node.data;
			 return;
		 }
		 inorder(node.right);
	}
	public static void main(String[] args) {
		Scanner ah=new Scanner(System.in);
	    int k=ah.nextInt();
	    int arr[]= {5,10,11,20,25,30,31,40,50,57};
	    TreeNode t1=build(arr,0,arr.length-1);
	    System.out.print(ksmall(t1,k));
	}
}
