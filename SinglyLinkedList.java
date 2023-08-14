package project;

class SinglyLinkedList {
	Node head;

	SinglyLinkedList(){
		head = null;
	}

	void insert(Node x) {
		//if list is empty
		if(head == null) {
			head=x;
		}

		else {
			Node temp = head ;

			//traverse till the end and then attach the new node
			while(temp.next != null ) {
				temp = temp.next;
			}
			x.next = temp.next;	
			temp.next = x;
		}
	}

	void display(Node head) {
		//if list is empty
		if(head == null) {
			System.out.println();
		}

		else {
			Node temp = head ;

			//traverse till the last node and print details of each node
			while(temp != null ) {
				System.out.println("\tPRODUCT_"+temp.number);
				System.out.println("Name of item: "+temp.item);
				System.out.println("Price: Rs."+temp.price);
				System.out.println("Time required for delivery: "+temp.time+" days");
				System.out.println("Stock left: "+temp.stock);
				System.out.println();
				temp = temp.next;
			}
		}System.out.println();

	}
	void display_discountedDeals(Node head) {
		//if list is empty
		if(head == null) {
			System.out.println();
		}
		else {
			Node temp = head ;

			//traverse till the last node and print details of each node
			while(temp != null ) {
				System.out.println("\tPRODUCT_"+temp.number);
				System.out.println("Name of item: "+temp.item);
				System.out.println("Original Price: Rs. "+temp.or_price);
				System.out.println("Discount: "+temp.discount+" %");
				System.out.println("Discounted Price: Rs. "+temp.price);
				System.out.println("Time required for delivery: "+temp.time+" days");
				System.out.println();
				temp = temp.next;
			}
		}System.out.println();

	}
}
