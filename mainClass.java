
public class mainClass {

	/**
	 * @param args
	 */
	static Node head = new Node(2);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		head.setNext(new Node(4));
		head.getNext().setNext(new Node(5));
		head.getNext().getNext().setNext(new Node(6));
		head.getNext().getNext().getNext().setNext(new Node(3));
		
		sortList(head);
		printList(head);
	}	

	private static void printList(Node head2) {
		// TODO Auto-generated method stub
		while (head2 != null){
			System.out.print(head2);
			head2= head2.getNext();
		}
	}

	static void sortList(Node curr){
		if(curr.getNext().getVal() <  curr.getVal()){
			Node temp = curr.getNext();
			curr.setNext(curr.getNext().getNext());
			temp.setNext(head);
			head = temp;
			curr = head;
		}

		if(curr.getNext() == null){
			return;
		}
		if(curr.getNext().getVal() >  curr.getVal()){
			
			sortList(curr.getNext());
			return;
		}
System.out.println();
	}

}
