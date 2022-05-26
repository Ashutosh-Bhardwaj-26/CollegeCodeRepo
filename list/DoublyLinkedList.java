package list;

public class DoublyLinkedList {
	Node head;
	
	public void push(int new_data)
	{
	    /* 1. allocate node
	    * 2. put in the data */
	    Node new_Node = new Node(new_data);
	 
	    /* 3. Make next of new node as head and previous as NULL */
	    new_Node.next = head;
	    new_Node.prev = null;
	 
	    /* 4. change prev of head node to new node */
	    if (head != null)
	        head.prev = new_Node;
	 
	    /* 5. move the head to point to the new node */
	    head = new_Node;
	}
	
    void append(int new_data)
    {
        /* 1. allocate node
        * 2. put in the data */
        Node new_node = new Node(new_data);
 
        Node last = head; /* used in step 5*/
 
        /* 3. This new node is going to be the last node, so
        * make next of it as NULL*/
        new_node.next = null;
 
        /* 4. If the Linked List is empty, then make the new
        * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
 
        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
 
        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }
	
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
	

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		    dll.append(6); //at the end
		  
	  
	        dll.push(7); // in the starting
	 
	        
	        dll.push(1);
	 
	        
	        dll.append(4);
	 
	        System.out.println("Created DLL is: ");
	        dll.printlist(dll.head);
		
		

	}

}
