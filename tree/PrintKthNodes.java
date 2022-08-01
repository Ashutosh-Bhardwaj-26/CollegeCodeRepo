package tree;
import list.Node;

public class PrintKthNodes {

	void PKN(Node root, int k) {
		if(root==null){
			return;
		}
		if(k==0){
			System.out.println(root.data);
		}
		PKN(root.prev,k--);
		PKN(root.next,k--);
	}
}
