package trees;

import java.util.Scanner;

public class buildTReeFROMSORTarray {
//	static TreeNode buildsortarr(int[] arr) {
//	return build(arr,arr.length-1) ;
//	}
	static void pre(TreeNode node) {
		 if(node == null) return;
		 System.out.print(node.data+" ");
		 pre(node.left);
		 pre(node.right);
		
		}
	static void inorder(TreeNode node) {
		 if(node == null) return;
		 inorder(node.left);
		 System.out.print(node.data);
		 inorder(node.right);
		}
	static TreeNode build(int arr[],int l,int r) {
		if(l>r) return null;
		int mid=(l+r)/2;
		TreeNode node=new TreeNode(arr[mid]);
		node.left=build(arr,l,mid-1);
		node.right=build(arr,mid+1,r);
		return node;
	}
public static void main(String[] args) {
	int arr[]= {5,10,11,20,25,30,31,40,50,57}; 
	//Scanner ah=new Scanner(System.in);
		  // int n=ah.nextInt();
		 //  int arr[]=new int[n];
		  // for(char i=0;i<arr.length;i++) {
		        //arr[i]=ah.nextInt();
		  //  }
		   // TreeNode t1=null;
		  //  for(int i:arr) {
		   //   t1=insert(i,t1);
		  //  }
		  //  String a=serialise(t1);
		  //  TreeNode t2=deserialize(a);
		   // System.out.print(a);
		    
		      TreeNode t2=build(arr,0,arr.length-1);
		      pre(t2);
		}
}

