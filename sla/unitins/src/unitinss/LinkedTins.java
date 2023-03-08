package unitinss;

public class LinkedTins <T>{

	Node<T> head = null;
	int size = 0;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return size;
	}
	
	public void add(T newElement) {
		
		Node<T> newNode = new Node<T>(newElement);
		
		if (isEmpty()) {
			head = newNode;
			size++;
			return;
		}
		Node<T> aux = head;
		
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		
		aux.setNext(newNode);
		size++;
		
	}
	
	public void add(int position, T newElement) {
		if (position<0 || position > size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		size++;
		Node<T> newNode = new Node<T>(newElement);
		if (position == 0) {
			newNode.setNext(head);
			head = newNode;
			return;
		}
		if (position == size) {
			Node<T> last = getNode(size()-1);
			last.setNext(newNode);
			return;
		}
		Node<T> previous = getNode(position-1);
		newNode.setNext(previous.getNext());
		previous.setNext(newNode);
		
	}
	
	public Node<T> getElement(int position){
		if (position<0 || position >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<T> aux = head;
		for(int i=0; i<position;i++) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	public void remove() {
		
	}
	
	private Node<T> getNode(int position){
		
		Node<T> aux = head;
		for(int i=0; i<position;i++) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	public T get (int position) {
		if (position<0 || position >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<T> aux = head;
		for(int i=0; i<position;i++) {
			aux = aux.getNext();
		}
		return aux.getData();
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return null;
		}
		Node<T> aux = head;
		String s = "[ ";
		
		while(aux != null) {
			if(aux.getData() != null) {
				s += aux.getData().toString() + ",";
			}
			else {
				s += aux.getData().toString();
			}
			aux = aux.getNext();
			
		}
		
		s += " ]";
		
		return s;
	}
	
	
	
}
