package tree;

import list.Node;

public class Methods {
	int maxLevel = 0;
	
	//size of binary tree
	int sizeOfTree(Node root) {
		//int x = 0;
		if(root == null) return 0;
		return 1 + sizeOfTree(root.prev) + sizeOfTree(root.next);
		//return x; 
	}
	
	//maximum of tree
	//in bianry tree simply print the right most element
	int maxTree(Node root) {
		if(root == null) return 0;
		return Math.max(root.data, Math.max(maxTree(root.prev), maxTree(root.next))) ;
	}
	
	
	//left View Of Binary Tree
	void leftView(Node root, int level) {
		if(root == null) return;
		if(maxLevel<level) {
			System.out.print(root.data + "->");
			maxLevel = level;
		}
		leftView(root.prev, level +1);	
		leftView(root.next, level +1);
	}
	
	

}
  