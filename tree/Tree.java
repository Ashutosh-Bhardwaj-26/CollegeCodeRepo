package tree;
import java.util.*;
import list.Node;

public class Tree {
	
	public static void main(String args[]) {
			Node root = createTree();

			inorder(root);
		
		
	}
	static void inorder(Node root) {
		if(root==null)return;
		inorder(root.prev);
		System.out.println(root.data);
		inorder(root.next);
	}
	static Node createTree() {
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data ");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
		root = new Node(data);
		System.out.println("Enter data for left child");
		root.prev = createTree();
		
		System.out.println("Enter data for right child");
		root.next = createTree();
	
		return root;	
	}
}
