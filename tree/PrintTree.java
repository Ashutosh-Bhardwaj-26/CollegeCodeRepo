package tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

import list.Node;

public class PrintTree {
	
	//inorder
	void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.prev);
		System.out.print(root.data + "->");
		inorder(root.next);
	}
	
	//postorder
	void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.prev);
		postorder(root.next);
		System.out.print(root.data + "->");
	}
	
	//preorder
	void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data + "->");
		preorder(root.prev);
		preorder(root.next);
	}
	
	//levelorder
	void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		if(root.prev != null) {
			System.out.print(root.prev.data + "->"); 
		}	
		if(root.next != null) {
			System.out.print(root.next.data + "->");
		}
		levelOrder(root.prev);
		levelOrder(root.next);
	}
	
	//level order with queue
	void levelOrderQueue(Node root) {
		if(root == null) return;
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		System.out.print(root.data + "->");
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.prev != null) {
				System.out.print(cur.prev.data + "->");
				q.add(cur.prev);
			}
			if(cur.next != null) {
				System.out.print(cur.next.data + "->");
				q.add(cur.next);
			}
		}
	}
	
	//Level Order with new Line imp
	void levelWithNewLine(Node root) {
		if(root==null) return;
		Queue<Node> q = new LinkedList<Node>();
		System.out.print(root.data + "->\n");
		q.add(root);
		q.add(null);
		while(q.size()>1) {
			Node cur = q.poll();
			if(cur == null) {
				System.out.print("\n");
				q.add(null);
				continue;
			}
			if(cur.prev != null) {
				System.out.print(cur.prev.data + "->");
				q.add(cur.prev);
			}
			if(cur.next != null) {
				System.out.print(cur.next.data + "->");
				q.add(cur.next);
			}	
		}
		
	}
	
}
