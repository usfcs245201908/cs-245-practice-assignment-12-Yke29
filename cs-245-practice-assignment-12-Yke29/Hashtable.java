public class Hashtable
{
	Node head;
	int size;
	public Hashtable() {
		head = null;
		size = 0;
	}

	public boolean containsKey(String key) {
		if (size == 0) {
		// there's nothing in the table
			return false;
		}
		Node current = head;
		while (!(current.k).equals(key) && current!=null) {
		// stops if key is found or reaches the end
			current = current.next;
		}
		if (current != null) {
		// reaches the end
			return true;
		}
		return false;
	}

	public String get(String key) {
		if (size == 0) {
			return null;
		}
		Node current = head;
		while (!(current.k).equals(key) && current!=null) {
		// stops if key is found or reaches the end\
			current = current.next;
		}
		if (current != null) {
			return current.v;
		}
		return null;
	}

	public void put(String key, String value) {
		if (size == 0) {
			head = new Node(key, value);
		}
		else {
			Node temp = new Node(key, value);
			temp.next = head;
			head = temp;
			// put temp before head
		}
		size++;
	}

	public String remove(String key) {
		String temp;
		if (size == 0) {
		// nothing in table
			return null;
		}
		if (size == 1) {
		// only one element in table
			temp = head.v;
			head = null;
		}
		else {
			Node current = head;
			while (!(current.next.k).equals(key) && current.next!=null) {
			// stops if key is found the next of current or reaches the end
				current = current.next;
			}
			if (current.next == null) {
				return null;
			}
			temp = current.next.v;
		}
		size--;
		return temp;
	}
}