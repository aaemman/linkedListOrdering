
public class Node {
	
	int val;
	Node next;
		
	public Node(){
		
	}
	public Node(int i) {
		// TODO Auto-generated constructor stub
		this.val = i;
	}


	public int getVal() {
		return val;
	}
	
	
	public void setVal(int val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return  val + "-> ";
	}

}
