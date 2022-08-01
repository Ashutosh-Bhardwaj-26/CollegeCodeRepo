package tree;

import java.util.*;
import list.Node;

public class Tree {
	static Node root;
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		
		PrintTree p = new PrintTree();
		PrintKthNodes kth = new PrintKthNodes(); 
		Methods s = new Methods();
		
		System.out.println("\t\t\t------Welcome to Tree------");
		System.out.println("Enter total number of element");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			root = createTree(root,sc.nextInt());
		}
		
		//print
		p.inorder(root);
		System.out.println("\n");
		
		//printKthNode
//		System.out.println("Here");
//		kth.PKN(root, 2);
		
		
		//pritn level order
//		System.out.println("\nLevel Order Traversal:-");
//		System.out.print(root.data + "->");
//		p.levelOrder(root);
//		System.out.println("\nLevel Order Queue");
//		p.levelOrderQueue(root);
//		System.out.println("\nLevel With New Line");
//		p.levelWithNewLine(root);
		
		//Size of tree
//		System.out.println("\nSize of tree is:-");
//		System.out.println(s.sizeOfTree(root));
		
		//MAX ELEMENT
//		System.out.println("Max:-");
//		System.out.println(s.maxTree(root));
		
		
		s.leftView(root, 1);
		
		//end
		System.out.println("over");
		
	}

	static Node createTree(Node root, int k) {
		
		// add node in recursive calls
		if (root == null) {
			root = new Node(k);
		}
		
		//for left
		if (k < root.data) {
			root.prev = createTree(root.prev, k);
		} 
		//for right
		else if (k > root.data) {
			root.next = createTree(root.next, k);
		} 
		// value already exist in tree
		else {
			return root;
		}
		
		//after adding return 
		return root;
	}
	

}
